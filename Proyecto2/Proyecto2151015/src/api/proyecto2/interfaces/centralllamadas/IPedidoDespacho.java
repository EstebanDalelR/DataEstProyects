package api.proyecto1.interfaces.centralllamadas;

import api.proyecto1.interfaces.centralvehiculos.IPunto;

/*
 * IPedidoDespacho modela un pedido de despacho solicitado por un cliente
 * El pedido tiene un punto origen y un punto de destino
 */
public interface IPedidoDespacho {

 /**
  * Método que permite asociar un cliente a su pedido
  * @param cliente cliente que hace el pedido
  */
 public void setCliente(ICliente cliente);

 /**
  * Método que retorna el cliente de un pedido
  * @return cliente que hace el pedido
  */
 public ICliente getCLiente();

 /**
  * Método que retorna el punto de destino del pedido
  * @return Punto de destino del pedido
  */
 public IPunto getPuntoDestino();

 /**
  * Método que permite asignar el punto de destino del pedido
  * @param punto punto de destino del pedido
  */
 public void setPuntoDestino(IPunto punto);

 /**
  * Método que retorna el punto de origen del pedido
  * @return Punto de origen del pedido
  */
 public IPunto getPuntoOrigen();

 /**
  * Método que permite asignar el punto de origen del pedido
  * @param punto punto de origen del pedido
  */
 public void setPuntoOrigen(IPunto punto);

}
