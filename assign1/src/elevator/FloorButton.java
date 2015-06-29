package elevator;

public class FloorButton extends Button{
	ElevatorDoor  ed=new ElevatorDoor();
	Floor ff=new Floor();
public void chooseFloor(int currentFloorNumber,int gotoFloorNumber){
	ff.setFloorNumber(currentFloorNumber);
ff.gotoFloor(gotoFloorNumber);
	
	
}

}
