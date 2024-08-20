import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Grafo {

    private int V;
    private List<List<Integer>> adj;

    Grafo(int v){
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i< v; ++i)
            adj.add(new LinkedList<>());
    }

    void adicionarAresta(int v, int w){
        adj.get(v).add(w);
        adj.get(w).add(v);
    }

    void BFS(int s){
        boolean [] visitado = new boolean[V];

        Queue<Integer> fila = new LinkedList<>();

        visitado [s] = true;
        fila.add(s);

        while (!fila.isEmpty()){
            int n = fila.poll();
            System.out.print(n + " ");
            for(Integer vizinho : adj.get(n)){
                if(!visitado[vizinho]){
                    visitado[vizinho] = true;
                    fila.add(vizinho);
                }
            }
        }
    }
    public static void main(String[] args) {
        Grafo g = new Grafo(6);
        g.adicionarAresta(0,1);
        g.adicionarAresta(0,2);
        g.adicionarAresta(1,3);
        g.adicionarAresta(2,4);
        g.adicionarAresta(3,5);
        System.out.println("BFS começando do vertice 0: ");
        g.BFS(0);
    }
}