public class MarsRover {

    private int xLocation = 0;
    private int yLocation = 0;
    private String direction = Direction.N.getDirection();




    public int getXLocation() {
        return xLocation;
    }

    public void setXLocation(int xLocation) {
        this.xLocation = xLocation;
    }

    public int getYLocation() {
        return yLocation;
    }

    public void setYLocation(int yLocation) {
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
            } else if(direction.equals(Direction.W.getDirection())){
                setDirection(Direction.S.getDirection());
            } else if(direction.equals(Direction.S.getDirection())){
                setDirection(Direction.E.getDirection());
            } else if(direction.equals(Direction.E.getDirection())){
                setDirection(Direction.N.getDirection());
            }
        } else if(command.equals(Command.R.getCommand())){
            if(direction.equals(Direction.N.getDirection())){
                setDirection(Direction.E.getDirection());
            }
        } else if(command.equals(Command.M.getCommand())){
            if(direction.equals(Direction.N.getDirection())){
                setYLocation(getYLocation() + 1);
            } else if(direction.equals(Direction.S.getDirection())){
                setYLocation(getYLocation() - 1);
            } else if (direction.equals(Direction.E.getDirection())){
                setXLocation(getXLocation() + 1);
            } else if (direction.equals(Direction.W.getDirection())){
                setXLocation(getXLocation() - 1);
            }
        }

        return formatReport();
    }

    private String formatReport() {
        return xLocation + ":" + yLocation + ":" + direction;
    }
}
