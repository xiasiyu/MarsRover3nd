import Command.MoveType;
import org.junit.Test;
import MarsRover.*;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;

public class MarsRoverControllerTest {
    @Test
    public void should_deploy_mars_rover() {
        MarsRoverController marsRoverController = new MarsRoverController();
        ArrayList<MoveType> moves = new ArrayList<MoveType>();
        marsRoverController.executeCommand("12 N", moves);

        assertThat(marsRoverController.getMarsRover(0), notNullValue());
        assertThat(marsRoverController.getMarsRover(0).getCurrentPosition(), is("12 N"));
    }
}
