package api.proyecto1.interfaces.centralvehiculos;

/*
 * Vehiculo modela un vehiculo de CTT, que guarda todos los eventos informados por
 * sus dispositivos enteros
 */
public class Vehiculo {
private Iterable<EventoVehiculo> colaEventos;
private Ruta rutaVehiculo;
private int idVehiculo;
private TipoVehiculo tipoVehiculo;
private int capacidad;
private int modelo;
private String placa;
private long fechaInicioRuta;
private long fechaFinRuta;
public vehiculo(int pId, TipoVehiculo pTipo, String pPlaca, int pModelo, int pCapacidad){
ColaEventos colaEventos = new ColaEventos();
idVehiculo=pId;
tipoVehiculo=pTipo;
placa=pPlaca;
modelo=pModelo;
capacidad=pCapacidad;
}
public int darId(){
return idVehiculo;
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
return colaEventos.iterator();
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
public IRuta getRuta(){
return rutaVehiculo;
}
public void iniciarRuta(Ruta ruta, EventoVehiculo evento){
  if(evento==INICIAR_RUTA){
  ruta.iniciarRuta(evento);
  fechaInicioRuta = evento.getEstampillaTiempo();
  }
}
public void finalizarRuta(Ruta ruta, EventoVehiculo evento){
  if(evento==TERMINAR_RUTA){
  gasolinaFinal = evento.getGasolina();
  ruta.finalizarRuta(evento);
  fechaFinRuta=evento.getEstampillaTiempo();
  }
}
public double darGasolina(){
return ruta.gasolina()
}
public long darFechaInicio(){
return fechaInicioRuta;
}
public long darFechaFin(){
  return fechaFinRuta;
}
}