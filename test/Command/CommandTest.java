package Command;

import MarsRover.MarsRover;
import Position.Coordination;
import Position.Plateau;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CommandTest {

    public static final String default_command = "LMLMLMLMM";

    @Test
    public void should_parse_mars_rover() {
        MarsRover marsRover = Command.parseMarsRover("12 N");

        assertThat(marsRover.getCurrentPosition(), is("12 N"));
    }

    @Test
    public void should_parse_plateau_border() {
        Coordination coordination = Command.parsePlateauBorder("55");

        Plateau plateau = new Plateau(coordination);

        assertThat(plateau.getMaxX(), is(5));
        assertThat(plateau.getMaxY(), is(5));

    }

    @Test
    public void should_parse_command_list() {
        List<MoveType> expectedMoves = createDefalutCommandList();

        List<MoveType> movements = Command.parseCommandMoves(default_command);

        assertThat(movements, is(expectedMoves));

    }


    private List<MoveType> createDefalutCommandList() {
        List<MoveType> movements = new ArrayList<MoveType>();
        movements.add(MoveType.L);
        movements.add(MoveType.M);
        movements.add(MoveType.L);
        movements.add(MoveType.M);
        movements.add(MoveType.L);
        movements.add(MoveType.M);
        movements.add(MoveType.L);
        movements.add(MoveType.M);
        movements.add(MoveType.M);
        return movements;
    }
}
