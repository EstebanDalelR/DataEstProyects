package api.proyecto1.interfaces.centralvehiculos;
public class EventoVehiculo implements IEventoVehiculo
{

  private TipoEventoVehiculo tipoEvento;
//public final class Long fecha;
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
}
  
}