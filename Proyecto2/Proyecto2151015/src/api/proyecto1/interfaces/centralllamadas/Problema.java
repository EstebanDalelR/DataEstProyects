package api;

public class Problema implements IProblema
{
  private long estampilla;
  private TipoProblema tipo;
  private Punto lugar;
  
  public long getEstampillaTiempo()
  {
    return estampilla;
  }
  public void setEstampillaTiempo(long nEstampillaTiempo)
  {
    estampilla= nEstampillaTiempo;
  }
  public void setTipo(TipoProblema nTipo)
  {
    tipo=nTipo;
  }
  public TipoProblema getTipoProblema()
  {
    return tipo;
  }
  public Punto getPunto()
  {
    return lugar;
  }
  public void setPunto(Punto nPunto)
  {
    lugar=nPunto;
  }
}