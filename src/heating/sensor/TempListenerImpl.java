package heating.sensor;

import heating.HeatingController;

public class TempListenerImpl implements TempListener {

	/*@
	 @ public invariant heatingController != null;
	 @*/
	private /*@ spec_public non_null @*/ HeatingController heatingController;
	
	/*@ 
	 @ requires heatingController != null;
	 @ assignable this.heatingController;
	 @ ensures this.heatingController == heatingController;
	 @*/
	public TempListenerImpl(HeatingController heatingController) {
		this.heatingController = heatingController;
	}
	
	@Override
	public void onTempChange(/*@ non_null @*/ int temp) {
		heatingController.updateTempFromListener(temp);
	}
	
	
	
}
