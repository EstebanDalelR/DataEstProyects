package estructuras;

public class Arco<valor> 
{
	private Object valor1;
	private Object valor2;
	private Vertice<Object, Object> origen;
	private Vertice<Object, Object> destino;
	
public Arco(Vertice<Object, Object> orig, Vertice<Object, Object> dest, Object v1, Object v2)
	{
		valor1 = v1;
		valor2 = v2;
		setOrigen(orig);
		setDestino(dest);
	}

	public Object getValor() {
		return valor1;
	}
	public void setValor(Object valor) {
		this.valor1 = valor;
	}

	public Vertice<Object, Object> getOrigen() {
		return origen;
	}

	public void setOrigen(Vertice<Object, Object> origen) {
		this.origen = origen;
	}

	public Vertice<Object, Object> getDestino() {
		return destino;
	}

	public void setDestino(Vertice<Object, Object> destino) {
		this.destino = destino;
	}

	public Object getValor2() {
		return valor2;
	}

	public void setValor2(Object valor2) {
		this.valor2 = valor2;
	}
}
