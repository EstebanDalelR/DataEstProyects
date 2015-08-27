package api.proyecto1.interfaces.centralvehiculos;

/*
 * ISegmento se refiere a un segmento definido por un punto inicial y un punto final (ver IPunto)
 * un segmento debe ser �nicamente horizontal o vertical
 */
public interface ISegmento {

 /**
  * Método que permite obtener el punto de salida del segmento
  * @return punto de salida del segmento
  */
 public IPunto getPuntoSalida();

 /**
  * Método que permite obtener el punto de llegada del segmento
  * @return punto de llegada del segmento
  */
 public IPunto getPuntoLlegada();

 /**
  * Método que permite establecer el punto de salida del segmento
  * @param puntoSalida punto de salida del segmento
  */
 public void setPuntoSalida(IPunto puntoSalida);

 /**
  * Método que permite establecer el punto de llegada del segmento
  * @param puntoLlegada punto de llegada del segmento
  */
 public void setPuntoLlegada(IPunto puntoLlegada);

 /**
  * Método que permite saber si un punto dado pertenece al segmento
  * @param punto punto del cual se desea saber si pertenece al segmento
  * @return true si el punto pertenece al segmento, false de lo contrario
  */
 public boolean puntoPerteneceSegmento(IPunto punto);


}
