package estructuras;

public class Arco<valor> 
{
	private Object valor;
	private Vertice<Object, Object> origen;
	private Vertice<Object, Object> destino;
	
	public Arco()
	{
		valor = null;
		setOrigen(null);
		setDestino(null);
	}

	public Object getValor() {
		return valor;
	}
	public void setValor(Object valor) {
		this.valor = valor;
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
}
