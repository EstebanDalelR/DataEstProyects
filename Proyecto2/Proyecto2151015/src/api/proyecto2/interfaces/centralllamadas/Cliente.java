package api;
public class Cliente implements ICliente
{
  private String nombre;
  private String apellido;
  private Iterable<Caso> casos;
  private Iterable<PedidoDespacho> pedidos;
  private int prioridad;
    //PROYECTO2
  public int darPrioridad()
  {
    return prioridad;
  }
  public void cambiarPrioridad(int aCambiar)
  {
    prioridad=aCambiar;
  }
  public String getNombre()
  {
    return nombre;
  }
  public void setNombre(String nNombre)
  {
    nombre=nNombre;
  }
  public String getApellido()
  {
    return apellido;
  }
  
  public void setApellido(String nApellido)
  {
    apellido=nApellido;
  }
  
  public Iterable<Caso> darHistoricoCasos()
  {
    return casos.iterator();
  }
  
  public void agregarCasoAHistorico(Caso nCaso)
  {
    casos.add(nCaso);
  }
  
  public Iterable<Caso> darCasosAbiertos()
  {
    Iterable<Caso> retornar=new Iterable<Caso>;
    Caso actual=null;
    if(casos[i].hasNext())
    {
      actual=casos[i].get;
      if (actual.getEstado()==EstadoCaso.ABIERTO)
      {
        retornar.add(actual);
      }
    }
    return retornar;
  }
  
  public Iterable<PedidoDespacho> darPedidosDespacho()
  {
    return pedidos.iterator();
  }
  
  public void agregarPedidoDespacho(PedidoDespacho pedido)
  {
    pedidos.add(pedido);
  }
}
