package Code;

public class Problem3_railroadClass {

	public int calcCurrBoxNumber (int boxInCarNum, int rrCarNum, int shipmentNum) {
		int BoxesperRRCars[][] = {{380, 420, 400, 430, 380, 400, 430, 420, 380, 360},  //schedule 1
								  {380, 400, 420, 430, 380, 400, 430, 420, 380, 360}}; //schedule 2
		int currBox=0,schedule=1;
		if ( ((shipmentNum % 4 == 0) && (shipmentNum % 8 != 0)) || (shipmentNum % 10 == 0)) 
			schedule=2;
		for (int i=0;i<rrCarNum-1;i++)
			currBox+=BoxesperRRCars[schedule-1][i];
		currBox+=boxInCarNum;
		return currBox;
	}
}