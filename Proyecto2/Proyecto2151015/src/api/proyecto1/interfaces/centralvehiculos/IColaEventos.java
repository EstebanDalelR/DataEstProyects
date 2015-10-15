package api.proyecto1.interfaces.centralvehiculos;
import java.util.Collections;
import java.util.LinkedList;
/*
 * IColaEventos modela una cola de eventos definida como un conjunto de eventos que recibe de los vehiculos 
 */
public interface IColaEventos<IEventoVehiculo> extends Iterable
{
   /**
  * M�todo que retorna la lista de eventos 
  * @return Iterablea de eventos
  */
 public Iterable<IEventoVehiculo> getEventoVehiculo();

 /**
  * M�todo que permite cargar la lista de eventos 
  * @param segmentos
  */
 public void setEventos(Iterable<IEventoVehiculo> eventos);

 /**
  * Metodo encargado de agregar eventos a la cola
  * @param elemento - elemento a ser agregado en la Cola
  */
 public void encolar(T IEventoVehiculo);
 /**
  * M�todo que remueve un elemento de la Cola 
  *@return el elemento atendido y eliminado de la Cola
  */
 public IEventoVehiculo decolar();
 /**
  * M�todo que retorna el tama�o de la Cola
  *@return el tama�o actual de la Cola
  */
 public int darTamanio();
 /**
  * M�todo que verifica si la Cola est� vac�a
  * @return true si lo est�, false de lo contrario
  */
  public boolean estaVacia();
}
  
