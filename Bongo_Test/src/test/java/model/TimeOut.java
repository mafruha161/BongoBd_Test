package model;

public class TimeOut {
	
	public void timeOut() {
		try {
			Thread.sleep(20000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}


}
