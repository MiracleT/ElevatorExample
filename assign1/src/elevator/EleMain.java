package elevator;

public class EleMain
{

	public static void main(String[] args) 
	{
		Controller control = new Controller();
		control.displayPanel();
		control.Open();
		control.changeLevel();
		control.Open();
		
	}

}
