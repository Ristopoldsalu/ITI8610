import heating.sensor.TempListener;
import heating.sensor.TempListenerImpl;
import heating.sensor.TempSensor;
import lighting.sensor.LightListener;
import lighting.sensor.LightListenerImpl;
import lighting.sensor.LightSensor;
import smartHome.CentralController;
import smartHome.RoomController;

public class main {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CentralController controller = new CentralController();
		controller.addRoomController(new RoomController());
		int TEST_ROOM_ID = 0;
		int MANUAL_LUX_CHANGE = 200;
		LightListener lightObserver = new LightListenerImpl(controller.getRoomLightingController(TEST_ROOM_ID));
		LightSensor lightSensor = new LightSensor(lightObserver);
		
		TempListener tempObserver = new TempListenerImpl(controller.getRoomHeatingController(TEST_ROOM_ID));
		TempSensor tempSensor = new TempSensor(tempObserver);
		
		/*Set manual light to 30 lumens*//*
		controller.setRoomManualLight(0, MANUAL_LUX_CHANGE);
		System.out.println(controller.getRoomLight(0));
		
		lightSensor.registerLuxChange(MANUAL_LUX_CHANGE);
		System.out.println(controller.getRoomLight(0));
		
		controller.setRoomAutomaticLight(0, 400);
		System.out.println(controller.getRoomLight(0));
	}
*/

}
