import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.assertThat;
import org.hamcrest.Matcher;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void newRover() {
	MarsRover rover = new MarsRover();
	assertThat(rover, isA(MarsRover.class));
    }

}
