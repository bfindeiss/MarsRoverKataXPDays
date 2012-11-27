import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.isA;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.hasItems;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void newRover() {
	MarsRover rover = new MarsRover();
	assertThat(rover, isA(MarsRover.class));
    }

}
