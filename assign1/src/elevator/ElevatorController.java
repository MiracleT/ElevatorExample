package elevator;

public class ElevatorController
{	
	ElevatorButton eb = new ElevatorButton();
	ElevatorDoor ed=new ElevatorDoor();
	Floor f=new Floor();
	FloorButton fb=new FloorButton();
	
	public void useElevator(){
	f.setFloorNumber(0);	
	eb.callElevator(3);
	ed.openDoor();
	System.out.println("****************************person enters**********************************");
	ed.closeDoor();
	fb.chooseFloor(3,5);
	ed.openDoor();
	System.out.println("****************************person moves out**********************************");
	ed.closeDoor();
	
	}
	

	
	/**public void elevatorMenu(){
		System.out.println("o:open door c:close door [1 2 3 4 5]:choose floor ");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			String x = br.readLine();
			switch(x){
			case "o":Open();
			break;
			case "c":Close();
			break;
			case "1":case "2":case "3": case "4": case "5":
				int floor=Integer.parseInt(x);
				setLevel(floor);
			break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	
//	}
}
