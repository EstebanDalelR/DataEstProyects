package api.proyecto1.interfaces.centralllamadas;

/*
 * ICliente modela un cliente de la central de llamadas
 */
public interface ICliente {


  /* M�todo que retorna el nombre del cliente
   * @return Retorna el nombre del agente
   */
  public String getNombre();

  /*
   * M�todo que permite asociar el nombre del cliente
   * @param nombre El nombre del agente
   */
  public void setNombre(String nombre);

  /* M�todo que retorna el apellido del cliente
   * @return Retorna el apellido del agente
   */
  public String getApellido();

  /*
   * M�todo que permite asociar el apellido del agente
   * @param nombre El apellido del agente
   */
  public void setApellido(String apellido);

 /**
  * M�todo que retorna todos los casos del cliente
  * @return Todos los casos del cliente
  */
 public Iterable<ICaso> darHistoricoCasos();

 /**
  * M�todo que permite agregar un caso al hist�rico del cliente
  * @param caso Caso a agregar al historico del cliente
  */
 public void agregarCasoAHistorico(ICaso caso);

 /**
  * M�todo que retorna una lista de casos abiertos del cliente
  * @return Todos los casos abiertos del cliente
  */
 public Iterable<ICaso> darCasosAbiertos();

 /**
  * M�todo que retorna todos los pedidos de despacho del cliente
  * @return Todos los pedidos de despacho del cliente
  */
 public Iterable<IPedidoDespacho> darPedidosDespacho();

 /**
  * M�todo que permite agregar un pedido de despacho del cliente
  * @param pedido Pedido de despacho del cliente
  */
 public void agregarPedidoDespacho(IPedidoDespacho pedido);
}
