package Code;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem_4_isPrimeShipperTests {
	
	private Problem_4_isPrimeShipper ship;
	
	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem_4_isPrimeShipper() {
		return $(
//				Parameters are: (1,2,3,4,5)
//				                1=numItems, 2=yearsCust, 3=total, 4=shippingCost, 5=a
//				Test Case 1
				$(9, 11, 50_000.01, 49.99,true),
//				Test Case 2
				$(9, 11, 50_000.00, 49.99,false),
//				Test Case 3
				$(9, 11, 50_000.01, 50.00,false),
//				Test Case 4
				$(8, 11, 50_000.01, 49.99,false),
//				Test Case 5
				$(9, 10, 50_000.01, 49.99,false),
//				Test Case 6
				$(9, 10, 0.00, 49.99,false),
//				Test Case 7
				$(9, 11, 100_000.00, 49.99,true),
//				Test Case 8
				$(9, 11, 50_000.01, 0.00,true),
//				Test Case 9
				$(9, 11, 50_000.01, 100.00,false),
//				Test Case 10
				$(0, 11, 50_000.01, 49.99,false),
//				Test Case 11
				$(20, 11, 50_000.01, 49.99,true),
//				Test Case 12
				$(9, 0, 50_000.01, 49.99,false),
//				Test Case 13
				$(9, 50, 50_000.01, 49.99,true)				
		);
	}

	@Before
	public void setUp () {
		ship = new Problem_4_isPrimeShipper();
	}

	@Test
	@Parameters(method="parametersForProblem_4_isPrimeShipper")
	public void test(int numItems, int yearsCust, double total, double shippingCost, boolean a) {
		ship.isPrimeShipper(numItems, yearsCust, total, shippingCost);
		assertEquals(a, ship.isPrimeShipper(numItems, yearsCust, total, shippingCost));
	}

}
