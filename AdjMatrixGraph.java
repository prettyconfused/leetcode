  // Adjacency Matrix representation in Java

public class AdjMatrixGraph {
    int nodes;
  int[][] graph;
  AdjMatrixGraph(int nodes){
      this.nodes = nodes;
      graph = new int[nodes][nodes];
  }
  public void addEdge(int v1, int v2){
      //Undirected Graph
      graph[v1][v2] =1;
      graph[v2][v1] =1;
  }
  
  public int getEdge(int v1, int v2){
      return graph[v1][v2];
  }
  public static void main(String args[]){
      AdjMatrixGraph resultGraph = new AdjMatrixGraph(4);
      resultGraph.addEdge(0,1);
      resultGraph.addEdge(1,2);
      resultGraph.addEdge(0,3);
      resultGraph.addEdge(0,2);
      
      for(int i = 0; i<4; i++){
          for(int j=0; j<4; j++){
            System.out.print(resultGraph.getEdge(i,j));
          }
          System.out.println();
      }
  }
}
