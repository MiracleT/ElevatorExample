package elevator;

public class ElevatorButton extends Button
{
	Floor f=new Floor();
	public void callElevator(int currentFloorNumber){
		
		f.gotoFloor(currentFloorNumber);
				
	}
}
