package api.proyecto1.interfaces.centralvehiculos;

/*
 * IVehiculo modela un veh�culo de CTT, que guarda todos los eventos informados por
 * sus dispositivos enteros
 */
public interface IVehiculo {

 /**
  * M�todo que permite obtener la lista de eventos guardados en el veh�culo
  * @return la lista de eventos guardados en el veh�culo
  */
 public Iterable<IEventoVehiculo> getEventos();

 /**
  * m�todo que permite establecer la lista de eventos guardados en el veh�culo
  * @param listaEventos
  */
 public void guardarEvento(Iterable<IEventoVehiculo> listaEventos);

 /**
  * M�todo que permite establecer la ruta del veh�culo
  * @param ruta ruta para el veh�culo
  */
 public void setRuta(IRuta ruta);

 /**
  * M�todo que permite obtener la ruta del veh�culo
  * @return la ruta del veh�chulo
  */
 public IRuta getRuta();

}
