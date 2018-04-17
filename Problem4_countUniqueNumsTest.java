package Code;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;


import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
@RunWith(JUnitParamsRunner.class)

public class Problem4_countUniqueNumsTest {
	
	private Problem4_countUniqueNums count;

	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem4 () {
		return $(
//				Parameters are: (1,2)
//								1=nums array, 2=unique
//				Test case 1 - Basis path : 12-13-14-15-16-20-21-12-22
				$(new int [] {-9}, 1),
//				Test case 2 - Basis path : 12-22 
				$(new int[] {}, 0),
//				Test case 3 - Basis path : 12-13-20-21-12-22 
				$(new int[] {-10}, 0),
//				Test case 4 - Basis path : 12-13-14-15-18-20-21-12-22 
				$(new int[] {-9,-9}, 0),
//				Test case 5 - Basis path : 12-13-14-15-18-19-20-21-12-22 
				$(new int[] {9,9,9}, 0),
//				Test case 6 - MCDC FTT
				$(new int[] {-11}, 0),
//				Test case 7 - MCDC TFT
				$(new int[] {11}, 0),
//				Test case 8 - MCDC TTF
				$(new int[] {-8}, 0),
//				Test case 9 - ECP Type: Multiple Unique Numbers
				$(new int[] {-9, -2, -4, -7, -5, -3}, 4),
//				Test case 10 - ECP Type: Both Positive and Negative Numbers
				$(new int[] {-9, 9, -7, -3, 2}, 4),
//				Test case 11 - ECP Position: Unique Numbers At First Position
				$(new int[] {-9, 8, 6, 4, 2}, 1),
//				Test case 12 - ECP Position: Unique Numbers At Middle Position
				$(new int[] {6, 8, -7, 4, 2}, 1),
//				Test case 13 - ECP Position: Unique Numbers At Last Position
				$(new int[] {2, 8, 6, 4, -9}, 1)
		);
	}

	
	@Before
	public void setUp() throws Exception {
		count = new Problem4_countUniqueNums();
	}

	@Test
	@Parameters(method="parametersForProblem4")
	public void test( int nums[], int unique) {
		
		
		assertEquals(unique, count.countUnique(nums));
		
	}

}

