package api.proyecto1.interfaces.centralvehiculos;
public class BitacoraEventos<T> {
private NodeLista nodo;
private int size; 
private Vehiculo ve;
private Ruta ru;
public BitacoraEventos(Vehiculo vehiculo, Ruta ruta){
BitacoraEventos bitacoara = new BitacoraEventos;
size=0;
ve=vehiculo;
ru=ruta;
}
public Vehiculo darVehiculo(){
return ve;
}
public Ruta darRuta(){
return ru;
}
public int darTamanio(){
return size;
}

public boolean estaVacia(){
  if(darTamanio==0){
  return true;
  }  
  else{
    return false;
  }
}

public T buscar(T e){
  boolean a = false;
  NodoLista temp = nodo;
  while(temp!=null){
    if(temp.darElemento==e){
    return temp;
    a=true;
    }
    temp=temp.siguiente();   
  }
  if(a==false){
  return null;
  }
}
  
public T dar(int posicion){
  T buscado = null;
  NodeLista temp = nodo;
  int contador=0;
  if(posicion>darTamanio()){
    return buscado;
  }
  else {
    while (temp!=null){
      if(contador==posicion){
      return temp;
      }
      else{
      contador++;
      temp= temp.siguiente();
      }    
    }
  }
  }

public T eliminar(T e){
T buscado = this.buscar(e);
if(buscado == null){
return null;
}
else{
NodeLista anteriorAlB = buscado.anterior();
NodeLista siguienteAlB = buscado.siguiente();
anteriorAlB.cambiarSiguiente(siguienteAlB);
siguienteAlB.cambiarAnterior(anteriorAlB);
size--;
return buscado;
}
}

public void agregarAlPrincipio(T elem){
  if(size==0){
    NodeLista nuevo = new NodeLista(elem, null, null);
  nodo=nuevo;
  
  }
  else{
  NodeLista nuevo = new NodeLista(elem, nodo, null);
  nodo.cambiarAnterior(nuevo);
  nodo=nuevo;
  }
  size++;
}
/**
 * M�todo que agrega un elemento al final de la Lista
 * @param elem - elemento a ser agregado
 */
public void agregarAlFinal(T elem){
if(size==0){
    NodeLista nuevo = new NodeLista(elem, null, null);
  nodo=nuevo;
  }
else{
NodeLista ultimo = dar(darTamanio);
NodeLista nuevo = new NodeLista(elem, null, ultimo);
ultimo.cambiarSiguiente(nuevo);
}
size++;
}
/**
 * M�todo que agrega un nuevo elemento en la Lista, antes de otro elemento de referencia
 * @param elem - elemento a ser agregado en la Lista
 * @param ref - elemento de referencia. El nuevo elemento se agregar� antes de este elemento en la Lista.
 * @return true si el elemento pudo ser agregado, false de lo contrario
 */
public boolean agregarAntesDe(T elem,T ref){
NodeLista anterior = buscar(ref);
if(anterior==null){
return false;
}
else{
NodeLista nuevo = new NodeLista(elem, anterior , null);
anterior.cambiarAnterior(nuevo);
return true;
size++;
}
}
/**
 * M�todo que agrega un nuevo elemento en la Lista, despues de otro elemento de referencia
 * @param elem - elemento a ser agregado en la Lista
 * @param ref - elemento de referencia. El nuevo elemento se agregar� despues de este elemento en la Lista.
 * @return true si el elemento pudo ser agregado, false de lo contrario
 */
public boolean agregarDespuesDe(T elem,T ref){
NodeLista anterior = buscar(ref);
if(anterior==null){
return false;
}
else{
NodeLista nuevo = new NodeLista(elem, null , anterior);
anterior.cambiarSiguiente(nuevo);
return true;
size++;
}
}
public T darElemento(){
  return nodo.darElemento();
}
public void eliminar repetidos(){
    for(int i =0;i-bitacora.darTamanio()-1;i++){
    EventoVehiculo temp = bitacora.get(i);
    for(int j=i+1;j-bitacora.darTamanio();j++){
    EventoVehiculo revisar = bitacora.get(j);
    if(temp.getEstampillaTiempo().equals(revisar.getEstampillaTiempo())&&temp.getTipo()==revisar.getTipo()){
    T eliminado = bitacora.eliminar(revisar);
    }
    }
    }
  }
  public void recibirEventos(){}

}


