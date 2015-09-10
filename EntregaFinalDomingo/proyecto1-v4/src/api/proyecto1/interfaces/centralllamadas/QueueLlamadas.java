package api;

import estructuras.cola.ICola;

public class QueueLlamadas<T> implements serializable, ICola
{
  
  private int tamanioEst=0;
  private Object elementos[];
  
  public QueueLlamadas()
  {
    elementos= (T[]) new Object[tamanioEst];
  }
  public void agregarLlamada(T aAgregar)
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
  public T mostrarPrimerLlamada()
  {
    if(!elementos.isEmpty())
    {
      for(i=0;i<elementos.length;i++)
      {
        if(!elementos[i].equals(null))
        {
          return elementos[i];     
        }
      }
    }
    else
    {
      return null;
    }
  }
  public T atenderLlamada() 
  {
    if(!elementos.isEmpty())
    {
      for(i=0;i<elementos.length;i++)
      {
        if(!elementos[i].equals(null))
        {
          T elementoT= elementos[i];
          elementos[i]==null;
          return elementoT;     
        }
      }
    }
    else
    {
      return null;
    }
  }
}