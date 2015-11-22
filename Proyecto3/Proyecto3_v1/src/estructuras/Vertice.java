package estructuras;

public class Vertice<llave, valor>
{
	private Object llave;
	private Object valor;
	private Lista arco; 
	
	public Vertice()
	{
		llave = null;
		valor = null;
		arco = null;
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
	public Lista getArco() {
		return arco;
	}
	public void setArco(Lista arco) {
		this.arco = arco;
	}
	
}
