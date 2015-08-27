package api.proyecto1.interfaces.centralllamadas;

import api.proyecto1.interfaces.centralvehiculos.IPunto;
/*
 * IProblema modela un problema asociado a una llamada
 */
public interface IProblema {

 /**
  * M�todo que retorna la estampilla de tiempo para el problema reportado, como un long de milisegundos
  * @return Estampilla de tiempo para el problema reportado, como un long de milisegundos
  */
 public long getEstampillaTiempo();

 /**
  * M�todo que permite asignar una estampilla de tiempo al problema reportado,
  * como un long de milisegundo
  * @param estampillaTiempo Estampilla en que sucedi� el problema, como un long de milisegundos
  */
 public void setEstampillaTiempo(long estampillaTiempo);

 /**
  * M�todo que permite establecer el tipo de problema reportado
  * @param tipo tipo de problema reportado
  */
 public void setTipo(TipoProblema tipo);

 /**
  * M�todo que retorna el tipo de problema reportado
  * @return Tipo de problema reportado
  */
 public TipoProblema getTipoProblema();

  /**
  * M�todo que retorna el punto donde se present� el problema
  * @return el punto donde se present� el problema
  */
 public IPunto getPunto();

 /**
  * M�todo que permite establecer el punto donde se present� el problema
  * @param punto donde se present� el problema
  */
 public void setPunto(IPunto punto);

}
