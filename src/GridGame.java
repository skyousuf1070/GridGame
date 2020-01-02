public class GridGame {
    public void launchGame() {
        Ball ball = new Ball();
        Player player = new Player("John");
        player.play(ball);
    }

    public static void main(String[] args) {
        new GridGame().launchGame();
    }
}