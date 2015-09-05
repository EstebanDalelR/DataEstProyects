package api;
public class PedidoDespacho implements IPedidoDespacho
{
  
  private Cliente cliente;
  private Punto puntoDes;
  private Punto puntoOri;
  
  public void setCliente(Cliente nCliente)
  {
    cliente=nCliente;
  }
  public Cliente getCLiente()
  {
    return cliente;
  }
  public Punto getPuntoDestino()
  {
    return puntoDes;
  }
  public void setPuntoDestino(Punto nPuntoDest)
  {
    puntoDes = nPuntoDest;
  }
  public Punto getPuntoOrigen()
  {
    return puntoOri;
  }
  public void setPuntoOrigen(Punto nPuntoOri)
  {
    puntoOri=nPuntoOri;
  }
}
