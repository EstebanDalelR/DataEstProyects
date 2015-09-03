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
  * M�todo que retorna la lista de eventos 
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
  * M�todo que permite cargar la lista de eventos 
  * @param eventos
  */
  public void setEventos(Iterable<IEventoVehiculo> eventos){
    while(eventos.hasNext()){
    colaEventosSospechosos.encolar(evento);
      eventos.next;
  }
  }

 /**
  * M�todo que permite buscar un evento en la ruta por sus extremos
  * @param extremoInicial El extremo del segmento del evento
  * @return EventoVehiculo de la ruta (si existe) asociado a el punto geografico
  */
 public IEventoVehiculo buscarEventoVehiculoPorUbicacion(IPunto extremo);

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

 /**
  * M�todo que retorna el tama�o de la Cola
  *@return el tama�o actual de la Cola
  */
 public int darTamanio(){
   int cuantos=0;
   while(colaEventosSospechosos.peek()!=null){
     cuantos++;
 }
   return cuantos;
 }
 /**
  * M�todo que verifica si la Cola est� vac�a
  * @return true si lo est�, false de lo contrario
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