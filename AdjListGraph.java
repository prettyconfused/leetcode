// Adjacency Matrix representation in Java
import java.util.*;

public class AdjListGraph {
    int nodes;
    ArrayList<ArrayList<Integer>> graph;
    AdjListGraph(int nodes){
      this.nodes = nodes;
      graph = new ArrayList<ArrayList<Integer>>(nodes);
      for(int i = 0; i<nodes ; i++){
          graph.add( new ArrayList<Integer>());
      }
  }
  public void addEdge(int v1, int v2){
      //Undirected Graph
      graph.get(v1).add(v2);
      graph.get(v2).add(v1);
  }
  
  public int getSize(){
      //Undirected Graph
      return graph.size();
  }
  
  public int getLinkedListSize(int index){
      return graph.get(index).size();
  }
  
  public int getEdge(int v1, int v2){
      return graph.get(v1).get(v2);
  }
  public static void main(String args[]){
      AdjListGraph resultGraph = new AdjListGraph(4);
      resultGraph.addEdge(0,1);
      resultGraph.addEdge(1,2);
      resultGraph.addEdge(0,3);
      resultGraph.addEdge(0,2);
      
      for(int i = 0; i<resultGraph.getSize(); i++){
          System.out.print(i+ ": ");
          for(int j=0; j<resultGraph.getLinkedListSize(i); j++){
            System.out.print(resultGraph.getEdge(i,j)+" ");
          }
          System.out.println();
      }
  }
}
