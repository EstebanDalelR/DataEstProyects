package api.proyecto1.interfaces.centralvehiculos;
public class Node <T>{
T element;
Node next;
public Node(T ele, Node link){
elemnt=ele;
next=link;
}
public T siguiente(){
return this.next;
}
public void cambiarSiguiente(Node link){
  Node temp = this.next;
  next=link;
  if(temp!=null){
  next.cambiarSiguiente(temp);
  }
  
}
public T darElemento(){
return element;
}
}