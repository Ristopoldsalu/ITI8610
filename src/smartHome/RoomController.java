package smartHome;

import heating.HeatingController;
import lighting.LightingController;

public class RoomController {
	
	private /*@ spec_public non_null @*/ int id;
	/*@ spec_public non_null @*/ HeatingController heatingController = new HeatingController();
	/*@ spec_public non_null @*/ LightingController lightingController = new LightingController();
	
	/*@
	@ assignable heatingController;
	@ ensures heatingController != null;
	@ assignable lightingController;
	@ ensures lightingController != null;
	@*/
	public RoomController() {
		heatingController = new HeatingController();
		lightingController = new LightingController();
	}
	
	/*@ 
	 @ ensures true;
	 @*/
	void setTemp(/*@ non_null @*/ int temp) {
		heatingController.setTemp(temp);
	}
	
	/*@
	 @ ensures true;
	 @*/
	double getTemp() {
		return heatingController.getTemp();
	}
	
	/*@ 
	 @ requires lux >= 0;
	 @*/
	void setAutomaticLight(/*@ non_null @*/ int lux) {
		lightingController.setAutomaticLight(lux);
	}
	
	/*@ 
	 @ requires lux >= 0;
	 @
	 @*/
	public void setManualLight(/*@ non_null @*/ int lux) {
		lightingController.setManualLight(lux);
	}
	
	/*@
	 @ ensures true;	
	 @*/
	public int getLight() {
		return lightingController.getLight();
	}

	/*@
	@ ensures \result == id;
	@*/
	/*@ pure @*/public int getId() {
		return id;
	}
	
	/*@ public behaviour
	 @ requires id >= 0;
	 @ assignable this.id;
	 @ ensures this.id == id;
	 @*/
	public void setId(/*@ non_null @*/int id) {
		this.id = id;
	}
}
