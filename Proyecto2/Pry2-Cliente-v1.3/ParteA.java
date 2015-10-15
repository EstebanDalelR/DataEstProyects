package mundo;

public class ParteA {

    public void executeParteATest() {

        /**
        * TODO Instanciar una Central de Vehiculos e inicializarla con los datos del archivo formato JSON de la version mas completa y correcta disponible.
         */
 
        long tInicioConsultaClientes = System.nanoTime();
        /**TODO Requerimiento 1: Clientes en orden de prioridad
         * Se obtiene un objeto iterable que contenga los clientes ordenados por prioridad, en orden descendente
         */
         long tTotalConsultaClientes = System.nanoTime() - tInicioConsultaClientes; 
        System.out.println("tiempo Consulta Clientes: " + tTotalConsultaClientes + " nseg");


        /**TODO Mostrar el nombre, apellido, identificador y la prioridad de cada cliente */


        long tInicioRuta = System.nanoTime();
        /**TODO Requerimiento 2: Utilizar la prioridad de los clientes para definir una ruta con las paradas autorizadas de recogida y/o de entrega de pedidos/despachos a los clientes.
         * Se obtiene una ruta tal que se asigna las paradas programadas de sus clientes en orden descendente de prioridad. 
        * Recibe la informacion necesaria de la ruta para actualizarla segun la prioridad de sus clientes.
         */
        long tTotalRuta = System.nanoTime() - tInicioRuta; 
        System.out.println("tiempo creacion ruta: " + tTotalRuta + " nseg");


        /**TODO Mostrar la informacion de paradas autorizadas de la ruta. Por cada para parada mostrar: Id pedido/despacho, id cliente, prioridad del cliente, punto. La informacion se muestra en el orden de recorrido de la ruta. */


        long tInicioBusquedaNumPedido = System.nanoTime();
        /**TODO Requerimiento 3: Busqueda de un numero de pedido/despacho a partir de una fecha y el identificador del cliente
         * Se obtiene el numero de despacho de un pedido/despacho si en la fecha indicada se presto un servicio
         * al cliente indicado. 
         */
        long tTotalBusquedaNumPedido = System.nanoTime() - tInicioBusquedaNumPedido; 
        System.out.println("tiempo busqueda numero de pedido: " + tTotalBusquedaNumPedido + " nseg");


        /**TODO Mostrar el numero de pedido/despacho del pedido/despacho del cliente realizado en la fecha de busqueda (si existe)*/


        long tInicioBusquedaInfoPedido = System.nanoTime();
        /**TODO Requerimiento 4: Busqueda de la informacion del resultado de un pedido/despacho a partir de su identificador.
         * Se obtiene la informacion del despacho: fecha y hora en que fue atendido,
         * persona que recibio o entrego la mercancia, estado de la mercancia al momento
         * de la recepcion o entrega, nombre del funcionario de CCT que atendio al cliente y
         * observaciones o anotaciones.
         */
        long tTotalBusquedaInfoPedido = System.nanoTime() - tInicioBusquedaInfoPedido; 
        System.out.println("tiempo busqueda informacion de pedido: " + tTotalBusquedaInfoPedido + " nseg");


       /** TODO Mostrar la informacion del pedido/despacho resultante (si existe).

       
    }
}
