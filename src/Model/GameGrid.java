package Model;

public class GameGrid {

    private Graph<Integer> graph;
    private int rows, columns, numberVertices;

    public GameGrid(int rows, int columns) {
        graph = new Graph<>();
        this.rows = rows;
        this.columns = columns;
        this.numberVertices = rows * columns;

        //loops through each vertex and adds respective edges
        for(int vertex=1; vertex <= numberVertices; vertex++){
            createVertexWithEdges(vertex);
        }

    }
        //adds vertex with edges
        // also checks if vertex is located on the border ==> less edges should be added
        private void createVertexWithEdges(int vertex){

            if(!(vertex - columns < 1)) //top border?
                graph.addEdge(vertex, vertex - columns, true);

            if(!((vertex - 1) % columns == 0)) //left border?
                graph.addEdge(vertex, vertex - 1, true);

            if(!(vertex % columns == 0)) //right border?
                graph.addEdge(vertex, vertex + 1, true);

            if(!(vertex + columns > numberVertices)) //bottom border?
                graph.addEdge(vertex, vertex + columns, true);
        }

        public void removeCell(int vertex){
            graph.deleteVertex(vertex);
        }
}
