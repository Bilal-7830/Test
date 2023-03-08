// package Graph;
public class GraphImplemantationArray{
    // implemantating undirected graph
    public static void buildGraph(int [][] graph,int s,int d){
        // Setting 1 for undirected graph
        graph[s][d] = 1;
        graph[d][s] = 1;
    }
    public static void printGraph(int [][] graph){
        for(int i = 0;i < graph.length ;i++){
            for(int j=0 ; j<graph[0].length;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
    int V = 5;
    int arr[][] = {{1,2},{1,3},{1,4},{2,5},{5,3},{3,4}};
    int [][] graph = new int [V+1][V+1];
    for(int i = 0 ; i <= V ; i++){
        buildGraph(graph, arr[i][0], arr[i][1]);
    }
    printGraph(graph);
   }
}