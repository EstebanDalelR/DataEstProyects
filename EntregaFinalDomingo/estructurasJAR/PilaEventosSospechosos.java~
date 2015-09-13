package api.proyecto1.interfaces.centralvehiculos;
import java.util.Stack;

public class PilaEventosSospechosos implements IPilaEventosSospechosos{
private Node first;
private int size;
private Vehiculo vehicu;
private Ruta rut;
  public Iterable<T> PilaEventosSospechosos(Vehiculo vehiculo, Ruta ruta){  
  PilaEventosSospechosos pilaSos= new PilaEventosSospechosos();
  vehicu = vehiculo;
  rut = ruta;
  size=0;
  }
  /**
   * Metodo que verifica si la Pila esta vacia 
   * @return true si lo está, false de lo contrario
   */
  public boolean isEmpty(){
    if(pilaSos.size()!=0){
    return false;
    }
    else {
      return true;
    }
    }
  public Object peek(){
  return first.element;
  }
  /**
   * Metodo que remueve un elemento de la Pila(LIFO)
   *@return elemento atendido y removido de la Pila  
   */
  public Object pop(){
    Object temp = first.element;
    first = first.next();
    size--;
    return temp;
  }
  /**
   * Metodo que agrega un nuevo elemento a la Pila (LIFO)
   *@param elemento a ser agregado en la Pila
   */
  public void push(Object e){
  Node newNode = new Node(e, first);
      first = newNode; 
      size++;                   
   // pilaSos.push(e);
  }
  /**
   * Metodo que retorna el tamanio de la pila
   *@return tamanio Pila
   */
  public int size(){
    return size;
  }
  public int search(Object s){
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
   * Metodo que verifica si la pila contiene un objeto
   * @param Object e objeto a verificar
   * @return true si la pila contiene el objeto; false de lo contrario
   */
  public boolean contains(Object e){
    if(this.search(e)!=-1){
    return true;
    }
    else {
    return false;
    }
  }
    /**
   * Metodo que elimina todos los elementos de la pila 
   */ 
  public void clear(){
  first=null;
  }
  public ArrayList toArray(){
   Node temp = first;
   ArrayList nueva = new ArrayList<T>;
   while(temp.next()!=null){
   Object a =temp.pop();
   nueva.add(a);
   }
  }
  }
  
