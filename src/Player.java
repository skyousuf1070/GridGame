public class Player {
    private String name;
    private Position position;

    public Player(String name) {
        this.name = name;
        position = new Position(0, 0);
    }

    public void moveRight() {
        System.out.println(name + " is moving Right");
        position = new Position(position.getXCoordinate(), position.getYCoordinate() + 1);
        System.out.println("Current Position: (" + position.getXCoordinate() + "," + position.getYCoordinate() + ")\n");
    }

    public void moveUp() {
        System.out.println(name + " is moving Up");
        position = new Position(position.getXCoordinate() + 1, position.getYCoordinate());
        System.out.println("Current Position: (" + position.getXCoordinate() + "," + position.getYCoordinate() + ")\n");
    }

    public void play(Ball ball) {
        System.out.println(name + " is starting from (" + position.getXCoordinate() + "," + position.getYCoordinate() + ")\n");
        Position ballPosition = ball.getPosition();
        int ballXCoordinate = ballPosition.getXCoordinate();
        int ballYCoordinate = ballPosition.getYCoordinate();
        for (int xAxis = 0; xAxis < ballXCoordinate; xAxis++) {
            moveRight();
        }
        for (int yAxis = 0; yAxis < ballYCoordinate; yAxis++) {
            moveUp();
        }
    }

    public String getName() {
        return name;
    }
}
