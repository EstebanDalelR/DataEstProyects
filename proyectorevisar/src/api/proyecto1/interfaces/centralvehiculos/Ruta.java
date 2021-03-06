package api.proyecto1.interfaces.centralvehiculos;

/*
 *Ruta modela una ruta definida como un conjunto de segmentos
 */
public class Ruta implements IRuta {
 ListaSegmentos listaSegmentos;
 ListaEventosAutorizados listaEventosAutorizados;
  
  public Ruta(){
  ListaSegmentos listaSegmentos = new ListaSegmentos();
  ListaEventosAutorizados listaEventosAutorizados = new ListaEventosAutorizados();
  }

 /**
  * Metodo que retorna la lista de segmentos de la ruta
  * @return Iterablea de segmentos
  */
  public Iterable<ListaSegmento> getSegmentos(){
  return listaSegmentos;
  }

 /**
  * Metodo que permite cargar la lista de segmentos para la ruta
  * @param segmentos
  */
  public void setSegmentos(Iterable<Segmento> segmentos){
    while(segmentos!=null){
      
      listaSegmemtos.agregarAlPrincipio(segmento);
      segmentos.next();
    }
    return listaSegmentos;
  }

 /**
  * Metodo que permite buscar un segmento en la ruta por sus extremos
  * @param extremoInicial El extremo inicial del segmento
  * @param extremoFinal El extremo final del segmento
  * @return Segmento de la ruta (si existe) asociado a los extremos indicados
  */
  public Segmento buscarSegmentoPorExtremos(Punto extremoInicial, Punto extremoFinal){
    Segmento temporal = null;
    boolean encontro= false;
    for(int i =0; i<listaSegmentos.darTamanio()&&!encontro;i++){
    temporal = listaSegmentos.dar(i);
    if(temporal.getPuntoSalida()==extremoInicial&&temporal.getPuntoLlegada()==extremoFinal){
    encontro=true;
    return temporal;
    }
    }
    if(encontro==false){
    return null;
    }
  }

 /**
  * Metodo que permite saber si un punto pertenece a un segmento de la ruta
  * @param punto punto del que se desea saber si pertenece a un segmento de la ruta
  * @return true si el punto pertenece a un segmento de la ruta, false de lo contrario
  */
  public boolean puntoEnSegmentoDeRuta(Punto punto){
  boolean pertenece = false;
  for(int i=0;i<listaSegmentos.darTamanio()&&!pertenece;i++){
    Segmento temporal = listaSegmentos.dar(i);
    if(temporal.puntoPerteneceSegmento(punto)){
    pertenece = true;
    }
  }
  return pertenece;
  }

 /**
  * Metodo que permite cargar los eventos autorizados para la ruta,
  * se debe verificar si los cambios de posicion entre los eventos
  * son horizontales o verticales y si suceden en segmentos de la ruta.
  * @param eventosAutorizados lista de eventos autorizados
  */
  public void setEventosAutorizados(Iterable<IEventoVehiculo> eventosAutorizados){
  ListaEventosAutorizados listaEventosAutorizados = enventosAutorizados;
  }

 /**
  * Metodo que permite obtener el listado de eventos autorizados para la ruta
  * @return La lista con los eventos de la ruta
  */
  public Iterable<IEventoVehiculo> getEventosAutorizados(){
  return listaEventosAutorizados;
  }
}
