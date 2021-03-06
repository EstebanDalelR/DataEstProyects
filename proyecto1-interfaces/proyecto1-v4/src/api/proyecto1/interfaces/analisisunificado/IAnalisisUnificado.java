package api.proyecto1.interfaces.analisisunificado;

import api.proyecto1.interfaces.centralllamadas.ICaso;
import api.proyecto1.interfaces.centralvehiculos.IEventoVehiculo;
import api.proyecto1.interfaces.centralvehiculos.IRuta;
import api.proyecto1.interfaces.centralllamadas.ICliente;

/*
 * IAnlaisisUnificado se refiere a la parte C del enunciado del proyecto 1
 */
public interface IAnalisisUnificado {

 /**
  * M�todo que permite obtener los eventos sospechosos de la bit�cora de eventos
  * asociados a los PQR de un cliente
  * @param cliente para la cual se desea encontrar los eventos sospechosos asociados a sus PQR
  * @param ruta para la cual se desea encontrar los eventos sospechosos
  * @return retorna una lista de eventos sospechosos asociados a los PQR del cliente
  */
 public Iterable<IEventoVehiculo> darEventosSospechososAsociadosAPQR(ICliente cliente, IRuta ruta);

 /**
  * M�todo que permite obtener los eventos en los que se generan m�s PQR, para una ruta determinada
  * @param ruta Ruta para la que se desean saber los eventos que generan m�s PQR.
  * @return lista de eventos que m�s generan PQR en la ruta
  */
 public Iterable<IEventoVehiculo> darEventosGeneranMasPQRPorRuta(IRuta ruta);

 /**
  * M�todo que permite obtener los eventos de la ruta en la que m�s PQR se han reportado, agrupados por segmentos.
  * @return una lista que en cada campo retorna una lista de eventos asociados a cada segmento de la ruta
  */
 public Iterable<Iterable<IEventoVehiculo>> darRutaPQRAgrupadoPorSegmentos();
}
