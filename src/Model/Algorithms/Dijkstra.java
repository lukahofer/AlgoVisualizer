package Model.Algorithms;

import Model.Algorithm;
import Model.GameGrid;

import java.util.LinkedList;

public class Dijkstra extends Algorithm {
    private LinkedList<Integer> visitedVertices;

    public Dijkstra(GameGrid game){
        super(game);
    }
}
