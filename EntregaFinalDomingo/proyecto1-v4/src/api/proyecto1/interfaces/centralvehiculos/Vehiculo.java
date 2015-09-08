package api.proyecto1.interfaces.centralvehiculos;

/*
 * Vehiculo modela un vehiculo de CTT, que guarda todos los eventos informados por
 * sus dispositivos enteros
 */
public class Vehiculo {
private ColaEventos colaEventos;
private Ruta rutaVehiculo;
private int idVehiculo;
private TipoVehiculo tipoVehiculo;
private int capacidad;
private int modelo;
private String placa;

public vehiculo(int pId, TipoVehiculo pTipo, String pPlaca, int pModelo, int pCapacidad){
ColaEventos colaEventos = new ColaEventos();
idVehiculo=pId;
tipoVehiculo=pTipo;
placa=pPlaca;
modelo=pModelo;
capacidad=pCapacidad;
}
public String darNombre(){
return nombre;
}
public TipoVehiculo darTipoVehiculo(){
  return tipoVehiculo;
}
public String darPlaca(){
return placa;
}
public int darModelo(){
return modelo;
}
public int darPlaca(){
return placa;
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
int i=0;
  while(listaEventos.hasNext()){
  Evento temp = listaEventos.get(i);
    colaEventos.offer(temp);
    listaEventos =listaEventos.next();
 i++; 
  }
}

 /**
  * Metodo que permite establecer la ruta del vehiculo
  * @param ruta ruta para el vehiculo
  */
public void setRuta(Ruta ruta){
rutaVehiculo=ruta;
}
 /**
  * M�todo que permite obtener la ruta del veh�culo
  * @return la ruta del veh�chulo
  */
public Ruta getRuta(){
return rutaVehiculo;
}

}
