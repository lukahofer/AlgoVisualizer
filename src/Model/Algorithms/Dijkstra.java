package Model.Algorithms;

import Model.Algorithm;
import Model.GameGrid;

import java.util.LinkedList;

public class Dijkstra extends Algorithm {

    private LinkedList<Integer> visitedVertices;
    private Data[] dataTable;

    //value for infinite distance between vertices
    private final int INFINITE_DIST = 10000;


    public Dijkstra(GameGrid game, int startVert, int targetVert){
        super(game, startVert, targetVert);
        dataTable = new Data[game.getNumberOfVertices()];
        dataTable[startVert-1].distance = 0;
        dataTable[startVert-1].predecessor = (startVert-1);
    }

    class Data {
        private int predecessor;
        private int distance = INFINITE_DIST;
    }

    public void execute(){

    }





}
