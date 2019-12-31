public class Player {
    private String name;
    private Position position;

    public Player() {
        name = "Yousuf";
        position = new Position(0, 0);
    }

    public Player(String name) {
        this.name = name;
        position = new Position(0, 0);
    }

    public void moveRight() {
        System.out.println(name + " is moving Right");
        position = new Position(position.getX_coOrdinate(), position.getY_coOrdinate() + 1);
        System.out.println("Current Position: (" + position.getX_coOrdinate() + "," + position.getY_coOrdinate() + ")\n");
    }

    public void moveUp() {
        System.out.println(name + " is moving Up");
        position = new Position(position.getX_coOrdinate() + 1, position.getY_coOrdinate());
        System.out.println("Current Position: (" + position.getX_coOrdinate() + "," + position.getY_coOrdinate() + ")\n");
    }

    public void play(Ball ball) {
        System.out.println(name+" is starting from ("+position.getX_coOrdinate()+","+position.getY_coOrdinate()+")\n");
        Position ballPosition = ball.getPosition();
        int ballXCoordinate = ballPosition.getX_coOrdinate();
        int ballYCoordinate = ballPosition.getY_coOrdinate();
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
