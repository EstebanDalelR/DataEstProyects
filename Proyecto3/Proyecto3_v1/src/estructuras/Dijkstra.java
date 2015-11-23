package estructuras;
import java.awt.Dimension;
import java.util.*;

public class Dijkstra {
	//listas de respuesta
	private Lista<Double> distTo;   // distTo[v] = distance  of shortest s->v path
	private Lista<Arco> edgeTo;    // lista de arcos que conectan los dos vértices
	
	public Dijkstra(){
		
	}
	public static Comparator<Arco> menorTiempo =new Comparator<Arco>() {
			@Override
			//compara las distancias entre dos arcos
			public int compare(Arco o1, Arco o2) {
				Double dist1= (Double)o1.getValor();
				Double dist2=(Double)o2.getValor();
				Double vel1=(Double)o1.getValor2();
				Double vel2=(Double)o2.getValor2();
				Double t1=(Double)dist1/vel1;
				Double t2=(Double)dist2/vel2;
				Double respuesta=(t1)-(t2);
				int resp= (int)((double)respuesta) ;
				return resp;
			}		
		};
	
	public Lista<Arco> dijkstraTiempo(Vertice origen,Vertice meta){
	
		//produce una lista con los arcos de menor distancia entre dos ejes
		Lista<Arco> respuesta = new Lista<Arco>();

		//crea un queue con los arcos a explorar por los que demoran menos tiempo
			PriorityQueue<Arco> queueSiguientes = 
					new PriorityQueue<Arco>(origen.getArco().darTamaño(), menorTiempo);
			while(!queueSiguientes.isEmpty()){
				//toma el vértice de ese primer arco
				Vertice<llave, valor> actual=queueSiguientes.poll().getDestino();
				//si es la meta, retorna
				if (actual.equals(meta)) {
					return respuesta;
				}
				
			}
			return  respuesta;
		}
		public Lista<Arco> dijkstraDistancia(Vertice origen,Vertice meta){
			PriorityQueue<Arco> queueSiguientes = new PriorityQueue<>();
			

		}
	}
