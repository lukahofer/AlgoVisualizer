package Model;

import java.util.*;

//class to model a graph with helpfull functions
public class Graph<T>{
    private Map<T, List<T>> graph = new HashMap();

    //adds vertex to graph
    public void addVertex(T newVertex){
        graph.put(newVertex, new LinkedList<T>());
    }

    //adds edges to specific start and end-vertex
    //also checks if vertices already exist
    public void addEdge(T startVertex, T endVertex, boolean bidirectional){
        if(!graph.containsKey(startVertex))
            addVertex(startVertex);

        if(!graph.containsKey(endVertex))
            addVertex(endVertex);

        if(!graph.get(startVertex).contains(endVertex))
            graph.get(startVertex).add(endVertex);

        if(bidirectional && !graph.get(endVertex).contains(startVertex))
            graph.get(endVertex).add(startVertex);
    }

    //deletes specific edge
    public void deleteEdge(T edgeStart, T edgeEnd){
        graph.get(edgeStart).remove(edgeEnd);
    }

    //deletes specific vertex and all affected edges
    public void deleteVertex(T vertex){

        //deletes all the edges pointing at current vertex
        for(T edgeEnd : graph.get(vertex)){
            deleteEdge(edgeEnd, vertex);
        }
        //removes current vertex
        graph.remove(vertex);
    }


}
