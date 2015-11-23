package estructuras;

import java.util.Arrays;


public class TablaHash 
{
	private int m = 0;
	private NodoHash[] th = new NodoHash[1000];
	
	private int hash(Object key)
	{
		return (key.hashCode() & 0x7fffffff) % m;
	}
	
	public Object getValue(Object key)
	{
		int i = hash(key);
		for(NodoHash x = th[i]; x!= null; x = x.getSiguiente())
		{
			if(key.equals(x.getLlave()))
			{
				return (Object)x.getValor();
			}
		}
		return null;
	}
	
	public void agregar(Object key, Object value)
	{
		m++;
		int i = hash(key);
		for(NodoHash x = th[i]; x != null; x  = x.getSiguiente())
		{
			if(key.equals(x.getLlave()))
			{
				x.setValor(value);
				return;
			}
		}
		th[i] = new NodoHash(key, value, th[i]);
		m++;
	}
	
	public void aumentarCapacidad()
	{
		int nuevoTamaño = th.length*2;
		th = Arrays.copyOf(th, nuevoTamaño);
		m = th.length;
	}
	
	public void calcularCarga()
	{
		if(m/posicionesOcupadas() > 0.75)
		{
			aumentarCapacidad();
		}
	}
	
	public int posicionesOcupadas()
	{
		int contador = 0;
		for(int i = 0; i < th.length; i++)
		{
			Object o = th[i];
			if(o != null)
			{
				contador++;
			}
		}
		return contador;
	}
}
