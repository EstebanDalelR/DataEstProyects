package api;
public class PedidoDespacho implements IPedidoDespacho
{

  Cliente cliente;
  Punto puntoDes;
  Punto puntoOri;

 public void setCliente(Cliente input)
 {
   cliente=input;
 }

 public Cliente getCLiente()
 {
   return Cliente;
 }

 public Punto getPuntoDestino()
 {
   return puntoDes;
 }
 public void setPuntoDestino(Punto input)
 {
   puntoDes = input;
 }

 public Punto getPuntoOrigen()
 {
   return puntoOri;
 }


 public void setPuntoOrigen(Punto punto)
 {
   puntoOri=punto;
 }

}
