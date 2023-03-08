import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.*;
public class BFS {
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
    public static void BFS(List<List<Integer>> graph,int V,int s){
        boolean visited [] = new boolean[V+1];
        Arrays.fill(visited,false);
        Queue <Integer> q = new LinkedList<>();
        q.offer(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int vertice = q.poll();
            System.out.print(vertice+" ");
            for(int nbr:graph.get(vertice)){
                if(!visited[nbr]){
                    q.offer(nbr);
                    visited[nbr] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int V = 5;
        int arr[][] = {{1,2},{1,3},{1,4},{2,5},{5,3},{3,4}};
        List<List<Integer>> graph = buildGraph(arr, V);
        BFS(graph , V ,1);
    }
}