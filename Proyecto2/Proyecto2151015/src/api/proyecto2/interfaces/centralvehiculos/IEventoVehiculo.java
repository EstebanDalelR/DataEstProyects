package api.proyecto1.interfaces.centralvehiculos;

import api.proyecto1.interfaces.TipoEventoControl;
/*
 * IEventoVehiculo se refiere a los eventos asociados a un veh�culo. El veh�culo env�a eventos sobre sus
 * dispositivos internos y se especifican en el enum TipoEvento
 */
public interface IEventoVehiculo {

 /**
  * M�todo que permite especificar el tipo de evento seg�n el enum TipoEvento
  * @param tipo Tipo del evento
  */
 public void setTipo(TipoEventoControl tipo);

 /**
  * M�todo que retorna el tipo del evento
  * @return TipoEvento tipo del evento
  */
 public TipoEventoControl getTipo();

 /**
  * Método que retorna la estampilla de tiempo del evento como un long de milisegundos
  * @return retorna la estampilla de tiempo como long de milisegundos
  */
 public long getEstampillaTiempo();

 /**
  * M�todo que permite establecer la estampilla de tiempo para el evento como un long de milisegundos
  * @param estampillaTiempo estampilla de tiempo del evento como un long de milisegundos
  */
 public void setEstampillaTiempo(long estampillaTiempo);
}
