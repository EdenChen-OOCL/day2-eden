public enum Command {

    L("L"),
    R("R"),
    M("M")
    ;

    private final String command;

    Command(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }
}
