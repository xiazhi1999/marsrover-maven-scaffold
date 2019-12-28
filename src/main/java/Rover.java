public class Rover {
    public static final String EAST = "E";
    public static final String NORTH = "N";
    public static final String SOUTH = "S";
    public static final String WEST = "W";
    private int x;
    private int y;
    private String direction;

    public void land(Area area, int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        area.setX(x);
        area.setY(y);
        if (x > area.getX()) {
            throw new IllegalArgumentException("out of bound!");
        }
        if (y > area.getY()) {
            throw new IllegalArgumentException("out of bound!");
        }
    }

    public String getPosition() {
        return "" + x + y + direction;
    }

    public void move() {
        if (direction.equals("E")) {
            x += 1;
        }else if (direction.equals("W")) {
            x -= 1;
        }else if (direction.equals("N")) {
            y += 1;
        }else{
            y -= 1;
        }
    }

    public void turnLeft() {
        if (direction.equals((EAST))) {
            direction = NORTH;
        }else if (direction.equals(NORTH)) {
            direction = WEST;
        }else if (direction.equals(WEST)) {
            direction = SOUTH;
        }else if (direction.equals(SOUTH)) {
            direction=EAST;
        }
    }

    public void turnRight() {
        if (direction.equals((EAST))) {
            direction = SOUTH;
        }else if (direction.equals(NORTH)) {
            direction = EAST;
        }else if (direction.equals(WEST)) {
            direction = NORTH;
        }else if (direction.equals(SOUTH)) {
            direction=EAST;
        }
    }
}
