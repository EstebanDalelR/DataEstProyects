package api.proyecto1.interfaces.centralvehiculos;
import java.util.Stack;
/**
 * IPilaEventosSospechosos modela una cola de eventos definida como un conjunto de eventos que recibe de los vehiculos 
 */
public interface IPilaEventosSospechosos<IEventoVehiculo> extends Iterable{
  /**
   * Metodo que verifica si la Pila esta vacia 
   * @return true si lo está, false de lo contrario
   */
  public boolean estaVacia();
  /**
   * Metodo que remueve un elemento de la Pila(LIFO)
   *@return elemento atendido y removido de la Pila  
   */
  public IEventosVehiculo pop();
  /**
   * Metodo que agrega un nuevo elemento a la Pila (LIFO)
   *@param elemento a ser agregado en la Pila
   */
  public void push(IEventosVehiculo e);
  /**
   * Metodo que retorna el tamanio de la pila
   *@return tamanio Pila
   */
  public int darTamanio();
  }
  