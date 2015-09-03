package api.proyecto1.interfaces.centralvehiculos;
/*
 * Segmento se refiere a un segmento definido por un punto inicial y un punto final 
 * un segmento debe ser �nicamente horizontal o vertical
 */
public class Segmento implements ISegmento{
Punto puntoInicial;
Punto puntoFinal;
boolean horiVert;

public Segmento(Punto inicial, Punto pFinal){
puntoInicial = inicial;
puntoFinal = pFinal;
}
/**
  * Metodo que permite obtener el punto de salida del segmento
  * @return punto de salida del segmento
  */
public Punto getPuntoSalida(){
return puntoInicial;
}

 /**
  * Metodo que permite obtener el punto de llegada del segmento
  * @return punto de llegada del segmento
  */
public Punto getPuntoLlegada(){
return puntoFinal;
}

 /**
  * Metodo que permite establecer el punto de salida del segmento
  * @param puntoSalida punto de salida del segmento
  */
public void setPuntoSalida(Punto puntoSalida){
puntoInicial = puntoSalida;
}

 /**
  * Metodo que permite establecer el punto de llegada del segmento
  * @param puntoLlegada punto de llegada del segmento
  */
public void setPuntoLlegada(Punto puntoLlegada){
puntoFinal = puntoLlegada;
}

 /**
  * Método que permite saber si un punto dado pertenece al segmento
  * @param punto punto del cual se desea saber si pertenece al segmento
  * @return true si el punto pertenece al segmento, false de lo contrario
  */
public boolean puntoPerteneceSegmento(Punto punto){
  if(punto == puntoInicial || punto == puntoFinal){
  return true;
  }
  else {
  return false;
  }
}


}