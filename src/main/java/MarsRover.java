public class MarsRover {

    private int xLocation = 0;
    private int yLocation = 0;
    private String direction = "N";




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
        return "0:0:N";
    }
}
