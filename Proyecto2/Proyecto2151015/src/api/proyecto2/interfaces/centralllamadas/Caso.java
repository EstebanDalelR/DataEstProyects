package api;

public class Caso implements iCaso
{
  //enum categorias;
  //enum estadoCaso;
  private CatergoriaCaso categoria;
  private EstadoCaso estado;
  private PedidoDespacho pedido;
  private Cliente clienteCreador;
  private Array llamadas;
  
  public Caso(CategoriaCaso nCategoria, PedidoDespacho nPedido, Cliente nCliente, Array nLlamadas)
  {
    categoria=nCategoria;
    estado=EstadoCaso.ABIERTO;
    clienteCreador=nCliente;
    llamadas=nLlamadas;
    pedido=nPedido;
  }
   public Caso(CategoriaCaso nCategoria, Cliente nCliente, Llamada nLlamada)
  {
    categoria=nCategoria;
    estado=EstadoCaso.ABIERTO;
    clienteCreador=nCliente;
    asignarLlamada(nLlamada);
    pedido=nPedido;
  }
  public boolean getCliente()
  {
    return clienteCreador;
  }
  public void setCliente(Cliente nCliente)
  {
    clienteCreador=nCliente;
  }
  public void asignarLlamada(Llamada nLlamada)
  {
    llamadas.add(nLlamada);
  }
  public Array<Llamada> getHistorialLlamadas()
  {
    Array<Llamada> retornar= new Array<Llamada>[llamadas.size];
    for(i=0; i<llamadas.size();i++)
    {
      retornar.add(llamadas[i]);
    }
    return retornar;
  }
  public EstadoCaso getEstado()
  {
    return estado;
  }
  public void setEstado(EstadoCaso nEstado)
  {
    estado=nEstado;
  }
  public CategoriaCaso getCategoriaCaso()
  {
    return categoria;
  }
  public void setCategoriaCaso(CategoriaCaso nCategoria)
  {
    categoria=nCategoria;
  }
  public PedidoDespacho getPedidoDespacho()
  {
    if(!pedido=null)
    {
    return pedido;
    }
    else
    {
      return null;
    }
  }
  public void setPedidoDespacho(PedidoDespacho nPedido)
  {
    pedido=nPedido;
  }
}
  