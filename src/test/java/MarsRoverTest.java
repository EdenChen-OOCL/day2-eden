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
        String report = marsRover.executeCommand("L");
        assertEquals("0:0:N", report);
    }
}
