package api.proyecto1.interfaces.centralvehiculos;
import java.util.Collections;
import java.util.LinkedList;
public class ColaEventos implements IColaEventos{
  LinkedList colaEventosSospechosos = new LinkedList();
  public void encolar(EventoVehiculo evento){
  colaEventosSospechosos.addFirst(evento);
  }
  public EventoVehiculo decolar(){
  return (EventoVehiculo)colaEventosSospechosos.removeLast();
  }
  
  
  
   /**
  * Mï¿½todo que retorna la lista de eventos 
  * @return Iterablea de eventos
  */
  public LinkedList<EventoVehiculo> getEventoVehiculo(){
 LinkedList aRetornar = new LinkedList();
 while(colaEventosSospechosos.peek()!=null){
 EventoVehiculo event = colaEventosSospechosos.desencolar();
   aRetornar.encolar(event);
 }
return aRetornar;
  }
 /**
  * Mï¿½todo que permite cargar la lista de eventos 
  * @param eventos
  */
  public void setEventos(Iterable<IEventoVehiculo> eventos){
    while(eventos.hasNext()){
    colaEventosSospechosos.encolar(evento);
      eventos.next;
  }
  }

 /**
  * Mï¿½todo que permite buscar un evento en la ruta por sus extremos
  * @param extremoInicial El extremo del segmento del evento
  * @return EventoVehiculo de la ruta (si existe) asociado a el punto geografico
  */
 public IEventoVehiculo buscarEventoVehiculoPorUbicacion(IPunto extremo);

 /**
  * Mï¿½todo que permite cargar los eventos autorizados para la ruta,
  * se debe verificar si los cambios de posiciï¿½n entre los eventos
  * son horizontales o verticales y si suceden en segmentos de la ruta.
  * @param eventosAutorizados lista de eventos autorizados
  */
 public void setEventosAutorizados(Iterable<IEventoVehiculo> eventosAutorizados);

 /**
  * Mï¿½todo que permite obtener el listado de eventos autorizados para la ruta
  * @return La lista con los eventos de la ruta
  */
 public Iterable<IEventoVehiculo> getEventosAutorizados();

 /**
  * Método que retorna el tamaño de la Cola
  *@return el tamaño actual de la Cola
  */
 public int darTamanio(){
   int cuantos=0;
   while(colaEventosSospechosos.peek()!=null){
     cuantos++;
 }
   return cuantos;
 }
 /**
  * Método que verifica si la Cola está vacía
  * @return true si lo está, false de lo contrario
  */
 public boolean estaVacia(){
   if(darTamanio!=0){
   return true;
   }
   else{
   return false;
   }
 }
  
  
}