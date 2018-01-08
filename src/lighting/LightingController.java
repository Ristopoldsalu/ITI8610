package lighting;

import lighting.light.Light;
import lighting.light.LightImpl;

public class LightingController {
	
	private /*@ spec_public non_null @*/ boolean automatic;
	private /*@ spec_public non_null @*/ int currentLux;
	private /*@ spec_public non_null @*/ int lux;
	private /*@ spec_public non_null @*/ int lightLevel;
	private /*@ spec_public non_null @*/ Light light = new LightImpl();
	
	
	/*@
	@ assignable automatic;
	@ ensures automatic == true || automatic == false;
	@ assignable currentLux;
	@ ensures currentLux >= 0;
	@ assignable lux;
	@ ensures this.lux >= 0;
	@ assignable lightLevel;
	@ ensures this.lightLevel >= 0;
	@*/
	public LightingController() {
		this.automatic = false;
		this.currentLux = 0;
		this.lux = 0;
		this.lightLevel = 0;
	}
	
	//ensures this.lightLevel == \old(lightLevel) + lux - this.currentLux;
	
	/*@ public behaviour 
	 @ requires lux >= 0;
	 @*/
	public void setAutomaticLight(/*@ non_null @*/ int lux) {
		setAutomatic(true);
		setLux(lux);
		setLightLevel(this.lightLevel + lux - this.currentLux);
		this.light.update(this.lightLevel);
	}
	
	/*@
	@ ensures this.lux == lux;
	@ assignable this.lux;
	@*/
	private void setLux(int lux) {
		this.lux = lux;
	}

	/*@
	@ ensures this.automatic == automatic;
	@ assignable this.automatic;
	@*/
	private void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	/*@ public behaviour 
	 @ requires lux >= 0;
	 @*/
	public void setManualLight(int lux) {
		setAutomatic(false);
		setLightLevel(lux);
		this.light.update(lightLevel);
	}
	
	/*@
	@ ensures this.lightLevel == lightLevel;
	@ assignable this.lightLevel;
	@*/
	private void setLightLevel(int lux) {
		this.lightLevel = lux;
	}

	/*@ public behaviour
	 @ ensures \result == this.currentLux;
	 @*/
	/*@ pure @*/ public int getLight() {
		return currentLux;
	}
	
	/*@ public behaviour
	 @ requires lux >= 0;
	 @ ensures this.automatic && lux <= this.lux ==>
	 @ this.lightLevel == \old(this.lightLevel) + 1;
	 @ also
	 @ requires lux >= 0;
	 @ ensures this.automatic && lux > this.lux ==>
	 @ this.lightLevel == \old(this.lightLevel) - 1;
	 @*/
	public void updateLuxFromListener(/*@ non_null @*/ int lux) {
		setCurrentLux(lux);
		if (this.automatic && lux <= this.lux) {
			setLightLevel(this.lightLevel+1);
			this.light.update(this.lightLevel);
		}
		if (this.automatic && lux >= this.lux) {
			setLightLevel(this.lightLevel-1);
			this.light.update(this.lightLevel);
		}
	}

	/*@
	@ requires lux >= 0;
	@ ensures this.currentLux == currentLux;
	@ assignable this.currentLux;
	@*/
	private void setCurrentLux(int lux) {
		this.currentLux = lux;
		
	}
	
}
