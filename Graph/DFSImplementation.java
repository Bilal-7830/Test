import java.util.ArrayList;
import java.util.List;

public class DFSImplementation{
    public static List<List<Integer>> buildGraph(int [][]arr,int V){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i <= V ; i++){
            graph.add(new ArrayList<>());
        }
        for(int i = 0 ; i <= V ; i++){
        graph.get(arr[i][0]).add(arr[i][1]);
        graph.get(arr[i][1]).add(arr[i][0]);
        }
       return graph;
    }
    public static void DFS(int node, boolean visited[], List<List<Integer>> graph){
        visited[node] = true;
        System.out.print(node+" ");
        for(int nbr:graph.get(node)){
            if(!visited[nbr]){
                DFS(nbr, visited, graph);
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        int arr[][] = {{1,2},{1,3},{1,4},{2,5},{5,3},{3,4}};
        List<List<Integer>> graph = buildGraph(arr, V);
        boolean visited[] = new boolean[V+1];
        DFS(1, visited, graph);
    }
}