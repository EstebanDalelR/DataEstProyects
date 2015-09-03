package api.proyecto1.interfaces.centralvehiculos;
public class NodeLista <Object>{
T element;
Node next;
Node prev;
public NodeLista(T ele, NodeLista link, NodeLista anterior){
elemnt=ele;
next=link;
prev=anterior;
}
public T siguiente(){
return this.next;
}
public T anterior(){
return this.anterior;
}
public void cambiarSiguiente(NodeLista link){
  NodeLista temp = this.siguiente();
  NodeLista nuevo = link;
  next=nuevo;
  if(temp!=null){
  nuevo.cambiarSiguiente(temp);
  temp.cambiarAnterior(nuevo);
  }
  else{
  nuevo.cambiarSiguiente(null);  
  }
  nuevo.cambiarAnterior(this);
}
public void cambiarAnterior(NodeLista link){
 NodeLista previ = this.anterior();
 NodeLista nuevo = link;
 if(previ==null){
    prev=link;
    previ=this.anterior();
    previ.cambiarSiguiente(this);   
 }
  else {
  prev=nuevo;
  previ.cambiarSiguiente(nuevo);
  nuevo.cambuarAnterior(previ);
  nuevo.cambiarSiguiente(this);
  }
}
public T darElemento(){
return element;
}
}