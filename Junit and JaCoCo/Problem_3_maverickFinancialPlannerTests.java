package Code;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_3_maverickFinancialPlannerTests {
	
	private Problem_3_maverickFinancialPlanner plan;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem_3_maverickFinancialPlanner() {
		return $(
//				Parameters are: (1,2,3)
//				                1=number_of_shares, 2=closing_price, 3=portfolio_amount
//				Test Case 1
				$(50, 140.00, 7_009.50),
//				Test Case 2
				$(299, 140.00, 42_375.11),
//				Test Case 3
				$(750, 140.00, 107_100.00),
//				Test Case 4
				$(999, 140.00, 143_356.50),
//				Test Case 5
				$(2_000, 140.00, 287_700.00),
//				Test Case 6
				$(2_001, 140.00, 289_944.90),
//				Test Case 7
				$(10_000, 140.00, 1_449_000.00),
//				Test Case 8
				$(1_000, 140.00, 143_850.00),
//				Test Case 9
				$(751, 140.00, 107_768.50),
//				Test Case 10
				$(300, 140.00, 42_840.00),
//				Test Case 11
				$(51, 140.00, 7_186.39),
//				Test Case 12
				$(0, 140.00, -50.00)
		);
	}
	
	@Before
	public void setUp () {
		plan = new Problem_3_maverickFinancialPlanner();
	}

	@Test
	@Parameters(method="parametersForProblem_3_maverickFinancialPlanner")
	public void test(int number_of_shares, double closing_price, double portfolio_amount) {
		plan.calculate_balance(number_of_shares, closing_price);
		assertEquals(portfolio_amount, plan.getPortfolio_amount(),0.01); 
	}

}
