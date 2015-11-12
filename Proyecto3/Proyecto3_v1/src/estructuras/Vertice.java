package estructuras;

public class Vertice<llave, valor>
{
	private Object llave;
	private Object valor;
	private Arco arco; 
	
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
	public Arco getArco() {
		return arco;
	}
	public void setArco(Arco arco) {
		this.arco = arco;
	}
	
}
