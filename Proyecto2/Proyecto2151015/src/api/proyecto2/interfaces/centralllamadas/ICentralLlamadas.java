package api.proyecto1.interfaces.centralllamadas;

import java.util.Date;
import java.io.File;

/**
 *
 * ICentralLlamadas se refiere a la parte B del enunciado para el proyecto 1
 *
 */
public interface ICentralLlamadas {

  /**
  * M�todo que permite iniciar la central de llamadas, realiza las acciones
  * necesarias para que la central de llamadas pueda atender los eventos de control
  */
 public void iniciarCentralLlamadas();

 /**
  * M�todo que le permite a la central recibir y procesar los eventos de control asociados a
  * la central de llamadas. Este m�todo es el punto de entrada para todos los datos de la central de llamadas,
  * y va a permitir la verificaci�n de los requerimientos funcionales de la soluci�n.
  * @param archivo Archivo Json con los eventos de control para ser procesados por la central
  */
 public void recibirEventosControl(File archivo);

 /**
  * M�todo creado para agregar un agente a la cola de atenci�n
  * las llamadas del call center
  * @param gentes agente que se desea agregar a la central de llamadas
  */
 public void agregarAgente(IAgente agente);

 /**
  * M�todo para realizar la recepci�n de llamadas y procesarlas por el agente activo del call center
  * @param llamada llamada a ser atendida en el call center
  */
 public void procesarLlamada(ILlamada llamada);

 /**
  * M�todo que permite a un agente iniciar un caso, se asocia el cliente, la llamada y la categoria.
  * @param cliente quien hace la llamada e inicia el caso
  * @param llamada en la que se reporta el problema
  * @param categoria enum que identifica si la llamada es petici�n, queja o reclamo
  * @return Caso creado
  */
 public ICaso iniciarCaso(ICliente cliente, ILlamada llamada, CategoriaCaso categoria);

 /**
  * M�todo que permite a un agente cerrar el caso.
  * @param caso que se desea cerrar
  */
 public void finalizarCaso(ICaso caso);

 /**
  * M�todo que permite unificar las llamadas recibidas por el call center con las
  * llamadas atendidas y guardadas en el computador de los agentes
  * @param llamadasComputadorAgentes Las llamadas guardadas en los computadores de los agentes (un iterador de iteradores, pues son múltiples agentes y cada uno tiene múltiples llamadas)
  * @return Llamadas atendidas en el call center sin repeticiones y ordenadas por hora
  */
 public Iterable<ILlamada> unificarLlamadas(Iterable<Iterable<ILlamada>> llamadasComputadorAgentes);

 /**
  * M�todo que permite retornar todos los casos ocurridos entre dos fechas y que no han sido solucionados
  * @param fechaInicial fecha inicial de la consulta
  * @param fechaFinal fecha final de la consulta
  * @return lista de casos creados en las fechas ingresadas y que no est�n solucionados
  */
 public Iterable<ICaso> darCasosNoSolucionadosPorFecha(Date fechaInicial, Date fechaFinal);

 /**
  * M�todo que retorna la Categor�a que, en promedio, tiene los casos que m�s se demoran
  * en ser cerrados
  * @return La categor�a que, en promedio, tiene los casos que m�s se demoran en ser cerrados
  */
 public CategoriaCaso darCategoriaPromedioMasDemorado();

 /**
  * M�todo que retorna una lista con los agentes que m�s atendieron llamadas entre dos fechas
  * @param cantidadAgentes cantidad de agentes a retornar en la lista (limite)
  * @param fechaInicial fecha inicial de consulta
  * @param fechaFinal fecha final de consulta
  * @return una lista con los "cantidadAgente" agentes que m�s atendieron llamadas entre las fechas
  */
 public Iterable<IAgente> darAgentesMasAtiendenPorFecha(int cantidadAgentes, Date fechaInicial, Date fechaFinal);

 /**
  * M�todo que permite saber cual es el agente que m�s casos cierra en la primera llamada
  * @return el agente que m�s casos cierra en la primera llamada
  */
 public IAgente darAgenteMasCasosCierraPrimeraLlamada();

 /**
  * M�todo que permite saber el tiempo promedio que tardaron en cerrarse, todos los casos
  * que se cerraron en las fechas indicadas
  * @param fechaInicial fecha inicial de consulta
  * @param fechaFinal fecha final de consulta
  * @return el promedio de tiempo de cierre de los casos que fueron cerrados entre las fechas de consulta
  */
 public double darPromedioCierreCasosPorFecha(Date fechaInicial, Date fechaFinal);

 /**
  * M�todo que permite saber el tiempo promedio que tardaron en cerrarse, todos los casos
  * que se cerraron en las fechas indicadas por un agente
  * @param agente el agente del que se desea saber el promedio de tiempos de cierre de casos
  * @param fechaInicia fecha inicial de consulta
  * @param fechaFinal fecha final de consulta
  * @return el promedio de tiempo cierre de casos por el agente para los casos cerrados entre las fechas de consulta
  */
 public double darPromedioCierreCasosAgentePorFecha(IAgente agente, Date fechaInicia, Date fechaFinal);

 /**
  * M�todo que permite obtener un listado con los casos sospechosos de mal servicio
  * @return lista con los casos sospechosos de mal servicio
  */
 public Iterable<ICaso> darCasosSospechaMalServicio();

 /**
  * M�todo que permite indicar que un agente ya no atiende llamadas de la central de llamadas
  * @param agente Agente a desactivar
  */
 public void desactivarAgente(IAgente agente);

 /**
  * M�todo que permite asignar un agente para la atenci�n de llamadas de la central de llamadas.
  * @param agente Agente a activar
  */
 public void activarAgente(IAgente agente);

 /**
  * M�todo que retorna el agente que atiende llamadas en el momento
  * return agente activo
  */
 public IAgente darAgenteActivo();

}
