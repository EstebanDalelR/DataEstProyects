  package api;
  
  public class Agente implements IAgente
  {
    private String nombre;
    private String apellido;
    private Llamada llamada;
    private iterable<Llamadas> lista;
    private ArrayList llamadasRecibidas;
    
  public Agente(String nNombre, String nApellido)
  {
    nombre=nNombre;
    apellido=nApellido;
  }
  public String getNombre()
  {
    return nombre;
  }

  public void setNombre(String nNombre)
  {
    nombre=nNombre;
  }
  public String getApellido();
  {
    return apellido;
  }

  public void setApellido(String nApellido)
  {
    apellido=nApellido;
  }

 public void atenderLlamada(Llamada nLlamada)
 {
   llamadasRecibidas.add (nLlamada);
 }

 public Iterable<Llamada> darLlamadasAtendidas()
 {
   return lista.iterator();
 }
}