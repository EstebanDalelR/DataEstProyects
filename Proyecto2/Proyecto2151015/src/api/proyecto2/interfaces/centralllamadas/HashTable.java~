package api;

import estructuras.cola.ILista;

public class HashTable<T> implements serializable, ILista
{
  
  private int tamanioEst=0;
  private Lista elementos[];

  //elemento es value, llave es key
  
  //------------------------------------
  //Constructors
  //------------------------------------
  //un construtor para una estructura vacía
  
  public HashTable()
  {
    elementos= (T[]) new Object[tamanioEst];
  }
  //un constructor para un tamaño
  public HashTable(int tam)
  {
    elementos= (T[]) new Object[tam];
  }

  //------------------------------------
  //Methods
  //------------------------------------
  public void agregar(T aAgregar)
  {
    calcularCarga();
    elementos[hashCode()].agregar(aAgregar);
  }

  //este hashTable permite varios mapeos a la misma llave
  
  public Lista obtener(int llave)
  {
    Lista retornar = new Lista[];
    if(!elementos[llave]==null)
    {
    retornar = elementos[llave];
    }
    return retornar;
  }
  public boolean contains(Key key)
  {
   return get(key) != null;
  }
  
  public T buscar(Key key)
  {
     int j = hash(key);
     for(i=0;i<elementos.legth();i++
     {
         if (j==elementos.obtener(i))
         {
           return elementos[i].get(key);
         }
     }
  }
  public void agrandarArreglo()
  {
    int nuevoTamanio= elementos.length*2;
    elementos= Arrays.copyOf(elementos, nuevoTamanio);
    tamanioEst= nuevoTamanio;
  }
  
  public void calcularCarga()
  {
  if(tamanioEst/darTamano>=0.75)
    {
    agrandarArreglo();
    }
  }
  
  public boolean contieneLlave(int aBuscar)
  {
    Lista aComparar = darLlaves();
    for(i =0; i<elementos.length; i++)
    {
      if(aComparar[i]==aBuscar)
      { 
      return true;
      }
    }
    return false;
  }
  
  //hashCode para ubicar el elemento
  
  public int hashCode(T elemento)
  {
  return elemento.toInt()%tamanioEst;
  }
  
  public boolean contieneElemento(T aBuscar)
  {
    Lista aComparar = darElementos();
    for(i =0; i<elementos.length; i++)
    {
      if(aComparar[i].equals(aBuscar))
      { 
      return true;
      }
    }
    return false;
  }
  
  public Lista darLlaves()
  {
    Lista retornar = new Lista[];
   if(estaVacio())
    {
    return null;
    }
    for (i =0; i<elementos.length; i++)
    {
      if(elementos[i]==null)
      {}
      else
      {
      retornar.agregar(i);
      }
    }
    return retornar;
  }
  
  public Lista darElementos() 
  {
  Lista retornar = new Lista[];
   if(estaVacio())
    {
    return null;
    }
    for (i =0; i<elementos.length; i++)
    {
      if(elementos[i]==null)
      {}
      else
      {
      retornar.agregar(elementos[i]);
      }
    }
    return retornar;
  }
  
  public int darTamano()
  {
    if(estaVacio())
    {
    return 0;
    }
    int contador =0;
    for (i = 0; i <elementos.length; i++)
    {
      if(elementos[i]==null)
      {}
      else
      {
      contador += elementos[i].length ;
      }
    }
    return contador;
  }

  public boolean estaVacio()
  {
    if (elementos.length ==0)
    {
      return true;
    }
    else
    {
      return false
    }
  }
}