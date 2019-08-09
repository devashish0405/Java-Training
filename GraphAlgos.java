package graphalgo;

import org.jetbrains.annotations.NotNull;

import java.util.*;

class GraphTraversal {
    public void BreadthFirstSearch(HashMap<Integer, Vector<Integer>> adj, int source) {
        int V = adj.size();
        boolean visited[] = new boolean[V + 1];
        for (int i = 0; i < V + 1; i++) {
            visited[i] = false;
        }
        // System.out.println(visited);
        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            int node = queue.remove();
            System.out.println(node);
            if (adj.get(node) != null) {
                Vector<Integer> neigh = adj.get(node);

                for (int i = 0; i < neigh.size(); i++) {

                    int element = neigh.get(i);
                    if (visited[element] == false) {
                        visited[element] = true;
                        queue.add(element);
                    }
                }

            }

        }
    }

    private void dfs(HashMap<Integer, Vector<Integer>> adj, int source, boolean visited[]) {
        visited[source] = true;
        System.out.println(source);
        if (adj.get(source) != null) {
            Vector<Integer> neighs = adj.get(source);
            for (int i=0;i<neighs.size();i++){
                int node=neighs.get(i);
                if(visited[node]==false) {
                    dfs(adj, node, visited);
                }

            }
        }
    }

    public void DepthFirstSearch(HashMap<Integer, Vector<Integer>> adj,int V, int source) {
       // int V = adj.size();
        boolean visited[] = new boolean[V + 1];
        for (int i = 0; i < V + 1; i++) {
            visited[i] = false;
        }

        dfs(adj, source,visited);
    }

}
public class GraphAlgos{
    public static void main(String[] args) {
        AdjacencyListGraph graphobj=new AdjacencyListGraph();
        graphobj.addEdge(0,1);
        graphobj.addEdge(0,2);
        graphobj.addEdge(1,3);
        graphobj.addEdge(1,4);

        graphobj.addEdge(2,3);
        graphobj.addEdge(2,4);
        graphobj.addEdge(3,5);
        graphobj.addEdge(3,6);
        graphobj.addEdge(4,5);
        graphobj.addEdge(5,6);

        HashMap<Integer,Vector<Integer>>graph=graphobj.getGraph();
       // System.out.println(graph);
        GraphTraversal gt=new GraphTraversal();
       // gt.BreadthFirstSearch(graph,0);
        gt.DepthFirstSearch(graph,7,0);


    }
}
