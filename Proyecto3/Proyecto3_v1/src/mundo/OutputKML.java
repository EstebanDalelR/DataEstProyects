package mundo;

import java.io.*;
import java.util.Map;

import estructuras.GrafoDirigido;

public class OutputKML {
	

	    /**
	     * Constante que establece la ubicaci�n del archivo comprimido inicial.
	     */
	    private final static String COMPRESSED_USER_DATA = "./data/data.tar.bz2";

	    /**
	     * Constante que establece la ubicaci�n del archivo que contiene la nomenclatura
	     * principal de las v�as de Bogot�.
	     */
	    private final static String DEFINITIONS_FILE = "./data/definitions.csv";

	    /**
	     * Constante que establece la ubicaci�n del archivo que contiene la descripci�n de
	     * los nodos que componen la malla vial de la ciudad.
	     */
	    private final static String NODES_FILE = "./data/nodes.csv";

	    /**
	     * Constante que establece la ubicaci�n del archivo que contiene el conjunto de nodos
	     * que conforman cada arteria vial de la ciudad.
	     */
	    private final static String NAMES_FILE = "./data/names.csv";

	    /**
	     * Constante que establece la ubicaci�n del archivo que contiene la descripci�n de cada
	     * arco que conforma un segmento de v�a.
	     */
	    private final static String EDGES_FILE = "./data/edges.csv";

	    /**
	     * Constante que establece la ubicaci�n del archivo kml que se produce al calcular la
	     * ruta entre dos puntos del grafo
	     */
	    private static final String OUTPUT_FILE = "./data/output.kml";

	    /**
	     * Instancia del grafo que contiene y abstrae la malla vial de la ciudad de Bogot�.
	     */
	    private GrafoDirigido graph;

	    /**
	     * Diccionario que establece una relaci�n entre una abreviatura nominal y su significado
	     * correspondiente en la nomenclatura est�ndar de la ciudad.
	     */
	    private Map<String, String> definitions;


