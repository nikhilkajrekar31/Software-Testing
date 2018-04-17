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
public class Problem2_sodaClassTest {
	
	private Problem2_sodaClass soda;

	@Before
	public void setUp() throws Exception {
		soda = new Problem2_sodaClass("Welcome", false, false, null);
	}

	@Test
	@FileParameters("soda.csv")
	public void test(int testcasenumber, Problem2_sodaEnum sodaenum, Problem2_sodaEnum sodaenum2, boolean q, boolean s, boolean r, boolean d, boolean c, String m) {
		soda.setState(sodaenum);
		soda.processState(q, s, r);
		assertEquals(c, soda.isC());
		assertEquals(d, soda.isD());
		assertEquals(m, soda.getM());
	}

}
