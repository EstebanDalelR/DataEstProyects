package pry_estructuras;

import estructuras.lista.ILista;
import java.util.Iterator;
import java.util.Array;

public interface IArrayCaso extends Array
{

  
  public boolean agregar(Caso input)
  {
    add(input);
    return true;
  }
  public boolean eliminar(Caso input)
  {
    delete(input);
    return true;
  }
}