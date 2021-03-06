package estructuras;

public class GrafoDirigido 
{
	private TablaHash vertices;
	private Lista<Arco> arcos;
	private TablaHash nombres;
	
	public GrafoDirigido()
	{
		vertices = new TablaHash();
		arcos = new Lista<Arco>();
		nombres = new TablaHash();
	}
	
	public void aņadirNodo(Object llave, Object valor)
	{
		vertices.agregar(llave, valor);
	}
	
	public void aņadirArco(Arco value)
	{
		arcos.agregar(value);
	}
	
	public void aņadirNombre(Object llave, Object valor)
	{
		nombres.agregar(llave, valor);
	}
	
	public Object obtenerVertice(Object llave)
	{
		return vertices.getValue(llave);
	}
	
	public Object obtenerArco(Arco valor)
	{
		return arcos.buscar(valor);
	}
	
	public Object obtenerNombre(Object llave)
	{
		return nombres.getValue(llave);
	}
	
	public TablaHash devolverVertices()
	{
		return vertices;
	}
	
	public Lista devolverArcos()
	{
		return arcos;
	}
	
	public TablaHash devolverNombres()
	{
		return nombres;
	}
}
