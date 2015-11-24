package mundo;

import estructuras.Dijkstra;
import estructuras.Lista;

public class ParteA {
	public final static double AVERAGE_RADIUS_OF_EARTH = 6371;
	
	public ParteA(){
		/**
         * TODO Instanciar el calculador de rutas por latitud y longitud
         */
		
	}
	//private final static int PRECIO_KM= 10;
		public int calculateDistance(double userLat, double userLng,
			 double venueLat, double venueLng) {

			  double latDistance = Math.toRadians(userLat - venueLat);
			  double lngDistance = Math.toRadians(userLng - venueLng);

			  double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
			      + Math.cos(Math.toRadians(userLat)) * Math.cos(Math.toRadians(venueLat))
			      * Math.sin(lngDistance / 2) * Math.sin(lngDistance / 2);

			    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

			    return (int) (Math.round(AVERAGE_RADIUS_OF_EARTH * c));
			}
    public void calcularRutaPorDistancia() {
    	//tiempo= distancia/Velocidad
        //[h]=1000[m]/[Km/h]
    	//distancia=tiempo*velocidad
    	
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
        //llama al dijkstra
        Lista<T> respuesta= estructuras.Dijkstra.dijkstraTiempo(origen,meta);
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
        long tTotalRuta = System.nanoTime() - tInicioExportar; 
        System.out.println("tiempo creacion ruta: " + tTotalRuta + " nseg");


        /**TODO Mostrar el resultado de la exportación */
    }
}