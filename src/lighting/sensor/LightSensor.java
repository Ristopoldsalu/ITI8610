package lighting.sensor;

public class LightSensor {
	
	/*@
	 @ public invariant lux >= 0;
	 @ public invariant lightListener != null;
	 @*/
	private /*@ spec_public non_null @*/ int lux;
	private /*@ spec_public non_null @*/ LightListener lightListener;
	
	/*@ public behaviour
	 @ requires lightListener != null;
	 @ ensures this.lightListener != null;
	 @ ensures this.lightListener == lightListener;
	 @*/
	public LightSensor(/*@ non_null @*/ LightListener lightListener) {
		this.lightListener = lightListener;
	}
	
	/*@ public behaviour
	 @ requires lux >= 0;
	 @*/
	public void registerLuxChange(/*@ non_null @*/ int lux) {
		if(this.lux != lux) {
			setLux(lux);
			lightListener.onLuxChange(lux);
		}
	}
	
	/*@ private behaviour
	 @ requires lux >= 0;
	 @ assignable this.lux;
	 @ ensures this.lux == lux;
	 @*/
	private void setLux(/*@ non_null @*/ int lux) {
		this.lux = lux;
	}
}
