package estructuras;
import java.awt.Dimension;
import java.util.*;

public class Dijkstra {
	//listas de respuesta
	private Lista<Double> distTo;   // distTo[v] = distance  of shortest s->v path
	private Lista<Arco> edgeTo;    // lista de arcos que conectan los dos vértices

	public Dijkstra(){
		distTo=new Lista<>();
		edgeTo=new Lista<>();
	}
	public static Comparator<Arco> menorTiempo =new Comparator<Arco>() 
	{
		@Override
		//compara las distancias entre dos arcos
		public int compare(Arco o1, Arco o2) {
			Double dist1= (Double)o1.getValor()/1000;
			Double dist2=(Double)o2.getValor()/1000;
			Double vel1=(Double)o1.getValor2();
			Double vel2=(Double)o2.getValor2();
			Double t1=(Double)dist1/vel1;
			Double t2=(Double)dist2/vel2;
			Double respuesta=(t1)-(t2);
			int resp= (int)((double)respuesta) ;
			return resp;
		}		
	};
	public static Comparator<Arco> menorDistancia =new Comparator<Arco>() {

		@Override
		//compara las distancias entre dos arcos
		public int compare(Arco o1, Arco o2) {
			Double dist1= (Double)o1.getValor();
			Double dist2=(Double)o2.getValor();
			return dist1.compareTo(dist2);
		}		
	};
	public static Comparator<Arco> menorCosto =new Comparator<Arco>() {
		@Override
		//compara las distancias entre dos arcos
		public int compare(Arco o1, Arco o2) {
			int precioKm=120;
			int precioHora=25*60;
			Double dist1= (Double)o1.getValor()/1000;
			Double dist2=(Double)o2.getValor()/1000;
			Double vel1=(Double)o1.getValor2();
			Double vel2=(Double)o2.getValor2();
			Double t1=(Double)dist1/vel1;
			Double t2=(Double)dist2/vel2;
			Double costo1= (t1*precioKm)+(dist1*precioHora);
			Double costo2= (t2*precioKm)+(dist2*precioHora);
			Double respuesta=(costo1)-(costo2);
			int resp= (int)((double)respuesta) ;
			return resp;
		}		
	};
	public Lista<Arco> dijkstra(Vertice origen,Vertice meta,Comparator<Arco> comparador){

		//produce una lista con los arcos de menor distancia entre dos ejes
		Lista<Arco> respuesta = new Lista<Arco>();

		//crea un queue con los arcos a explorar por los que demoran menos tiempo
		PriorityQueue<Arco> queueSiguientes = 
				new PriorityQueue<Arco>(origen.getArco().darTama�o(), comparador);
		while(!queueSiguientes.isEmpty()){
			//toma el vértice de ese primer arco
			Arco actual=queueSiguientes.poll();
			Vertice destActual= actual.getDestino();
			//si es la meta, retorna
			respuesta.agregar(actual);

			if (destActual.equals(meta)) {
				return respuesta;
			}
			Lista<Arco> agregar = destActual.getArco();
			Collections.sort(agregar, menorTiempo);
			queueSiguientes.addAll((Collection<? extends Arco>) agregar);

			//http://www.vogella.com/tutorials/JavaAlgorithmsDijkstra/article.html
		}
		return  respuesta;
	}
	/*public Lista<Arco> dijkstraTiempo(Vertice origen,Vertice meta){


		//produce una lista con los arcos de menor distancia entre dos ejes
		Lista<Arco> respuesta = new Lista<Arco>();

		//crea un queue con los arcos a explorar por los que demoran menos tiempo
		PriorityQueue<Arco> queueSiguientes = 
				new PriorityQueue<Arco>(origen.getArco().darTama�o(), menorTiempo);
		while(!queueSiguientes.isEmpty()){
			//toma el vértice de ese primer arco
			Arco actual=queueSiguientes.poll();
			Vertice destActual= actual.getDestino();
			//si es la meta, retorna
			respuesta.agregar(actual);

			if (destActual.equals(meta)) {
				return respuesta;
			}
			Lista<Arco> agregar = destActual.getArco();
			Collections.sort(agregar, menorTiempo);
			queueSiguientes.addAll((Collection<? extends Arco>) agregar);

			//http://www.vogella.com/tutorials/JavaAlgorithmsDijkstra/article.html
		}
		return  respuesta;
	}
	
	public Lista<Arco> dijkstraDistancia(Vertice origen,Vertice meta){
		//TODO
		PriorityQueue<Arco> queueSiguientes = new PriorityQueue<>();

		//produce una lista con los arcos de menor distancia entre dos ejes
		Lista<Arco> respuesta = new Lista<Arco>();

		//crea un queue con los arcos a explorar por los que demoran menos tiempo
		queueSiguientes = 
				new PriorityQueue<Arco>(origen.getArco().darTama�o(), menorTiempo);
		while(!queueSiguientes.isEmpty()){
			//toma el vértice de ese primer arco
			Arco actual=queueSiguientes.poll();
			Vertice destActual= actual.getDestino();
			//si es la meta, retorna
			respuesta.agregar(actual);

			if (destActual.equals(meta)) {
				return respuesta;
			}
			Lista<Arco> agregar = destActual.getArco();
			Collections.sort(agregar, menorTiempo);
			queueSiguientes.addAll((Collection<? extends Arco>) agregar);

			//http://www.vogella.com/tutorials/JavaAlgorithmsDijkstra/article.html
		}
		return  respuesta;
	}*/
}