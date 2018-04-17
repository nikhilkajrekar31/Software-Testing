package Code;


public class Problem1_microwaveClass {

	boolean cooking;
	int timer;
	
	public Problem1_microwaveClass (boolean cooking, int timer) {
		this.cooking=cooking;
		this.timer=timer;
	}
	
	public void operateMicrowave (boolean stopButton, boolean startButton, boolean doorOpen) {
	
	if (cooking)
		if (doorOpen || stopButton)
			cooking=false;
		else
			if (timer>0)
				timer--;
			else
				cooking=false; 
	else
		if (!doorOpen && startButton &&!stopButton) 
			cooking=true;
	}

	public boolean iscooking() {
		return cooking;
	}

	public int getTimer() {
		return timer;
	}

	public void setTimer(int timer) {
		this.timer = timer;
	}

	public boolean isCooking() {
		return cooking;
	}

	public void setCooking(boolean cooking) {
		this.cooking = cooking;
	}

}