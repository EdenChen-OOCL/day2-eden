import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class MarsRoverTest {

    @Test
    public void should_initialize_mars_rover() {
        MarsRover marsRover = new MarsRover();
        assertNotNull(marsRover);
    }

    @Test
    public void should_turn_west_when_excuteCommand_given_current_direction_is_north_and_command_is_L() {
        MarsRover marsRover = new MarsRover();
        String report = marsRover.executeCommand(Command.L.getCommand());
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_turn_south_when_excuteCommand_given_current_direction_is_west_and_command_is_L() {
        MarsRover marsRover = new MarsRover();
        marsRover.setDirection(Direction.W.getDirection());
        String report = marsRover.executeCommand(Command.L.getCommand());
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_turn_east_when_excuteCommand_given_current_direction_is_south_and_command_is_L() {
        MarsRover marsRover = new MarsRover();
        marsRover.setDirection(Direction.S.getDirection());
        String report = marsRover.executeCommand(Command.L.getCommand());
        assertEquals("0:0:E", report);
    }

    @Test
    public void should_turn_north_when_excuteCommand_given_current_direction_is_east_and_command_is_L() {
        MarsRover marsRover = new MarsRover();
        marsRover.setDirection(Direction.E.getDirection());
        String report = marsRover.executeCommand(Command.L.getCommand());
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_turn_east_when_excuteCommand_given_current_direction_is_north_and_command_is_R() {
        MarsRover marsRover = new MarsRover();
        String report = marsRover.executeCommand(Command.R.getCommand());
        assertEquals("0:0:E", report);
    }

    @Test
    public void should_turn_south_when_excuteCommand_given_current_direction_is_east_and_command_is_R() {
        MarsRover marsRover = new MarsRover();
        marsRover.setDirection(Direction.E.getDirection());
        String report = marsRover.executeCommand(Command.R.getCommand());
        assertEquals("0:0:S", report);
    }

    @Test
    public void should_turn_west_when_excuteCommand_given_current_direction_is_south_and_command_is_R() {
        MarsRover marsRover = new MarsRover();
        marsRover.setDirection(Direction.S.getDirection());
        String report = marsRover.executeCommand(Command.R.getCommand());
        assertEquals("0:0:W", report);
    }

    @Test
    public void should_turn_north_when_excuteCommand_given_current_direction_is_west_and_command_is_R() {
        MarsRover marsRover = new MarsRover();
        marsRover.setDirection(Direction.W.getDirection());
        String report = marsRover.executeCommand(Command.R.getCommand());
        assertEquals("0:0:N", report);
    }

    @Test
    public void should_turn_north_when_excuteCommand_given_current_direction_is_north_and_command_is_M() {
        MarsRover marsRover = new MarsRover();
        String report = marsRover.executeCommand(Command.M.getCommand());
        assertEquals("0:1:N", report);
    }

    @Test
    public void should_turn_south_when_excuteCommand_given_current_direction_is_south_and_command_is_M() {
        MarsRover marsRover = new MarsRover();
        marsRover.setDirection(Direction.S.getDirection());
        String report = marsRover.executeCommand(Command.M.getCommand());
        assertEquals("0:-1:S", report);
    }

    @Test
    public void should_turn_east_when_excuteCommand_given_current_direction_is_east_and_command_is_M() {
        MarsRover marsRover = new MarsRover();
        marsRover.setDirection(Direction.E.getDirection());
        String report = marsRover.executeCommand(Command.M.getCommand());
        assertEquals("1:0:E", report);
    }

    @Test
    public void should_turn_west_when_excuteCommand_given_current_direction_is_west_and_command_is_M() {
        MarsRover marsRover = new MarsRover();
        marsRover.setDirection(Direction.W.getDirection());
        String report = marsRover.executeCommand(Command.M.getCommand());
        assertEquals("-1:0:W", report);
    }
}
