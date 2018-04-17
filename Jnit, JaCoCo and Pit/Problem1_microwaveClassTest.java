package Code;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1_microwaveClassTest {
	
	private Problem1_microwaveClass microwave;

	@Before
	public void setUp() throws Exception {
		microwave = new Problem1_microwaveClass(false, 0);
	}

	@Test
	@FileParameters("microwave.csv")
	public void test(int testcasenumber, boolean cooking, boolean stopButton, boolean startButton, boolean doorOpen, int timer, boolean Cooking, int Timer, String bpath) {
		microwave.setCooking(cooking);
		microwave.setTimer(timer);
		microwave.operateMicrowave(stopButton, startButton, doorOpen);
		assertEquals(Cooking, microwave.iscooking());
		assertEquals(Timer, microwave.getTimer());
	}

}

