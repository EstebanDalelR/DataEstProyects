package api.proyecto1.interfaces.centralllamadas;

/*
 * IAgente modela un agente de la central de llamadas
 * un agente tiene su lista de llamadas atendidas
 */
public interface IAgente {

  /* M�todo que retorna el nombre del agente
   * @return Retorna el nombre del agente
   */
  public String getNombre();

  /*
   * M�todo que permite asociar el nombre del agente
   * @param nombre El nombre del agente
   */
  public void setNombre(String nombre);

  /* M�todo que retorna el apellido del agente
   * @return Retorna el apellido del agente
   */
  public String getApellido();

  /*
   * M�todo que permite asociar el apellido del agente
   * @param nombre El apellido del agente
   */
  public void setApellido(String apellido);

 /**
  * M�todo que permite atender y procesar la llamada, al finalizar se agrega a la lista de
  * llamadas atendidas
  * @param llamada Llamada a atender por el agente
  */
 public void atenderLlamada(ILlamada llamada);

 /**
  * M�todo que permite obtener las llamadas atendidas por un agente
  * @return Iterable de llamadas atendidas por el agente
  */
 public Iterable<ILlamada> darLlamadasAtendidas();
}
