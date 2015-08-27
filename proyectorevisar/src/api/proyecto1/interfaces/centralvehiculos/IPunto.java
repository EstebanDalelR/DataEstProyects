package api.proyecto1.interfaces.centralvehiculos;

/*
 * IPunto se refiere a un punto como el par ordenado latitud y longitu de una zona geogr�fica
 */
public interface IPunto {

 /**
  * M�todo que permite obtener la latitud de un punto
  * @return la latitud del punto
  */
 public double getLatitud();

 /**
  * M�todo que permite establecer la latitud de un punto
  * @param latitud latitud del punto
  */
 public void setLatitud(double latitud);

 /**
  * M�todo que permite obtener la longitud de un punto
  * @return la longitud del punto
  */
 public double getLongitud();

 /**
  * M�todo que permite establecer la longitud de un punto
  * @param latitud longitud del punto
  */
 public void setLongitud(double longitud);
}
