package mundo;

import java.util.Scanner;

import estructuras.Arco;
import estructuras.Dijkstra;
import estructuras.GrafoDirigido;
import estructuras.Lista;
import estructuras.TablaHash;
import estructuras.Vertice;

public class ParteC
{
	private Dijkstra d;
	private CCT c;
    private OutputKML ok;
    private int i1;
    private int i2;
	public ParteC(){
		/**
         * TODO Instanciar el calculador de rutas por latitud y longitud
         */
		d = new Dijkstra();
		c = new CCT();
		ok = new OutputKML();
	}

    public void calcularRutaPorPrecio() {
  
         long tInicioCalculoRuta = System.nanoTime();
         /**TODO Requerimiento 1: Encontrar la ruta más barata (por precio) entre dos centros de acopio
          * (destino y origen) dadas: 
          * la latitud y longitud o calle y carrera del punto de origen 
          * radio de un espacio circular para el punto de origen (km)
          * la latitud y longitud o calle y carrera del punto de destino
          * radio de un espacio circular para el punto de destino (km)
          * Se obtiene un objeto iterable que contenga los arcos que integran la ruta mas corta para los
          * puntos dados
          */
         String respuesta = "";
         System.out.println("Inserte calle y carrera del origen");
         Scanner in = new Scanner(System.in);
         String orig = in.nextLine();
         GrafoDirigido gd = c.devolverGrafo();
         TablaHash n = gd.devolverNombres();
         System.out.println("Inserte calle y carrera del destino");
         String dest = in.nextLine();
         String s1 = (String) n.buscarPorValor(orig);
         System.out.println("Inserte radio de busqueda");
         String radio = in.nextLine();
         if(s1==null)
         {
        	 respuesta = "Verifique la direccion del origen e intente de nuevo";
         }
         String s2 = (String) n.buscarPorValor(dest);
         if(s2==null)
         {
        	 respuesta = "Verifique la direccion del destino e intente de nuevo";
         }
         i1 = Integer.valueOf(s1);
         i2 = Integer.valueOf(s2);
         Vertice origen = (Vertice) gd.obtenerVertice(i1);
         Vertice destino = (Vertice) gd.obtenerVertice(i2);
         Lista r = d.dijkstra(origen, destino,d.menorTiempo);
         Arco[] o = (Arco[]) r.darElementos();
         double precio = 0;
         for(int i = 0; i < o.length; i++)
         {
        	 Arco a = o[i];
        	 double tiempo = ((double)a.getValor()*1000)/(double)a.getValor2();
        	 //60*25 es el precio que cuesta una hora de viaje
        	 double p = tiempo*60*25;
        	 //Debido a que la distancia esta en metros, se multiplica por 1000 para que quede en kilometros
        	 precio += ((double)a.getValor()*1000 * 120) + p;
        	 Vertice v = a.getOrigen();
        	 System.out.println(v);
         }
         if(precio > 0)
         {
        	 respuesta = "El precio de viaje es de: $" + precio;
         }
         else
         {
        	 try 
        	 {
				throw new Exception("No se pudo hallar la ruta");
			 } 
        	 catch (Exception e) 
        	 {
				// TODO Auto-generated catch block
				e.printStackTrace();
			 }
         }
         
          long tTotalConsultaClientes = System.nanoTime() - tInicioCalculoRuta; 
         System.out.println("tiempo Consulta Clientes: " + tTotalConsultaClientes + " nseg");


         /**TODO Mostrar el precio de la ruta más barata o retornar una excepción en caso de no poder encontrarlo */
     
    }
    
    public void exportarUltimaRutaCalculada(){
    	long tInicioExportar = System.nanoTime();
        /**TODO Requerimiento 2: Exportar en un archivo de tipo JSON/KML de la respuesta del 
         * requerimiento R1 para las partes A, B y C (en caso de existir) para poderse mostrar en Google Maps
        * Recibe un mensaje de éxito o de error
         */
        long tTotalRuta = System.nanoTime() - tInicioExportar; 
        System.out.println("tiempo creacion ruta: " + tTotalRuta + " nseg");


        /**TODO Mostrar el resultado de la exportación */
    }
}
