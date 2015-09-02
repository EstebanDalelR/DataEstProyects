  package api;
  
  public class Agente implements IAgente
  {
    private String nombre;
    private String apellido;
    private Llamada llamada;
    private iterable<Llamadas> lista;
  }
  public String getNombre()
  {
    return nombre;
  }

  public void setNombre(String input)
  {
    nombre=input;
  }
  public String getApellido();
  {
    return apellido;
  }

  public void setApellido(String input)
  {
    apellido=input;
  }

 public void atenderLlamada(Llamada input)
 {
   llamada=input;
 }

 public Iterable<Llamada> darLlamadasAtendidas()
 {
   return lista;
 }
}