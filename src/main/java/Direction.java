public enum Direction {
    N("N"),
    W("W"),
    S("S"),
    E("E")
    ;


    private final String direction;

    Direction(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }
}
