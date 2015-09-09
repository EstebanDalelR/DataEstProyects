package api.proyecto1.interfaces.centralvehiculos;
import java.io.File;
import java.util.Date;

/*
 * CentralVehiculos se refiere a la parte A del enunciado de proyecto 1
 */
public class CentralVehiculos {
private ArrayList listaVehiculos;
private ArrayList listaBitacoras;
private PilaEventosSospechos pilaEventos;
 /**
  * Metodo que permite iniciar la central de veh�culos, realiza las acciones
  * necesarias para que la central de veh�culos pueda atender los eventos de control
  */
public void iniciarCentralVehiculos(){
Gson aLeer = new ProcessJSON;
}

 /**
  * M�todo que le permite a la central recibir y procesar los eventos de control asociados a la central de
  * veh�chulos. Este m�todo es el punto de entrada para todos los datos de la central de veh�culos,
  * y va a permitir la verificaci�n de los requerimientos funcionales de la soluci�n.
  * @param archivo Archivo Json con los eventos de control para ser procesados por la central
  */
 public void recibirEventosControl(File archivo){
    //leer JSON
  }

 /**
  * M�todo que permite cargar una ruta a un veh�culo
  * @param vehiculo al que se le desea cargar la ruta
  * @param ruta ruta que se desea cargar en el veh�culo
  */
 public void cargarRutaVehiculo(IVehiculo pVehiculo, IRuta ruta){
   for(int i =0;i<listaVehiculos.size()&&encontro==false; i++){
   Vehiculo temp = listaVehiculos.get(i);
   if (temp.darId()==pVehiculo.darId()){
   encontro =true;
   temp.setRuta(ruta);
   }
   }
 }

 /**
  * M�todo que permite cargar un listado de eventos autorizados para una ruta
  * @param vehiculo El veh�culo para el cual se van a cargar los eventos autorizados (ver enum TipoEventoVehiculo)
  * @param ruta ruta a la que se desean cargar los eventos autorizados
  * @param eventosAutorizados eventos autorizados para la ruta
  */
 public void cargarEventosAutorizadosRuta(IVehiculo vehiculo, IRuta ruta, Iterable<IEventoVehiculo> eventosAutorizados){
   cargarRutaVehiculo(vehiculo, ruta);
   ruta.setEventosAutorizados(eventosAutorizados);
 }

 /**
  * M�todo que permite marcar el inicio de una ruta para un veh�culo
  * @param vehiculo veh�culo que inicia la ruta
  * @param ruta ruta a realizar
  * @param eventoInicio evento de inicio que informa del inicio de la ruta y el combustible inicial
  */
 public void iniciarRutaVehiculo(IVehiculo vehiculo, IRuta ruta, IEventoVehiculo eventoInicio){
   if(eventoInicio==INICIAR_RUTA){
   for(int i =0;i<listaVehiculos.size()&&encontro==false; i++){
   Vehiculo temp = listaVehiculos.get(i);
   if (temp.darId()==vehiculo.darId()){
   encontro =true;
   temp.iniciarRuta(ruta);
   }
 }
 }
 }
 /**
  * M�todo que permite marcar el final de una ruta para un veh�culo por medio
  * de un evento de fin de ruta
  * @param vehiculo veh�culo que termina la ruta
  * @param ruta ruta completada por el veh�culo
  * @param eventoFinal evento de finalización que informa del fin de la ruta y el combustible final
  */
   public void finalizarRutaVehiculo(IVehiculo vehiculo, IRuta ruta, IEventoVehiculo eventoFinal){
      if(eventoFinal==TERMINAR_RUTA){
   for(int i =0;i<listaVehiculos.size()&&encontro==false; i++){
   Vehiculo temp = listaVehiculos.get(i);
   if (temp.darId()==vehiculo.darId()){
   encontro =true;
   temp.finalizarRuta(ruta);
   }
   }
   }
   }

