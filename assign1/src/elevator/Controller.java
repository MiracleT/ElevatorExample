package elevator;

public class Controller
{
	ElevatorButton button = new ElevatorButton();
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
		
	}
}
