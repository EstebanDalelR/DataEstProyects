package mundo;

import java.util.Scanner;

import estructuras.Arco;
import estructuras.Dijkstra;
import estructuras.GrafoDirigido;
import estructuras.Lista;
import estructuras.TablaHash;
import estructuras.Vertice;

public class ParteA {

	private Dijkstra d;
	private CCT c;
	private OutputKML ok;
	private int i1;
	private int i2;
	public ParteA(){
		/**
		 * TODO Instanciar el calculador de rutas por latitud y longitud
		 */
		d = new Dijkstra();
		c = new CCT();
		ok = new OutputKML();
	}

	public void calcularRutaPorDistancia(){

		long tInicioCalculoRuta = System.nanoTime();
		/**TODO Requerimiento 1: Encontrar la ruta más corta en distancia entre dos centros de acopio 
		 * (destino y origen) dadas: 
		 * la latitud y longitud del punto de origen 
		 * radio de un espacio circular para el punto de origen (km)
		 * la latitud y longitud del punto de destino
		 * radio de un espacio circular para el punto de destino (km)
		 * Se obtiene un objeto iterable que contenga los arcos que integran la ruta mas corta para los
		 * puntos dados
		 */
		//NO SE TOMA EN CUENTA LA DISTANCIA RADIAL
		//se puede hacer un DFS dentro del radio a buscar
		//se detiene en el borde
		String respuesta = "";
		System.out.println("Inserte calle y carrera del origen");
		Scanner in = new Scanner(System.in);
		String orig = in.nextLine();
		GrafoDirigido grafoDir = c.devolverGrafo();
		TablaHash tablaHashNombres = grafoDir.devolverNombres();
		System.out.println("Inserte calle y carrera del destino");
		String dest = in.nextLine();
		String s1 = (String) tablaHashNombres.buscarPorValor(orig);
		System.out.println("Inserte Radio de b�squeda");
		String radio = in.nextLine();		
		if(s1==null){
			respuesta = "Verifique la direccion del origen e intente de nuevo";
		}
		
		String s2 = (String) tablaHashNombres.buscarPorValor(dest);
		
		if(s2==null){
			respuesta = "Verifique la direccion del destino e intente de nuevo";
		}
		
		i1 = Integer.valueOf(s1);
		i2 = Integer.valueOf(s2);
		
		Vertice origen = (Vertice) grafoDir.obtenerVertice(i1);
		Vertice destino = (Vertice) grafoDir.obtenerVertice(i2);
		Lista r = d.dijkstra(origen, destino,d.menorDistancia);
		Arco[] o = (Arco[]) r.darElementos();
		
		double distancia = 0;
		
		for(int i = 0; i < o.length; i++){
			Arco a = o[i];
			distancia += (double)a.getValor();
			Vertice v = a.getOrigen();
			System.out.println(v);
		}
		
		if(distancia > 0){
			respuesta = "La distancia de viaje es: " + distancia;
		}
		
		else{
			
			try{
				throw new Exception("No se pudo hallar la ruta");
			} 
			
			catch (Exception e){
				
				e.printStackTrace();
			}
		}
		
		long tTotalConsultaClientes = System.nanoTime() - tInicioCalculoRuta; 
		System.out.println("tiempo Consulta Clientes: " + tTotalConsultaClientes + " nseg");


		/**TODO Mostrar la distancia de la ruta más corta o retornar una excepción en caso de no poder encontrarlo */
        System.out.println(respuesta);
	}

	public void exportarUltimaRutaCalculada(){
		
		long tInicioExportar = System.nanoTime();
		
		/**TODO Requerimiento 2: Exportar en un archivo de tipo JSON/KML de la respuesta del 
		 * requerimiento R1 (en caso de existir) para poderse mostrar en Google Maps
		 * Recibe un mensaje de éxito o de error
		 */
		
		ok.getShortestPath(i1, i2);
		
		long tTotalRuta = System.nanoTime() - tInicioExportar; 
		
		System.out.println("tiempo creacion ruta: " + tTotalRuta + " nseg");

		/**TODO Mostrar el resultado de la exportación */
	}
}