 /**
  * M�todo que permite unificar los eventos de un veh�culo para una ruta, reportados por el veh�culo
  * y guardados en el mismo y retorna la bitacora del veh�culo.
  * @param vehiculo veh�culo del cual se desean unificar los eventos
  * @param ruta para la cual se desean unificar los eventos
  * @return bitacora de eventos para la ruta, listado de eventos ordenado por sucesos y sin repeticiones
  */
 public Iterable<IEventoVehiculo> unificarEventosRuta(IVehiculo vehiculo, IRuta ruta){
 BitacoraEventos bitacora = newBitacoraEventos(vehiculo, ruta);
 bitacora.unificarEventos(vehiculo.getEventos(), eventosReportados);
 return bitacora;
 }
 /**
  * M�todo que permite obtener una lista de eventos sospechosos seg�n la bitacora de la ruta
  * @param vehiculo vehiculo que realiza la ruta
  * @param ruta para comparar los eventos realizados y los de la bitacora
  * @param bitacoraRuta bitacora para la ruta de la cual se desean saber los eventos sospechosos
  * @return Iterableado de eventos sospechosos asociados a los patrones
  */
 public Iterable<IEventoVehiculo> darEventosSospechososPorPatron(IVehiculo vehiculo, IRuta ruta, Iterable<IEventoVehiculo> bitacoraRuta){
   PilaEventosSospechosos pilaEventos = new PilaEventosSospechosos(vehiculo, ruta);
   
   
//   Iterator<EventoVehiculo> it = bitacoraRuta.iterator();
//  while(it.hasNext()){
//      EventoVehiculo temp = it.next();
//      if(i==0){
//        T ref= bitacora.dar(bitacora.size());
//        bitacora.agregarDesde(temp, ref);
//      }
//      else{
//      T ref= bitacora.dar(i-1);
//      bitacora.agregarDesde(temp, ref);
//      }
//      i++;
//    }
   
   
   return pilaEventos;
 }

 /**
  * M�todo que permite obtener todos los eventos reportados por un veh�culo en un �rea
  * determinada por 4 coordenadas que definen un rectangulo en el mapa.
  * @param surOeste puntoque define el sur-oeste del �rea
  * @param norEste punto que define el nor-este del �rea
  * @param bitacoraEventos bitacora de eventos para la ruta del cual se desea obtener los eventos en el �rea
  * @return lista de eventos que ocurrieron en el �rea determinada
  */
 public Iterable<IEventoVehiculo> darEventosPorArea(IPunto surOeste, IPunto norEste, Iterable<IEventoVehiculo> bitacoraEventos){
 ColaEventos eventosArea = new ColaEventos(); 
 Iterator<EventoVehiculo> it = bitacoraRuta.iterator();
    while(it.hasNext()){
      EventoVehiculo temp = it.next();
      if((temp.estaEnCuadrado( norEste,  surEste, temp.darPunto())==true){
      eventosArea.poll(temp);
      }
       }
 return eventosArea;
 }

 /**
  * M�todo que retorna todos los eventos ocurridos en una ruta para un intervalo de tiempo dados por
  * dos fechas
  * @param bitacoraRuta bitacora de la ruta para la cual se desea saber los eventos ocurridos
  * @param fechaInicio fecha inicial de consulta
  * @param fechaFin fecha final de consulta
  * @return lista con los eventos ocurridos para la ruta en las fechas determinadas
  */
    public Iterable<IEventoVehiculo> darEventosRutaPorTiempo(Iterable<IEventoVehiculo> bitacoraRuta, Date fechaInicio, Date fechaFin){
    ColaEventos cola = new ColaEventos;
    Iterator<EventoVehiculo> it = bitacoraRuta.iterator();
    while(it.hasNext()){
      EventoVehiculo temp = it.next();
      if(temp.getEstampillaTiempo().compareTo(fechaInicio)>=0&&temp.getEstampillaTiempo().compareTo(fechaFin)<=0){
      cola.offer(temp);
      }
      temp = temp.next();
    }
    return cola;
    }

 /**
  * M�todo que permite buscar el veh�culo que m�s reporta accidentes
  * @return
  */
 public IVehiculo buscarVehiculoMasAccidentado();

 /**
  * M�todo que permite buscar el Segmento donde se reportan m�s accidentes de veh�culos
  * @return El segmento donde se reportan mas accidentes de vehiculos
  */
 public ISegmento buscarSegmentoMasAccidentado();

 /**
  * M�todo que permite buscar la ruta donde se reportan mas accidentes de veh�culos
  * @return La ruta donde se repotan mas accidentes de los vehiculos
  */
 public IRuta buscarRutaMasAccidentada();


 /**
  * M�todo que permite conocer el promedio de consumo de combustible para los veh�culos
  * que terminan una ruta en el intervalo de tiempo que se da como par�metro
  * @param fechaInicio fecha inicial de consulta
  * @param fechaFin fecha final de consulta
  * @return consumo promedio de combustible para los veh�culos en las fechas ingresadas
  */
 public double darPromedioConsumoCombustiblePorFechas(Date fechaInicio, Date fechaFin){
 double gas=0;
 j=0
   for(int i =0;i<listaVehiculos.size(); i++){
    Vehiculo temp = listaVehiculos.get(i);
    if(temp.darFechaInicio().compareTo(fechaInicio)>=0&&temp.darFechaFin().compareTo(fechaFin)<=0){
   gas+= temp.darGasolina();
    }
 j++;
 }
 return(gas/j);
}
 }