package api;

import estructuras.cola.ICola;

public class ListaAgentes<T> implements serializable, ILista
{
  
  private tamanioEst=0;
  private Object elementos[];\
    
    public ListaAgentes()
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
  public T eliminarAgente(T input)
  {
    for(i=0;i<elementos.length;i++)
    {
      if(elementos[i].equals(input))
      {
        T retornar=elementos[i];
        elementos[i]==null;
        return retornar;     
      }
    }
    return null;
  }
  public T atenderAgente() 
  {
    for(i=0;i<elementos.length;i++)
    {
      if(!elementos[i].equals(null))
      {
        T retornar=elementos[i];
        elementos[i]==null;
        return retornar;    
      }
    }
    return null;
  }
}