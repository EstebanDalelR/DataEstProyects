package api.proyecto1.interfaces.centralvehiculos;

/*
 * IRuta modela una ruta definida como un conjunto de segmentos
 */
public interface IRuta {

 /**
  * M�todo que retorna la lista de segmentos de la ruta
  * @return Iterablea de segmentos
  */
 public Iterable<ISegmento> getSegmentos();

 /**
  * M�todo que permite cargar la lista de segmentos para la ruta
  * @param segmentos
  */
 public void setSegmentos(Iterable<ISegmento> segmentos);

 /**
  * M�todo que permite buscar un segmento en la ruta por sus extremos
  * @param extremoInicial El extremo inicial del segmento
  * @param extremoFinal El extremo final del segmento
  * @return Segmento de la ruta (si existe) asociado a los extremos indicados
  */
 public ISegmento buscarSegmentoPorExtremos(IPunto extremoInicial, IPunto extremoFinal);

 /**
  * M�todo que permite saber si un punto pertenece a un segmento de la ruta
  * @param punto punto del que se desea saber si pertenece a un segmento de la ruta
  * @return true si el punto pertenece a un segmento de la ruta, false de lo contrario
  */
 public boolean puntoEnSegmentoDeRuta(IPunto punto);

 /**
  * M�todo que permite cargar los eventos autorizados para la ruta,
  * se debe verificar si los cambios de posici�n entre los eventos
  * son horizontales o verticales y si suceden en segmentos de la ruta.
  * @param eventosAutorizados lista de eventos autorizados
  */
 public void setEventosAutorizados(Iterable<IEventoVehiculo> eventosAutorizados);

 /**
  * M�todo que permite obtener el listado de eventos autorizados para la ruta
  * @return La lista con los eventos de la ruta
  */
 public Iterable<IEventoVehiculo> getEventosAutorizados();
}
