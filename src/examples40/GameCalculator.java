package examples40;

public abstract class GameCalculator {
    public abstract void calculate();

    public final void gameOver() {
        System.out.println("Game over.");
    }

}