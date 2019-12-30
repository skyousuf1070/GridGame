public class GridGame {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Position ballPosition = ball.getPosition();
        int ballXCoordinate = ballPosition.getX_coOrdinate();
        int ballYCoordinate = ballPosition.getY_coOrdinate();
        Player player = new Player("John");
        for (int xAxis = 0; xAxis < ballXCoordinate; xAxis++) {
            player.moveRight();
        }
        for (int yAxis = 0; yAxis < ballYCoordinate; yAxis++) {
            player.moveUp();
        }
        System.out.println(player.getName() + " has taken " + player.getTotalMoves() + " to reach (" + ballXCoordinate + "," + ballYCoordinate + ")");
    }
}