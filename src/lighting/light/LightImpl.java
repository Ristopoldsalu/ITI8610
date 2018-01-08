package lighting.light;

public class LightImpl implements Light {
	/*@ non_null @*/ int lux;
	
	/*@ private behaviour
	 @ requires lux >= 0;
	 @ assignable \everything;
	 @ ensures this.lux != lux ==> this.lux == lux;
	 @ ensures this.lux >= 0;
	 @*/
	@Override
	public void update(/*@ non_null @*/  int lux) {
		this.lux = lux;
	}
}