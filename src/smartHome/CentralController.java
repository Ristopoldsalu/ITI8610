package smartHome;

import java.util.ArrayList;
import java.util.List;

import heating.HeatingController;
import lighting.LightingController;

public class CentralController {
	/*@
	 @ public invariant roomControllers != null &&
	 @ (\forall RoomController room; roomControllers.contains(room); room != null);
	 @*/
	private /*@ spec_public non_null @*/ List<RoomController> roomControllers = new ArrayList<RoomController>();
	private /*@ non_null @*/ int idCounter = 0;
	/*@ 
	 @ requires roomId >= 0;
	 @ ensures (\exists RoomController room; 
	 @ roomControllers.contains(room) && room.getId() == roomId ==> \result == room);
	 @ ensures (\exists RoomController room; 
	 @ !roomControllers.contains(room) ==> \result == null);
	 @*/
	private /*@ pure @*/ RoomController getRoomController(/*@ non_null @*/ int roomId) {
		RoomController room = null;
		for (int i = 0; i < roomControllers.size(); i++) {
			if (roomControllers.get(i).getId() == roomId) {
				room = roomControllers.get(i);
				break;
			}
		}
		return room;
	}
	
	/*@
	@ requires room != null;
	@ ensures !roomControllers.contains(room) ==>  \old(roomControllers.size()) +1 == roomControllers.size();
	@ ensures roomControllers.contains(room);
	@ also
	@ requires room != null;
	@ ensures roomControllers.contains(room) ==> \old(roomControllers.size()) == roomControllers.size();
	@ ensures roomControllers.contains(room);
	@*/
	public RoomController addRoomController(RoomController room) {
		room.setId(idCounter++);
		if (!roomControllers.contains(room)) {
			roomControllers.add(room);
		}
		return room;
	}
	
	/*@ 
	 @ requires roomId >= 0;
	 @*/
	void setRoomTemp(/*@ non_null @*/ int roomId,/*@ non_null @*/  int temp) {
		RoomController roomController = getRoomController(roomId);
		roomController.setTemp(temp);
	}
	
	/*@
	@ requires roomId >= 0;
	@ ensures (\exists RoomController room;
	@ roomControllers.contains(room) && room.getId() == roomId ) == false ==>
	@ \result == null;
	@*/
	public Double getRoomTemp(/*@ non_null @*/ int roomId) {
		RoomController roomController = getRoomController(roomId);
		return roomController.getTemp();
	}
	
	/*@ 
	 @ requires roomId >= 0;
	 @ requires lux >= 0;
	 @*/
	public void setRoomAutomaticLight(/*@ non_null @*/ int roomId,/*@ non_null @*/ int lux) {
		RoomController roomController = getRoomController(roomId);
		roomController.setAutomaticLight(lux);
	}
	
	/*@ 
	 @ requires roomId >= 0;
	 @ requires lux >= 0;
	 @*/
	public void setRoomManualLight(/*@ non_null @*/ int roomId,/*@ non_null @*/ int lux) {
		RoomController roomController = getRoomController(roomId);
		roomController.setManualLight(lux);
	}

	/*@ 
 	 @ requires roomId >= 0;
	 @ ensures (\exists RoomController room;
	 @ roomControllers.contains(room) && room.getId() == roomId ) == false ==>
	 @ \result == null;
 	 @*/
	public Integer getRoomLight(int roomId) {
		RoomController roomController = getRoomController(roomId);
		return roomController.getLight();
	}
	
	/*@
	 @ requires roomId >= 0;
	 @ ensures (\exists RoomController room;
	 @ roomControllers.contains(room) && room.getId() == roomId ==>
	 @ \result == room.lightingController);
	 @*/
	public LightingController getRoomLightingController(/*@ non_null @*/int roomId) {
		RoomController roomController = getRoomController(roomId);
		return roomController.lightingController;
	}
	
	/*@
	 @ requires roomId >= 0;
	 @ ensures (\exists RoomController room;
	 @ roomControllers.contains(room) && room.getId() == roomId ==>
	 @ \result == room.heatingController);
	 @*/
	public HeatingController getRoomHeatingController(/*@ non_null @*/int roomId) {
		RoomController roomController = getRoomController(roomId);
		return roomController.heatingController;
	}
}
