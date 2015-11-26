package estructuras;

import java.util.Arrays;



public class TablaHash 
{
	private int m = 2;
	private NodoHash[] th = new NodoHash[500];
	private NodoHash[] reserva = th;
	
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
	
	public Object buscarPorValor(Object value)
	{
		for(int i = 0; i < th.length; i++)
		{
			NodoHash b = th[i];
			if(b.getValor().equals(value))
			{
				return b.getLlave();
			}
		}
		return null;
	}
	
	public void agregar(Object key, Object value)
	{
		
		calcularCarga();
		m++;
		int i = hash(key);
		for(NodoHash x = th[i]; x != null; x = x.getSiguiente())
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
		System.out.println(th.length);
		int nuevoTamaño = th.length*2;
		th = new NodoHash[nuevoTamaño];
		for(int i = 0; i < reserva.length; i++)
		{
			NodoHash nh = reserva[i];
			if(nh != null)
			{
			agregar(nh.getLlave(),nh.getValor());
			}
		}
		
	}
	
	public void calcularCarga()
	{
		if(posicionesOcupadas() != 0)
		{
			if(posicionesOcupadas()/m > 0.75)
			{
				aumentarCapacidad();
			}
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
	
	public int devolverTamaño()
	{
		return th.length;
	}
}
