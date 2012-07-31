import Command.Command;
import Command.MoveType;
import MarsRover.MarsRover;
import Position.Coordination;
import Position.EnumDirection;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

    public static final String default_command = "LMLMLMLMM";
    private Coordination coordination;
    private EnumDirection direction;
    private MarsRover marsRover;

    @Before
    public void setUp() {
        coordination = new Coordination(1, 2);
        direction = EnumDirection.DirectionNorth;
        marsRover = new MarsRover(coordination, direction);

    }

    @Test
    public void should_get_final_position_after_execute_command() {
        List<MoveType> moves = Command.parseCommandMoves(default_command);
        marsRover.execute(moves);

        assertThat(marsRover.getCurrentPosition(), is("13 N"));
    }

    @Test
    public void should_get_position() {

        assertThat(marsRover.getCurrentPosition(), is("12 N"));
    }
}
