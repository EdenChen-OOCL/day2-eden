public class MarsRover {

    private int xLocation = 0;
    private int yLocation = 0;
    private String direction = Direction.N.getDirection();




    public int getxLocation() {
        return xLocation;
    }

    public void setxLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public int getyLocation() {
        return yLocation;
    }

    public void setyLocation(int yLocation) {
        this.yLocation = yLocation;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String executeCommand(String command) {
        return calculatePositionAndDerection(command);
    }

    private String calculatePositionAndDerection(String command) {
        if(command.equals(Command.L.getCommand())){
            if(direction.equals(Direction.N.getDirection())){
                setDirection(Direction.W.getDirection());
            }
        } else if(command.equals(Command.R.getCommand())){
            if(direction.equals(Direction.N.getDirection())){
                setDirection(Direction.E.getDirection());
            }
        }

        return formatReport();
    }

    private String formatReport() {
        return xLocation + ":" + yLocation + ":" + direction;
    }
}
