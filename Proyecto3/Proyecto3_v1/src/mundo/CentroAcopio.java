package mundo;

public class CentroAcopio
{
	private int id;
	private double latitud;
	private double longitud;
	private boolean esCentro;
	
	public CentroAcopio(int id, double latitud, double longitud, boolean centro)
	{
		this.id=id;
		this.latitud = latitud;
		this.longitud = longitud;
		esCentro = centro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public boolean EsCentro() {
		return esCentro;
	}

	public void setEsCentro(boolean esCentro) {
		this.esCentro = esCentro;
	}
}
