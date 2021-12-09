
package Model;

public class GameGrid {

    private Graph<Integer> graph;
    private int rows, columns, numberOfVertices;

    public GameGrid(int rows, int columns) {
        graph = new Graph<Integer>();
        this.rows = rows;
        this.columns = columns;
        this.numberOfVertices = rows * columns;

        //loops through each vertex and adds respective edges
        for(int vertex = 1; vertex <= numberOfVertices; vertex++){
            createVertexWithEdges(vertex);
        }
    }

    /**
     * adds vertex with edges to surrounding vertices
     * also checks if vertex is located on the border ==> less edges are added
     * @param vertex vertex digit
     */
    private void createVertexWithEdges(int vertex){

        if(!(vertex - columns < 1)) //top border?
            graph.addEdge(vertex, vertex - columns, true);

        if(!((vertex - 1) % columns == 0)) //left border?
            graph.addEdge(vertex, vertex - 1, true);

        if(!(vertex % columns == 0)) //right border?
            graph.addEdge(vertex, vertex + 1, true);

        if(!(vertex + columns > numberOfVertices)) //bottom border?
            graph.addEdge(vertex, vertex + columns, true);
    }

    public void removeCell(int vertex){
        graph.deleteVertex(vertex);
    }

    public void addCell(int vertex) {
        if(!graph.containsVertex(vertex))
            createVertexWithEdges(vertex);
    }

    public void printOverview(){
        graph.printOverview();
    }

    public int getNumberOfVertices(){return this.numberOfVertices;}
}
