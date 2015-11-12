package estructuras;



public class NodoHash<llave, valor>
{
	private Object llave;
	private Object valor;
	private NodoHash siguiente;
	
	public NodoHash(Object key, Object value, NodoHash next)
	{
		setLlave(key);
		setValor(value);
		setSiguiente(next);
	}

	public Object getLlave() {
		return llave;
	}

	public void setLlave(Object llave) {
		this.llave = llave;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}

	public NodoHash getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoHash siguiente) {
		this.siguiente = siguiente;
	}
}
