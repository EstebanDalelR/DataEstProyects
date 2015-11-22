package mundo;
import java.io.BufferedReader;
import java.io.FileReader;

import estructuras.Arco;
import estructuras.GrafoDirigido;
import estructuras.TablaHash;
import estructuras.Vertice;

public class CCT 
{
	/**
     * Constante que establece la ubicaci贸n del archivo que contiene la nomenclatura
     * principal de las v铆as de Bogot谩.
     */
    private final static String DEFINITIONS_FILE = "./data/definitions.csv";

    /**
     * Constante que establece la ubicaci贸n del archivo que contiene la descripci贸n de
     * los nodos que componen la malla vial de la ciudad.
     */
    private final static String NODES_FILE = "./data/centros_acopio.csv";

    /**
     * Constante que establece la ubicaci贸n del archivo que contiene el conjunto de nodos
     * que conforman cada arteria vial de la ciudad.
     */
    private final static String NAMES_FILE = "./data/names.csv";

    /**
     * Constante que establece la ubicaci贸n del archivo que contiene la descripci贸n de cada
     * arco que conforma un segmento de v铆a.
     */
    private final static String EDGES_FILE = "./data/arcos.csv";
	
	private GrafoDirigido grafo;
	private TablaHash definiciones;
	
	public CCT()
	{
		grafo = new GrafoDirigido();
		definiciones =new TablaHash();
		
		try(BufferedReader br = new BufferedReader(new FileReader(DEFINITIONS_FILE)))
        {
             String line;
             br.readLine();
             while((line = br.readLine()) != null)
             {
                  String[] values = line.split(",");
                  definiciones.agregar(values[0], values[1]);
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
				CentroAcopio ca = new CentroAcopio(Integer.valueOf(values[0]), Double.valueOf(values[1]), Double.valueOf(values[2]), Boolean.valueOf(values[3]));
				grafo.a馻dirNodo(values[0], ca);
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
				String values[] = line.split(",");
				grafo.a馻dirNombre(values[0], values[1]);
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
				String values[] = line.split(",");
				int orig = Integer.valueOf(values[0]);
				int dest = Integer.valueOf(values[1]);
				double distancia = Double.valueOf(values[2]);
				int velocidad = Integer.valueOf(values[3]);
				
				Vertice origen = (Vertice) grafo.obtenerVertice(orig);
				Vertice destino = (Vertice) grafo.obtenerVertice(dest);
				Arco a = new Arco(origen, destino, distancia, velocidad);
				
				grafo.a馻dirArco(a);
			}
       	 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
	}
	
	public static void main(String[] args)
	{
		CCT prueba = new CCT();
		TablaHash d = prueba.definiciones;
		String valor = (String)d.getValue("AC");
		System.out.println(valor);
	}
}
