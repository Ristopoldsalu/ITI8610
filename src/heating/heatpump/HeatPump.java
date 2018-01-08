package heating.heatpump;

public interface HeatPump {
	
	void update(/*@ non_null @*/ int temp,/*@ non_null @*/ int realTemp);
	
}
