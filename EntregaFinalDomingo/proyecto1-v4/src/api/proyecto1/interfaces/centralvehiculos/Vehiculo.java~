package api.proyecto1.interfaces.centralvehiculos;

/*
 * Vehiculo modela un vehiculo de CTT, que guarda todos los eventos informados por
 * sus dispositivos enteros
 */
public class Vehiculo {
ColaEventos colaEventos;
public vehiculo(){
ColaEventos colaEventos = new ColaEventos();
}
 /**
  * Metodo que permite obtener la lista de eventos guardados en el veh�culo
  * @return la lista de eventos guardados en el veh�culo
  */
public Iterable<EventoVehiculo> getEventos(){
return colaEventos;
}

 /**
  * metodo que permite establecer la lista de eventos guardados en el vehiculo
  * @param listaEventos
  */
public void guardarEvento(Iterable<EventoVehiculo> listaEventos){

  while(listaEventos.hasNext()){
  Evento temp = listaEventos.get(i);
    colaEventos.offer(temp);
    listaEventos =listaEventos.next();
 i++; 
  }
}

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
