package elevator;

public class ElevatorDoor {

	private Boolean isOpen = false;
	
	public void openDoor(){
		System.out.println("open the door");
	}
	public void closeDoor(){
		System.out.println("close the door");
	}
	public Boolean getIsOpen()
	{
		return isOpen;
	}
	public void setIsOpen(Boolean isOpen)
	{
		this.isOpen = isOpen;
	}
}
