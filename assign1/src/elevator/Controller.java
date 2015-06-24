package elevator;

public class Controller
{
	ElevatorButton level1 = new ElevatorButton();
	ElevatorButton level2 = new ElevatorButton();
	ElevatorDoor door = new ElevatorDoor();
	
	public void Open()
	{
		if(!door.getIsOpen())
		{
			door.setIsOpen(true);
			door.openDoor();
		}
		else
		{
			door.setIsOpen(false);
			door.closeDoor();
		}
	}
	
	public void changeLevel()
	{
		System.out.println("change level");
		
			
	}
}
