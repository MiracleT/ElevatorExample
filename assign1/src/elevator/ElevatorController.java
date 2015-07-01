package elevator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ElevatorController
{	
	ElevatorButton eb = new ElevatorButton();
	ElevatorDoor ed = new ElevatorDoor();
	Floor[] f = new Floor[5];

	FloorButton fb = new FloorButton();
	//int from,to;



	public ElevatorController(int i)
	{
		Floor floor = new Floor();
		floor.setFloorNumber(0);
	}



	public void serviceRequest(int from,int to) throws NumberFormatException, IOException{
			
			eb.callElevator(from);
			ed.openDoor();
			System.out.println("****************************person enters**********************************");
			ed.closeDoor();
			fb.chooseFloor(from,to);
			ed.openDoor();
			System.out.println("****************************person moves out**********************************");
			ed.closeDoor();
		
	}

}
