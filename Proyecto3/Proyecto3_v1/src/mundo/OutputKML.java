package mundo;

import java.io.*;
import java.util.Map;

import estructuras.GrafoDirigido;
import estructuras.Vertice;

public class OutputKML 
{
	
	    /**
	     * Constante que establece la ubicación del archivo kml que se produce al calcular la
	     * ruta entre dos puntos del grafo
	     */
	    private static final String OUTPUT_FILE = "./data/output.kml";

	    /**
	     * Constructor principal de la clase, esta se encuentra encargada de realizar la
	     * inicialización y carga de los archivos de descripción de la representación de
	     * grafo de la malla vial Bogotana.
	     */
	    private CCT c;
	    public  OutputKML()
	    {
	    	c = new CCT();
	    }
	    /**
	     * Basándose en los dos componentes de una dirección (<i>e.g.,</i> Calle y Carrera),
	     * retorna la información completa del nodo que representa la intersección entre ambas vías.
	     *
	     * @param addrMain Primer componente de la dirección a buscar. Este debe cumplir con la
	     * nomenclatura de nombres estándar dispuesta por el sistema de direcciones de Bogotá.
	     * @param addrSec Primer componente de la dirección a buscar. Este debe cumplir con la
	     * nomenclatura de nombres estándar dispuesta por el sistema de direcciones de Bogotá.
	     * @return Una cadena que contiene la información del nodo que representa la dirección
	     *         solicitada, en caso de que el nodo no exista, null.
	     */
	    public String findAddress(String addrMain, String addrSec)
	    {
	    	GrafoDirigido gd = c.devolverGrafo();
	    	Vertice v = gd.obtenerVertice(llave);
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
	     * estándar de las vías del sistema.
	     * <p>
	     * <b>Para obtener mayor información:</b>
	     * Consultar la definición y descripción de la <a href="http://www.ideca.gov.co/sites/default/files/files/Proyectos/MR/EI%20-%20Cat%C3%A1logo%20de%20Objetos%20MR%20V4_9_2015.pdf">Definición Malla Vial Integral</a> de Bogotá, Página 46.
	     *
	     * @return Conjunto que contiene las abreviaturas que representan la nomenclatura estándar.
	     */
	    public Set<String> getNomenclatureAbbr()
	    {
	        return definitions.keySet();
	    }

	    /**
	     * Retorna el conjunto de abreviaturas y significados que representan la nomenclatura estándar de las vías del sistema.
	     * <p>
	     * <b>Para obtener mayor información:</b>
	     * Consultar la definición y descripción de la <a href="http://www.ideca.gov.co/sites/default/files/files/Proyectos/MR/EI%20-%20Cat%C3%A1logo%20de%20Objetos%20MR%20V4_9_2015.pdf">Definición Malla Vial Integral</a> de Bogotá, Página 46.
	     *
	     * @return Diccionario que contiene las abreviaturas y significados de la nomenclatura estándar.
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

	        //Complete este método según la documentación
	        getShortestPathFile(idSource, idDestination);
	    }

	    /**
	     * Escribe el archivo kml de salida con la información de la ruta más corta del nodo idSource al nodo idDestination
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
	        pw.println("    <name>Ruta más corta</name>");
	        pw.println("    <Placemark>");
	        pw.println("      <name>Ruta más corta</name>");
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
	     *  Rutina que permite realizar la descompresión de un contenedor tar.bz2. Durante el
	     *  proceso de descompresión, la rutina informa al usuario en consola, además
	     *  del nombre del archivo actual, el progreso de la operación. La rutina de-
	     *  tiene la ejecución del programa si ocurre algún error.
	     *  @param path La ubicación del archivo tar.bz2 a ser descomprimido.
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
