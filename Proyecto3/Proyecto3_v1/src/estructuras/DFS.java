package estructuras;

public class DFS {
	private TablaHash vertices;    // marked[v] = is there an s-v path?
    private int conectados;       // number of vertices connected to s
    private boolean [] marcados;  //dice si hay una ruta entre Vo y Vf
    
    public DFS(GrafoDirigido G, Vertice s) {
    	vertices = new TablaHash();
    	vertices =  G.devolverVertices();

    }

    // depth first search from v
    private void dfs(GrafoDirigido G, int v) {
        int count;
		count++;
	
        for (int w : G.adj(v)) {
            if (!marked[w]) {
                dfs(G, w);
            }
        }
    }

    /**
     * Is there a path between the source vertex <tt>s</tt> and vertex <tt>v</tt>?
     * @param v the vertex
     * @return <tt>true</tt> if there is a path, <tt>false</tt> otherwise
     */
    public boolean marked(int v) {
        return marcados[v];
    }

    /**
     * Returns the number of vertices connected to the source vertex <tt>s</tt>.
     * @return the number of vertices connected to the source vertex <tt>s</tt>
     */
    public int count() {
        return conectados;
    }

    
}
