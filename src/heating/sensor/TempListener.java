package heating.sensor;

public interface TempListener {
	
	void onTempChange(/*@ non_null @*/ int temp);

}
