package api;
public class Llamada implements ILlamada
{
  private long estampilla;
  private Agente atendiendo;
  private Problema lio;
  private Cliente cliente;
 
  public void setEstampillaTiempo(long nEstampillaTiempo)
 {
   estampilla=nEstampillaTiempo;
 }
 public long getEstampillaTiempo()
 {
   return estampilla;
 }
 public Agente getAgente()
 {
   return atendiendo;
 }
 public void setAgente(Agente nAgente)
 {
   atendiendo=nAgente;
 }
 public Problema getProblema()
 {
   return lio;
 }
 public void setProblema(Problema nProblema)
 {
   lio=nProblema;
 }
 public Cliente getCliente()
 {
   return cliente;
 }
 public void setCliente(Cliente nCliente)
 {
   cliente=nCliente;
 }
}