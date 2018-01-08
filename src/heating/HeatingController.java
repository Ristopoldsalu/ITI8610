package heating;

import heating.heatpump.HeatPump;
import heating.heatpump.HeatPumpImpl;

public class HeatingController {
	
	private /*@ spec_public non_null @*/ HeatPump heatPump = new HeatPumpImpl();
	private /*@ spec_public non_null @*/ int tempr;
	private /*@ spec_public non_null @*/ int currentTemp;
	
	/*@
 	 @
 	@*/
	public void setTemp(/*@ non_null @*/ int temp) {
		setTempr(temp);
		heatPump.update(this.tempr, temp);
	}
	
	/*@
	 @ ensures \result == currentTemp;
	 @*/
	public int getTemp() {
		return currentTemp;
	}
	/*@
	 @ ensures this.currentTemp == temp; 
	 @*/
	public void updateTempFromListener(/*@ non_null @*/ int temp) {
		this.currentTemp = temp;
		if(temp != currentTemp) heatPump.update(this.tempr, temp);
	}
	
	/*@
	 @ ensures this.tempr == temp;
	@*/
	private void setTempr(int temp) {
		this.tempr = temp;
	}
	
}
