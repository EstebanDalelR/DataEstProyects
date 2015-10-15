package mundo;

public class ParteC{

    public void executeParteCTest() {

        /**
        * TODO Instanciar una Central CCT con informacion de vehiculos, llamadas y datos de unificacion e inicializarla con los datos de los archivos formato JSON de las versiones mas completas y correctas disponibles.
         */

        long tInicioConsultaClientes = System.nanoTime();
        /**TODO Requerimiento 1: Clientes en orden de prioridad. La prioridad tiene en cuenta la prioridad inicial del cliente 
         * y su variacion debido a las llamadas reportadas por cada cliente.
         * Se obtiene un objeto iterable que contenga los clientes ordenados por prioridad, en orden descendente
         */
        long tTotalConsultaClientes = System.nanoTime() - tInicioConsultaClientes; 
        System.out.println("tiempo Consulta Clientes: " + tTotalConsultaClientes + " nseg");


        /**TODO Mostrar el nombre, apellido, identificador y la prioridad de cada cliente */


        long tInicioLlamadasPrioridad = System.nanoTime();
        /**TODO Requerimiento 2: Para cada dia que reporte llamadas, obtener sus llamadas en su orden de prioridad.
	   * La prioridad de una llamada es el promedio entre la prioridad del cliente y la prioridad de la llamada (segun el problema reportado). 
        * Se obtiene un objeto iterable que contenga las llamadas ordenadas por su prioridad , en orden descendente.  
        * Recibe la informacion necesaria de los clientes en espera y de las llamadas en el Call Center para asignarles una posicion en la cola de prioridad.
        */
        long tTotalLlamadasPrioridad = System.nanoTime() - tInicioLlamadasPrioridad; 
        System.out.println("tiempo llamadas en orden de prioridad: " + tTotalLlamadasPrioridad + " nseg");


        /** TODO Mostrar la informacion de las llamadas en orden de prioridad. Incluir: id de llamada, id de pedido, id de cliente, id de caso, fecha, tipo problema y prioridad llamada.*/


        long tInicioConsultarLlamadas= System.nanoTime();
        /**
         *TODO Requerimiento 3: Consultar las llamadas reportadas en CCT relacionadas con los pedidos/despachos de una ruta.
        * Las llamadas se obtienen en orden de prioridad. 
        * Recibe la ruta a consultar.
	   */
        long tTotalConsultarLlamadas = System.nanoTime() - tInicioConsultarLlamadas; 
        System.out.println("tiempo consultar llamadas reportadas: " + tTotalLlamadasPrioridad + " nseg");


        /*TODO Mostrar la informacion de las llamadas en orden de prioridad. Incluir id de llamada, 
        *id de pedido, id de cliente, id de caso, fecha, tipo problema y prioridad llamada.
         */


        long tInicioCalificacionRuta= System.nanoTime();
        /**
         *TODO Requerimiento 4: Dada una ruta, obtener su calificacion promedio en encuestas.
         */
        long tTotalCalificacionRuta = System.nanoTime() - tInicioCalificacionRuta; 
        System.out.println("tiempo calificacion promedio ruta: " + tTotalCalificacionRuta + " nseg");


         /*TODO Se debe mostrar la informacion de la ruta, con su calificacion promedio
         */


        long tInicioCalificacionCliente= System.nanoTime();
        /**
         *TODO Requerimiento 5: Dado un cliente, obtener la calificacion promedio en encuestas 
         */
        long tTotalCalificacionCliente = System.nanoTime() - tInicioCalificacionCliente; 
        System.out.println("tiempo calificacion promedio en encuestas por cliente: " + tTotalCalificacionCliente + " nseg");


         /*TODO Se debe mostrar la informacion del cliente, y la calificacion promedio.*/


        long tInicioHistorico= System.nanoTime();
        /**
         *TODO Requerimiento 6: Dada una ruta, obtener un listado con el historico de calificaciones.
	    * El historico es el detalle de las calificaciones de todas las encuestas relacionadas con pedidos/entregas realizados en la ruta. 
         */
        long tTotalHistorico = System.nanoTime() - tInicioHistorico; 
        System.out.println("tiempo historico calificaciones ruta: " + tTotalHistorico + " nseg");


         /*TODO Se debe mostrar el listado historico de calificaciones de la ruta.*/

         
    }
}
