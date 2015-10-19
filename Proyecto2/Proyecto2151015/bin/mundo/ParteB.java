package mundo;

public class ParteB {

    public void executeParteBTest() {

        /**
        * TODO Instanciar una Central de Llamadas e inicializarla con los datos del archivo formato JSON de la version mas completa y correcta disponible.
         */

        long tInicioConsultaClientes = System.nanoTime();
        /**TODO Requerimiento 1: Clientes en orden de prioridad
         * Se obtiene un objeto iterable que contenga los clientes ordenados por prioridad, en orden descendente
         */
        long duracionConsultaClientes = System.nanoTime() - tInicioConsultaClientes;
        System.out.println("Tiempo consulta clientes: "+duracionConsultaClientes + " nseg");


        /**TODO Mostrar el nombre, apellido, identificador y la prioridad de cada cliente */


        long tInicioConsultaLlamadas = System.nanoTime();
        /**TODO Requerimiento 2: Para cada dia que reporte llamadas, obtener sus llamadas en el orden de prioridad de los clientes. 
        * Se obtiene un objeto iterable que contenga las llamadas ordenadas por la prioridad de los clientes que las realizan, en orden descendente.  
        * Recibe la informacion necesaria de los clientes en espera y de las llamadas en el Call Center para asignarles una posicion en la cola de prioridad.
        */
        long duracionConsultaLLamadas = System.nanoTime() - tInicioConsultaLlamadas;
        System.out.println("Tiempo consulta llamadas: "+duracionConsultaLLamadas + " nseg");


        /** TODO Mostrar la informacion de las llamadas de la cola de prioridad, ordenada descendentemente. Para cada llamada mostrar: Id Llamada, Id cliente, Id pedido, prioridad del cliente, tipo problema*/

        long tInicioConsultaNumero = System.nanoTime();
        /**TODO Requerimiento 3: Busqueda de un numero de radicacion de llamada a partir de una fecha y el identificador del cliente
         * Se obtiene el numero de radicacion de llamada si en la fecha indicada se registra una llamada del
         * cliente indicado. 
         */
        long duracionConsultaNumero = System.nanoTime() - tInicioConsultaNumero;
        System.out.println("Tiempo consulta numero: "+duracionConsultaNumero + " nseg");


        /** TODO Mostrar el numero de radicacion de la llamada del cliente en la fecha indicada, si existe.*/


        long tInicioConsultaInfo= System.nanoTime();
        /**TODO Requerimiento 4: Busqueda de la informacion del resultado de una llamada a partir de su identificador.
         * Se obtiene la informacion de la llamada: fecha y hora en que fue atendido
         * el cliente, persona que genero la llamada, estado de la llamada, nombre del funcionario 
         * de CCT que atendio al cliente y observaciones o anotaciones.
         */
        long duracionConsultaInfo = System.nanoTime() - tInicioConsultaInfo;
        System.out.println("Tiempo consulta info: "+duracionConsultaInfo + " nseg");

        /** TODO Mostrar la informacion del resultado de una llamada, si existe.*/

    }
}
