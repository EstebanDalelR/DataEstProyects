package api;

import estructuras.cola.ICola;

public class QueueAgentes<T> implements serializable, ICola
{
  
  private tamanioEst=0;
  private Object elementos[];\
    
    public QueueAgentes(){
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
  public T mostrarPrimerAgente()
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
  public void atenderAgente() 
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