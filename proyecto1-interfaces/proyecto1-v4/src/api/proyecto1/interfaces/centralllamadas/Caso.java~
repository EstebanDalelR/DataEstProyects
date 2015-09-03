package api;

public class Caso implements iCaso
{
  //enum categorias;
  //enum estadoCaso;
  CatergoriaCaso categoria;
  EstadoCaso estado;
  PedidoDespacho pedido;
  Cliente clienteCreador;
  Array llamadas;
  
  public boolean getCliente()
  {
    return clienteCreador;
  }
  public void setCliente(Cliente input)
  {
    clienteCreador=input;
  }
  public void asignarLlamada(Llamada entrante)
  {
    llamadas.add(entrante);
  }
  public Array<Llamada> getHistorialLlamadas()
  {
    Array<Llamada> retornar= new Array<Llamada>;
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
  public void setEstado(EstadoCaso input)
  {
    estado=input;
  }
  public void getCategoriaCaso()
  {
    return categoria;
  }
  public void setCategoriaCaso(CategoriaCaso input)
  {
    categoria=input;
  }
  public PedidoDespacho getPedidoDespacho()
  {
    if(pedido!=null)
    {
    return pedido;
    }
    else
    {
      return null;
    }
  }
  public void setPedidoDespacho(PedidoDespacho input)
  {
    pedido=input;
  }
}
  