package lighting.sensor;

import lighting.LightingController;

public class LightListenerImpl implements LightListener{
	
	/*@
	 @ public invariant lightingController != null;
	 @*/
	private /*@ spec_public non_null @*/ LightingController lightingController;
	
	/*@ public behaviour 
	 @ requires lightingController != null;
	 @ ensures this.lightingController == lightingController;
	 @*/
	public LightListenerImpl(LightingController lightingController) {
		this.lightingController = lightingController;
	}
	/*@ public behaviour
	 @ requires lux >= 0;
	 @*/
	@Override
	public void onLuxChange(/*@ non_null @*/ int lux) {
		lightingController.updateLuxFromListener(lux);		
	}
}
