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
public class Problem_5_calcYTests {
	
	private Problem_5_calcY calcY;

	@Before
	public void setUp() throws Exception {
		calcY = new Problem_5_calcY();
	}

	@Test
	@FileParameters("calcY.csv")
	public void test(int testcaseNumber, double x, double y, String bpNumber) {
		calcY.calcY(x);
		assertEquals(y, calcY.calcY(x), 0.01);
	}

}
