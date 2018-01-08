package heating.heatpump;

public class HeatPumpImpl implements HeatPump{
	
	private /*@ spec_public non_null @*/ int temper;
	
	/*@
	 @ assignable this.temper;
	 @ ensures this.temper == temp;
	 @*/
	private void setTemp(/*@ non_null @*/ int temp) {
		this.temper = temp;
	}
	
	@Override
	public void update(/*@ non_null @*/ int temp, /*@ non_null @*/ int currentTemp) {
		setTemp(temp);
	}

}
