package api.proyecto1.interfaces.centralvehiculos;
import java.util.Queue; 
import java.util.LinkedList?
import estructuras.cola.ICola;


public class ColaEventos<T> implements IColaEventos{
  private Node first;
  private int size;
  public ColaEventos(){  
  Queue<Object> cola = new LinkedList<T>();
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
  public T peek(){
  return first.element;
  }
  /**
   * Metodo que remueve un elemento de la Cola(FIFO)
   *@return elemento atendido y removido de la Cola  
   */
  public T poll(){
    T temp = first.element;
    first = first.siguiente();
    size--;
    return temp;
  }
  /**
   * Metodo que agrega un nuevo elemento a la Cola (FIFO)
   *@param elemento a ser agregado en la Cola
   */
  public void offer(T e){
    if(size!=0){
      Node temp = first;
      while(temp.siguiente()!=null){
        temp.siguiente();
      }
      Node nuevo = new Node( e, null);
      temp.cambiarSiguiente(nuevo);
    }
    else{
    Node nuevo = new Node( e, null);
    }
  }
  /**
   * Metodo que retorna el tamanio de la cola
   *@return tamanio Cola
   */
  public int size(){
    return size;
  }
  /**
   * Metodo que busca la posicion de un objeto dentro de la cola
   * @param Object e objeto a buscar
   * @return la posicion del objeto dentro de la cola; -1 si el objeto no esta en la cola
   */
  public int search(T s){
  Node actual= first;
  for(int i=1; i < size ; i++){
    if(actual.element==s){
    return i;
    actual = actual.next();
    }
  return -1;
  }
  }
  /**
   * Metodo que verifica si la cola contiene un objeto
   * @param Object e objeto a verificar
   * @return true si la cola contiene el objeto; false de lo contrario
   */
  public boolean contains(T e){
    if(this.search(e)!=-1){
    return true;
    }
    else {
    return false;
    }
  }
  /**
   * Metodo que elimina todos los elementos de la cola 
   */ 
  public void clear(){
  first=null;
  }
  
  }