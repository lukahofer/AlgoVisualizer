package Model;

public class Algorithm {
    private GameGrid game;
    private static int iteration;
    private int startVert, targetVert;


    public Algorithm(GameGrid game, int startVert, int targetVert){
        this.game = game;
        this.startVert = startVert;
        this.targetVert = targetVert;
    }

}
