  package api;
  public class Cliente implemets ICliente
  {
    String nombre;
    String apellido;
    Iterable<Caso> casos;
    Iterable<PedidoDespacho> pedidos;
  public String getNombre()
  {
    return nombre;
  }
  public void setNombre(String input)
  {
    nombre=input;
  }

  public String getApellido()
  {
    return apellido;
  }

  public void setApellido(String input)
  {
    apellido=input;
  }

 /**
  * M�todo que retorna todos los casos del cliente
  * @return Todos los casos del cliente
  */
 public Iterable<Caso> darHistoricoCasos()
 {
   return casos;
 }

 public void agregarCasoAHistorico(Caso casoIn)
 {
   casos.add(casoIn);
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
       retornar.add(actual;
     }
   }
   return retornar;
 }

 public Iterable<PedidoDespacho> darPedidosDespacho()
 {
   return pedidos;
 }

 public void agregarPedidoDespacho(PedidoDespacho pedido)
 {
   pedidos.add(pedido);
 }
}
