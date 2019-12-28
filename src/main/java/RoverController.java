public class RoverController {
    private final Rover rover;

    public RoverController(Rover rover) {
        this.rover = rover;
    }


    public String excute(String mission) {
        String[] commands = mission.split(",");
        int areaWidth = Integer.parseInt(commands[0]);
        int areaHeight = Integer.parseInt(commands[1]);
        int x = Integer.parseInt(commands[2]);
        int y = Integer.parseInt(commands[3]);
        Area area = new Area(areaWidth, areaHeight);
        for (int i = 4; i < commands.length; i++) {
            if (commands[i].equals("L")) {
                rover.turnLeft();
            }
            if (commands[i].equals("R")) {
                rover.turnRight();
            }
            if (!commands[i].equals("L") && !commands[i].equals("R") && !commands[i].equals("M")) {
                rover.land(area, x, y, commands[i]);
            }
            if (commands[i].equals("M")) {
                rover.move();
            }
        }
        return rover.getPosition();
    }
}
