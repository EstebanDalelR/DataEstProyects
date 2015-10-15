package api;
public class AnalisisUnificado implements IAnalisisUnificado
{
   /**
  * M�todo que permite obtener los eventos sospechosos de la bit�cora de eventos
  * asociados a los PQR de un cliente
  * @param cliente para la cual se desea encontrar los eventos sospechosos asociados a sus PQR
  * @param ruta para la cual se desea encontrar los eventos sospechosos
  * @return retorna una lista de eventos sospechosos asociados a los PQR del cliente
  */
 public Iterable<EventoVehiculo> darEventosSospechososAsociadosAPQR(Cliente cliente, Ruta ruta)
 {
   //TODO
 }

 /**
  * M�todo que permite obtener los eventos en los que se generan m�s PQR, para una ruta determinada
  * @param ruta Ruta para la que se desean saber los eventos que generan m�s PQR.
  * @return lista de eventos que m�s generan PQR en la ruta
  */
 public Iterable<EventoVehiculo> darEventosGeneranMasPQRPorRuta(Ruta ruta)
 {
   //TODO
 }

 /**
  * M�todo que permite obtener los eventos de la ruta en la que m�s PQR se han reportado, agrupados por segmentos.
  * @return una lista que en cada campo retorna una lista de eventos asociados a cada segmento de la ruta
  */
 public Iterable<Iterable<EventoVehiculo>> darRutaPQRAgrupadoPorSegmentos()
 {
   //TODO
 }
}
