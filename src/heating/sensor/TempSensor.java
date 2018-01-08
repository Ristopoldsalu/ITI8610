package heating.sensor;
//@ model import org.jmlspecs.models.JMLDouble;

public class TempSensor {

	/*@
	 @ public invariant tempListener != null;
	 @*/
	private /*@ spec_public non_null @*/ int temp;
	private /*@ spec_public non_null @*/ TempListener tempListener;
	
	/*@ 
	 @ requires tempListener != null;
	 @ assignable this.tempListener;
	 @ ensures this.tempListener == tempListener;
	 @*/
	public TempSensor(TempListener tempListener) {
		this.tempListener = tempListener;
	}
		
	/*@ 
	 @ assignable this.temp;
	 @ ensures this.temp == temp;
	 @*/
	private void setTemp(/*@ non_null @*/ int temp) {
		this.temp = temp;
	}
	
	/*@
	 @ 
	 @*/
	public void registerTempChange(/*@ non_null @*/ int temp) {
		setTemp(temp);
		this.tempListener.onTempChange(temp);
	}
	
}
