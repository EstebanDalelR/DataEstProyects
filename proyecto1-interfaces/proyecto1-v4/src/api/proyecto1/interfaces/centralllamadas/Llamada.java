package api;
public class Llamada implements ILlamda
{
  long estampilla;
  Agente atendiendo;
  Problema lio;
  Cliente cliente;
 public void setEstampillaTiempo(long estampillaTiempo)
 {
   estampilla=estampillaTiempo;
 }

 public long getEstampillaTiempo()
 {
   return estampilla;
 }

 public Agente getAgente()
 {
   return atendiendo;
 }

 public void setAgente(Agente agente)
 {
   atendiendo=agente;
 }

 public Problema getProblema()
 {
   return lio;
 }

 public void setProblema(Problema problema)
 {
   lio=problema;
 }
 public Cliente getCliente()
 {
   return cliente;
 }

 public void setCliente(Cliente input)
 {
   cliente=input;
 }

}