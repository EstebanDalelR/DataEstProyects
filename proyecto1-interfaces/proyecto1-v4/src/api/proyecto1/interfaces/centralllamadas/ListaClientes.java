package api;

import estructuras.ILista;

public class ListaClientes<T> implements ILista
{
  private int tamanioEst=0;
  private Object elementos[];
  
  public ListaClientes()
  {
     elementos= (T[]) new Object[tamanioEst];
  }
  public void agregarAgente(T aAgregar)
  {
    if(tamanioEst== elementos.length)
    {
      agrandarArreglo();
    }
    elementos [tamanioEst++] =aAgregar;
  }
   public void agrandarArreglo()
  {
    int nuevoTamanio= elementos.length*2;
    elementos= Arrays.copyOf(elementos, nuevoTamanio);
  }
  public void 
  