	    /**
	     * Constructor principal de la clase, esta se encuentra encargada de realizar la
	     * inicializaci�n y carga de los archivos de descripci�n de la representaci�n de
	     * grafo de la malla vial Bogotana.
	     */
	    public  OutputKML()
	    {
	        graph = new GrafoDirigido();
	        definitions = new HashMap<String, String>();

	        File f = new File(COMPRESSED_USER_DATA);
	        if(f.exists())
	        {
	            uncompressTarBzip(COMPRESSED_USER_DATA);
	            f.delete();
	        }

	        try(BufferedReader br = new BufferedReader(new FileReader(DEFINITIONS_FILE)))
	        {
	            String line;
	            br.readLine();
	            while((line = br.readLine()) != null)
	            {
	                String[] values = line.split(",");
	                definitions.put(values[0], values[1]);
	            }
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }

	        try(BufferedReader br = new BufferedReader(new FileReader(NODES_FILE)))
	        {
	            String line;
	            br.readLine();
	            while((line = br.readLine()) != null)
	            {
	                String[] values = line.split(",");
	                int id = Integer.parseInt(values[0]);
	                double latitude = Double.parseDouble(values[1]);
	                double longitude = Double.parseDouble(values[2]);
	                graph.addNode(id, latitude, longitude);
	            }
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }

	        try(BufferedReader br = new BufferedReader(new FileReader(NAMES_FILE)))
	        {
	            String line;
	            br.readLine();
	            while((line = br.readLine()) != null)
	            {
	                String[] values = line.split(",");
	                int id = Integer.parseInt(values[0]);
	                try
	                {
	                    graph.addName(id, values[1]);
	                }
	                catch(ArrayIndexOutOfBoundsException a)
	                {
	                    graph.addName(id, "");
	                }
	            }
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }

	        try(BufferedReader br = new BufferedReader(new FileReader(EDGES_FILE)))
	        {
	            String line;
	            br.readLine();
	            while((line = br.readLine()) != null)
	            {
	                String[] values = line.split(",");
	                int from = Integer.parseInt(values[0]);
	                int to = Integer.parseInt(values[1]);
	                double distance = Double.parseDouble(values[2]);
	                graph.addEdge(from, to, distance);
	            }
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	    }

	    /**
	     * Bas�ndose en los dos componentes de una direcci�n (<i>e.g.,</i> Calle y Carrera),
	     * retorna la informaci�n completa del nodo que representa la intersecci�n entre ambas v�as.
	     *
	     * @param addrMain Primer componente de la direcci�n a buscar. Este debe cumplir con la
	     * nomenclatura de nombres est�ndar dispuesta por el sistema de direcciones de Bogot�.
	     * @param addrSec Primer componente de la direcci�n a buscar. Este debe cumplir con la
	     * nomenclatura de nombres est�ndar dispuesta por el sistema de direcciones de Bogot�.
	     * @return Una cadena que contiene la informaci�n del nodo que representa la direcci�n
	     *         solicitada, en caso de que el nodo no exista, null.
	     */
	    public String findAddress(String addrMain, String addrSec)
	    {
	        int id = graph.searchAddress(addrMain, addrSec);
	        if(id >= 0)
	        {
	            return graph.getMapNode(id).toString();
	        }
	        return null;
	    }

	    public int findAddressId(String addrMain, String addrSec) {
	        return graph.searchAddress(addrMain, addrSec);
	    }

	    /**
	     * Retorna el conjunto de abreviaturas nominales que representan la nomenclatura
	     * est�ndar de las v�as del sistema.
	     * <p>
	     * <b>Para obtener mayor informaci�n:</b>
	     * Consultar la definici�n y descripci�n de la <a href="http://www.ideca.gov.co/sites/default/files/files/Proyectos/MR/EI%20-%20Cat%C3%A1logo%20de%20Objetos%20MR%20V4_9_2015.pdf">Definici�n Malla Vial Integral</a> de Bogot�, P�gina 46.
	     *
	     * @return Conjunto que contiene las abreviaturas que representan la nomenclatura est�ndar.
	     */
	    public Set<String> getNomenclatureAbbr()
	    {
	        return definitions.keySet();
	    }

	    /**
	     * Retorna el conjunto de abreviaturas y significados que representan la nomenclatura est�ndar de las v�as del sistema.
	     * <p>
	     * <b>Para obtener mayor informaci�n:</b>
	     * Consultar la definici�n y descripci�n de la <a href="http://www.ideca.gov.co/sites/default/files/files/Proyectos/MR/EI%20-%20Cat%C3%A1logo%20de%20Objetos%20MR%20V4_9_2015.pdf">Definici�n Malla Vial Integral</a> de Bogot�, P�gina 46.
	     *
	     * @return Diccionario que contiene las abreviaturas y significados de la nomenclatura est�ndar.
	     */
	    public Map<String, String> getNomenclature()
	    {
	        return definitions;
	    }

	    /**
	     * Retorna una estructura iterable de Strings con las direcciones para ir del nodo idSource al nodo idDestination
	     * @param idSource int El identificador de la fuente
	     * @param idDestination int El identificador del destino
	     * @return resp Una estrucutra iterable con las direcciones
	     */
	    public Iterable<String> getShortestPath(int idSource, int idDestination)
	    {

	        //Complete este m�todo seg�n la documentaci�n
	        getShortestPathFile(idSource, idDestination);
	    }

	    /**
	     * Escribe el archivo kml de salida con la informaci�n de la ruta m�s corta del nodo idSource al nodo idDestination
	     * Este archivo se puede importar a google maps para visualizar la ruta
	     * @param idSource int El identificador de la fuente
	     * @param idDestination int El identificador del destino
	     */
	    private void getShortestPathFile(int idSource, int idDestination)  {
	        File f = new File(OUTPUT_FILE);
	        try {

	            if(!f.exists()) {
	                f.createNewFile();
	            }

	            FileWriter fw = new FileWriter(f);
	            PrintWriter pw = new PrintWriter(fw);

	            writeKMLHeader(pw);
	            MapDijkstraSP mapDijkstraSP = new MapDijkstraSP(graph, idSource, idDestination);
	            LinkedList<MapEdge> path = mapDijkstraSP.pathTo();
	            path.forEach(mapEdge -> {
	                pw.println("        " + graph.getMapNode(mapEdge.from).gPosition.longitude + ", " + graph.getMapNode(mapEdge.from).gPosition.latitude);

	            });
	            pw.println("        " + graph.getMapNode(idDestination).gPosition.longitude + ", " + graph.getMapNode(idDestination).gPosition.latitude);
	            writeKMLFooter(pw);
	            fw.flush();
	            fw.close();


	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    /**
	     * Escribe el encabezado de un archivo kml
	     * @param pw El PrintWriter que escribe al archivo
	     * @throws IOException En caso de que haya un error a la hora de escribir en el archivo
	     */
	    private void writeKMLHeader(PrintWriter pw) throws IOException
	    {

	        pw.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
	        pw.println("<kml xmlns=\"http://www.opengis.net/kml/2.2\">");
	        pw.println("  <Document>");
	        pw.println("    <name>Ruta m�s corta</name>");
	        pw.println("    <Placemark>");
	        pw.println("      <name>Ruta m�s corta</name>");
	        pw.println("      <LineString>");
	        pw.println("      <altitudeMode>absolute</altitudeMode>");
	        pw.println("      <coordinates>");
	    }

	    /**
	     * Escribe el pie de pagina de un archivo kml
	     * @param pw El PrintWriter que escribe al archivo
	     * @throws IOException En caso de que haya un error a la hora de escribir en el archivo
	     */
	    private void writeKMLFooter(PrintWriter pw) throws IOException
	    {
	        pw.println("      </coordinates>");
	        pw.println("      </LineString>");
	        pw.println("    </Placemark>");
	        pw.println("  </Document>");
	        pw.println("</kml>");

	    }


	    /**
	     *  Rutina que permite realizar la descompresi�n de un contenedor tar.bz2. Durante el
	     *  proceso de descompresi�n, la rutina informa al usuario en consola, adem�s
	     *  del nombre del archivo actual, el progreso de la operaci�n. La rutina de-
	     *  tiene la ejecuci�n del programa si ocurre alg�n error.
	     *  @param path La ubicaci�n del archivo tar.bz2 a ser descomprimido.
	     **/
	    /*private void uncompressTarBzip(String path)
	    {
	        String anim= "|/-\\";
	        int buffersize = 1024;
	        try(TarArchiveInputStream is = new TarArchiveInputStream(new BZip2CompressorInputStream(new FileInputStream(path))))
	        {
	            TarArchiveEntry entry;
	            while((entry = is.getNextTarEntry()) != null)
	            {
	                int offset = 0;
	                final byte[] buffer = new byte[buffersize];
	                FileOutputStream fout = new FileOutputStream("./data/"+entry.getName());
	                System.out.println(entry.getName());
	                int size = 0;
	                int n = 0;
	                long total = entry.getSize();
	                while (-1 != (n = is.read(buffer)))
	                {
	                    double x = ((size*1.0)/total)*100.0;
	                    String progress = "\r" + anim.charAt(((int) Math.round(x)) % anim.length()) + " " + Math.round(x) + "% " + String.format("(%d / %d)", size, total) ;
	                    System.out.write(progress.getBytes());
	                    size += n;
	                    fout.write(buffer, 0, n);
	                }
	                System.out.println();
	                fout.close();
	            }
	        }
	        catch(Exception e)
	        {
	            e.printStackTrace();
	        }
	    }*/
}
