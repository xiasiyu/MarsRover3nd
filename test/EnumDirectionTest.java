import Position.Coordination;
import Position.EnumDirection;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EnumDirectionTest {
    @Test
    public void should_get_string_value_for_direction() {
        EnumDirection direction = EnumDirection.DirectionEast;

        assertThat(direction.getValue(), is("E"));
    }

    @Test
    public void should_get_left_direction() {
        EnumDirection expectedDirection = EnumDirection.DirectionNorth.getLeftDirection();

        assertThat(expectedDirection, is(EnumDirection.DirectionWest));
    }

    @Test
    public void should_get_right_direction() {
        EnumDirection expectedDirection = EnumDirection.DirectionNorth.getRightDirection();

        assertThat(expectedDirection, is(EnumDirection.DirectionEast));
    }

    @Test
    public void should_get_coordination_move() {
        EnumDirection direction = EnumDirection.DirectionNorth;
        Coordination move = direction.getMove();

        assertThat(move.toString(), is("01"));
    }
}
