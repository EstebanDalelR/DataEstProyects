package api.proyecto1.interfaces.centralllamadas;

/*
 * ILlamada modela una llamada a ser atendida por la central de llamadas
 */
public interface ILlamada {

 /**
  * M�todo que permite asignar una estampilla de tiempo a la llamada
  * @param estampillaTiempo Estampilla de tiempo en que se gener� de la llamada como un long de milisegundos
  */
 public void setEstampillaTiempo(long estampillaTiempo);

 /**
  * M�todo que retorna la estampilla de tiempo en que se gener� la llamada como un long de milisegundos
  * @return Estampilla de tiempo en que se gener� la llamada como un long de milisegundos
  */
 public long getEstampillaTiempo();

 /**
  * M�todo que retorna el agente que atendi� la llamada
  * @return Agente que atendi� la llamada
  */
 public IAgente getAgente();

 /**
  * M�todo que permite asignar el agente que atiende la llamada
  * @param agente Agente que atiende la llamada
  */
 public void setAgente(IAgente agente);

 /**
  * M�todo que retorna el problema asociado a la llamada
  * @return El problema asociado a la llamada
  */
 public IProblema getProblema();

 /**
  * M�todo que permite asociar un problema a la llamada
  * @param problema Problema asociado a la llamada
  */
 public void setProblema(IProblema problema);

 /**
  * M�todo que retorna el cliente asociado a la llamada
  * @return cliente asociado a la llamada
  */
 public ICliente getCliente();

 /**
  * M�todo que permite establecer el cliente relacionado a la llamada. Permite la naveaci�n bidireccional.
  * @param cliente asociado a la llamada
  */
 public void setCliente(ICliente cliente);

}
