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
  public T buscarCliente(T aBuscar)
  {
    for(i=0; i<elementos.size;i++)
    {
      if(elementos[i].equals(aBuscar)
      {
        return elementos[i];
      }
    }
    return null;
  }
  public T buscarPorIndice(int indice)
  {
    if(indice>=0&&indice<elementos.length)
    {
      return elementos[i];
    }
  }
  
  