package Code;

public class Problem4_countUniqueNums {

	public int countUnique (int[] nums) {
//	 	intVal records the number of times a unique single digit odd int occurs.
//		counts single negative, zero and positive numbers only
//		for example, [1, 2, 3, 5, 1, 2, 3, -1, 7] will return 3
//		non compliant int values are ignored
		int unique=0;
		int [] intVal = new int[10];
		for (int i = 0; i<nums.length; i++) {
			if ((nums[i]>=-9) && (nums[i]<=9) && nums[i]%2!=0) {
				intVal[(nums[i]+9)/2]++;
				if (intVal[(nums[i]+9)/2]==1)
					unique++;
				else
					if (intVal[(nums[i]+9)/2]==2) 
						unique--;
			}
		}
		return unique;
	 }
	}