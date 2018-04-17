package Code;

public class Problem2_sodaClass {

	private String m;
	private boolean c,d;
	private Problem2_sodaEnum State;
		
	public Problem2_sodaClass(String m, boolean c, boolean d, Problem2_sodaEnum state) {
		this.m = m;
		this.c = c;
		this.d = d;
		this.State = state;
	}

	public void processState (boolean q,boolean s,boolean r) {

		switch (State) {
		
		case S0:if (s || r) {m = "Welcome";State=Problem2_sodaEnum.S0;}
				else 
					{m = "25 cents credit";State=Problem2_sodaEnum.S1;}
				c=d=false; 
				break;
				
		case S1:if (s) {m = "25 cents credit";c=d=false;State=Problem2_sodaEnum.S1;}
				else
					if (r) {m = "Welcome";d=false; c=true;State=Problem2_sodaEnum.S0;}
					else
						{m = "50 cents credit";c=d=false;State=Problem2_sodaEnum.S2;}
				break;		
				
		case S2:if (s) {m = "50 cents credit";c=d=false;State=Problem2_sodaEnum.S2;}
				else
					if (r) {m = "25 cents credit";d=false; c=true;State=Problem2_sodaEnum.S1;}
					else
						{m = "75 cents credit";c=d=false;State=Problem2_sodaEnum.S3;}
				break;
				
		case S3:if (s) {m = "Welcome";d=true; c=false;State=Problem2_sodaEnum.S0;}
				else
					if (r) {m = "50 cents credit";d=false; c=true;State=Problem2_sodaEnum.S2;}
					else
						{m = "75 cents credit";c=d=false;State=Problem2_sodaEnum.S3;}
				break;
		case Start:
		default: //this is for the Start constructor - we ignore this				
		}
	}

	public String getM() {
		return m;
	}

	public boolean isC() {
		return c;
	}

	public boolean isD() {
		return d;
	}

	public Problem2_sodaEnum getState() {
		return State;
	}

	public void setState(Problem2_sodaEnum state) {
		State = state;
	}

}