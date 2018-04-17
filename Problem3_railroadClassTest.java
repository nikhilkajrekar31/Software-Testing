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
public class Problem3_railroadClassTest {
	
	private Problem3_railroadClass railroad;	

	@Before
	public void setUp() throws Exception {
		railroad = new Problem3_railroadClass();
	}

	@Test
	@FileParameters("railroad.csv")
	public void test(int testcasenumber, int boxInCarNum, int rrCarNum, int shipmentNum, int currBox, String bpath) {
		//object.calcCurrBoxNumber(boxInCarNum, rrCarNum, shipmentNum);
		assertEquals(currBox, railroad.calcCurrBoxNumber(boxInCarNum, rrCarNum, shipmentNum));
	}

}
