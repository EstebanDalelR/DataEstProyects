package estructuras;

import java.util.Arrays;



public class Lista<T>
{
  private int tamanioEst=0;
  private Object elementos[];
  
  public Lista()
  {
    elementos= (T[]) new Object[tamanioEst];
  }
  public void agregar(T aAgregar)
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
  public T buscar(T aBuscar)
  {
    for(int i = 0; i < elementos.length; i++)
    {
      if(elementos[i].equals(aBuscar))
      {
        return (T) elementos[i];
      }
    }
    return null;
  }
  
  public int darTamaño()
  {
	  return tamanioEst;
  }
  
}