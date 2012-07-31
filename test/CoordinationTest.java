import Position.Coordination;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CoordinationTest {
    @Test
    public void should_get_position_string() {
        Coordination coordination = new Coordination(1, 2);

        assertThat(coordination.toString(), is("12"));
    }
}
