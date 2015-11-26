package mundo;

public class NodoDireccion 
{
	private String id;
	private String direccion;
	
	public NodoDireccion(String i, String d)
	{
		setId(i);
		setDireccion(d);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
