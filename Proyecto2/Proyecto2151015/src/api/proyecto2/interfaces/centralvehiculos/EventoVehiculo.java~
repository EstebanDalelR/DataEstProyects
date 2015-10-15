package api.proyecto1.interfaces.centralvehiculos;
public class EventoVehiculo implements IEventoVehiculo
{
private Punto punto; 
private TipoEventoVehiculo tipoEvento;
private long fecha;
enum TipoEventoVehiculo;
public void setTipo(TipoEventoControl tipo)
  {
  tipoEvento = tipo;
  }
   /**
  * M�todo que retorna el tipo del evento
  * @return TipoEvento tipo del evento
  */
  public TipoEventoControl getTipo()
  {
    return tipoEvento;
  }

 /**
  * Método que retorna la estampilla de tiempo del evento como un long de milisegundos
  * @return retorna la estampilla de tiempo como long de milisegundos
  */
  public long getEstampillaTiempo(){
  return fecha;
  }


 /**
  * M�todo que permite establecer la estampilla de tiempo para el evento como un long de milisegundos
  * @param estampillaTiempo estampilla de tiempo del evento como un long de milisegundos
  */
  public void setEstampillaTiempo(long estampillaTiempo){
fecha=estampillaTiempo;
  }

public void setPunto(Punto point) {
punto= point;
}
public Punto darPunto(){
return punto;
}
public boolean estaEnCuadrado(Punto norEste, Punto surEste, Punto revisar){
  boolean esta = false;
  if(norEste.getLatitud()<surEste.getLatitud()){
  double latitudInicial = norEste.darLatitud();
  double latitudFinal = surEste.darLatitud();
  }
  else{
  double latitudInicial = surEste.darLatitud();
  double latitudFinal = norEste.darLatitud();
  }
  if(norEste.getLongitud()<surEste.getLongitud()){
  double longitudInicial = norEste.getLongitud();
  double longitudFinal = surEste.getLongitud();
  }
  else{
  double longitudInicial = surEste.getLongitud();
  double longitudFinal = norEste.getLongitud();
  }
boolean estaEnLat = false;
boolean estaEnLon=false;
  if(latitudInicial<=revisar.getLatitud()&&revisar.getLatitud()<=latitudFinal){
    estaEnLat=true;
  }
   if(longitudInicial<=revisar.getLongitud()&&revisar.getLongitud()<=longitudFinal){
    estaEnLon=true;
  }
   if(estaEnLat==true&&estaEnLon==true){
   esta=true;
   }
  return esta;
}
}