package api.proyecto1.interfaces.centralllamadas;

/*
 * ICaso modelo un caso de la central de llamadas
 * un caso debe tener el cliente asociado, el hist�rico de llamadas, la categor�a del caso
 * y el pedido de despacho asociado
 */
public interface ICaso {

 /**
  * M�todo que retorna el cliente asignado al caso
  * @return Cliente asignado al caso
  */
 public ICliente getCliente();

 /**
  * M�todo que permite asignar un cliente al caso
  * @param cliente cliente que abre el caso
  */
 public void setCliente(ICliente cliente);

 /**
  * M�todo que permite asignar una nueva llamada al caso
  * @param llamada LLamada que se asigna al caso
  */
 public void asignarLlamada(ILlamada llamada);

 /**
  * M�todo que retorna todo el historial de llamadas para el caso
  * @return Historial de llamadas del caso
  */
 public Iterable<ILlamada> getHistorialLlamadas();

 /**
  * M�todo que retorna el estado del caso
  * @return Estado del caso
  */
 public EstadoCaso getEstado();

 /**
  * M�todo que permite cambiar el estado del caso
  * @param estado Estado del caso
  */
 public void setEstado(EstadoCaso estado);

 /**
  * M�todo que retorna si el caso es pregunta, queja o reclamo
  * @return Categoria del caso
  */
 public CategoriaCaso getCategoriaCaso();

 /**
  * M�todo que permite establecer la categoria del caso
  * @param categoria Categoria del caso
  */
 public void setCategoriaCaso(CategoriaCaso categoria);

  /**
  * M�todo que retorna el pedido de despacho asociado al caso
  * @return Pedido de despacho si está asociado, null de lo contrario
  */
 public IPedidoDespacho getPedidoDespacho();

 /**
  * M�todo que permite asociar un pedido de despacho con el caso
  * @param pedido Pedido de despacho con el que se asocia el caso
  */
 public void setPedidoDespacho(IPedidoDespacho pedido);

}
