package api.proyecto1.interfaces.centralvehiculos;
import java.util.Stack;

public class PilaEventosSospechosos implements IPilaEventosSospechosos{
  Node first;
  int size;
  public PilaEventosSospechosos(){  
  Stack pilaSos= new Stack();
  size=0;
  }
  /**
   * Metodo que verifica si la Pila esta vacia 
   * @return true si lo está, false de lo contrario
   */
  public boolean estaVacia(){
    if(pilaSos.size()!=0){
    return false;
    }
    else {
      return true;
    }
    }
  ´public EventoVehiculo peek(){
  return first.element;
  }
  /**
   * Metodo que remueve un elemento de la Pila(LIFO)
   *@return elemento atendido y removido de la Pila  
   */
  public EventosVehiculo pop(){
    EventoVehiculo temp = first.element;
    first = first.next();
    size--;
    return temp;
  }
  /**
   * Metodo que agrega un nuevo elemento a la Pila (LIFO)
   *@param elemento a ser agregado en la Pila
   */
  public void push(EventosVehiculo e){
  Node newNode = new Node(e, first);
      first = newNode;       
      size++;                   
    pilaSos.push(e);
  }
  /**
   * Metodo que retorna el tamanio de la pila
   *@return tamanio Pila
   */
  public int darTamanio(){
    return size;
  }
  public int search(EventoVehiculo s){
  Node actual= first;
  for(int i=1; i < size ; i++){
    if(actual.element==s){
    return i;
    actual = actual.next();
    }
  return -1;
  }
  }
  }
  
