public class Ball {
    private Position position;

    public Ball() {
        int xCoordinate = (int) (Math.random() * 10) + 1;
        int yCoordinate = (int) (Math.random() * 10) + 1;
        position = new Position(xCoordinate, yCoordinate);
    }

    public Position getPosition() {
        return position;
    }
}
