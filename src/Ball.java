public class Ball {
    private Position position;

    public Ball() {
        int x_coOrdinate = (int) (Math.random() * 10) + 1;
        int y_coOrdinate = (int) (Math.random() * 10) + 1;
        position = new Position(x_coOrdinate, y_coOrdinate);
    }

    public Position getPosition() {
        return position;
    }
}
