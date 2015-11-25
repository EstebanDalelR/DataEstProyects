package mundo;

import estructuras.Arco;
import estructuras.Dijkstra;
import estructuras.Lista;
import estructuras.Vertice;

public class ParteA {
	
	private Vertice<llave, valor> origen;
	private Vertice<llave, valor> meta;
	
	public ParteA(int id, double latitud, double longitud, boolean centro){
		new CentroAcopio(id, latitud, longitud, centro);
		/**
         * TODO Instanciar el calculador de rutas por latitud y longitud
         */
		
	}

    public void calcularRutaPorDistancia() {
    	
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
        Lista<Arco> retornar = Dijkstra.dijkstraTiempo(origen,meta);
         long tTotalConsultaClientes = System.nanoTime() - tInicioCalculoRuta; 
        System.out.println("tiempo Consulta Clientes: " + tTotalConsultaClientes + " nseg");


        /**TODO Mostrar la distancia de la ruta más corta o retornar una excepción en caso de no poder encontrarlo */

    }
    
    public void exportarUltimaRutaCalculada(){
    	long tInicioExportar = System.nanoTime();
        /**TODO Requerimiento 2: Exportar en un archivo de tipo JSON/KML de la respuesta del 
         * requerimiento R1 (en caso de existir) para poderse mostrar en Google Maps
        * Recibe un mensaje de éxito o de error
         */
    	getShortestPathFile(origen,meta);
        long tTotalRuta = System.nanoTime() - tInicioExportar; 
        System.out.println("tiempo creacion ruta: " + tTotalRuta + " nseg");


        /**TODO Mostrar el resultado de la exportación */
    }
}