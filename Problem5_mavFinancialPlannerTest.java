package Code;

import static org.junit.Assert.assertEquals;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5_mavFinancialPlannerTest {
	
	Problem5_calcPlanInterface mockobj;
	Problem5_mavFinancialPlanner mavPlanObj;

	@Before
	public void setUp() throws Exception {
		mavPlanObj = new Problem5_mavFinancialPlanner();
		mockobj = EasyMock.strictMock(Problem5_calcPlanInterface.class);
		mavPlanObj.setMavPlan(mockobj); 
	}

	@Test
	@FileParameters("mavPlan.csv")
	public void test(int testnum, int numofshares, double portfolioamt) {
		EasyMock.expect(mockobj.getShares()).andReturn(numofshares);
		EasyMock.replay(mockobj);
		mavPlanObj.calculate_balance(140.00);
		assertEquals(portfolioamt, mavPlanObj.getPortfolio_amount(), 0.01);
	}

}
