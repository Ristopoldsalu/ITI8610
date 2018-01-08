package lighting.sensor;

public interface LightListener {
	
	/*@ requires lux >= 0;
	  @
	 */
	public void onLuxChange(/*@ non_null @*/ int lux);

}
