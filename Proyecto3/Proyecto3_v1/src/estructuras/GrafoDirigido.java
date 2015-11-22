package estructuras;

public class GrafoDirigido 
{
	private TablaHash vertices;
	private Lista<Object> arcos;
	private TablaHash nombres;
	
	public GrafoDirigido()
	{
		vertices = new TablaHash();
		arcos = new Lista<Object>();
		nombres = new TablaHash();
	}
	
	public void añadirNodo(Object llave, Object valor)
	{
		vertices.agregar(llave, valor);
	}
	
	public void añadirArco(Object value)
	{
		arcos.agregar(value);
	}
	
	public void añadirNombre(Object llave, Object valor)
	{
		nombres.agregar(llave, valor);
	}
	
	public Object obtenerVertice(Object llave)
	{
		return vertices.getValue(llave);
	}
	
	public Object obtenerArco(Object valor)
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
}
