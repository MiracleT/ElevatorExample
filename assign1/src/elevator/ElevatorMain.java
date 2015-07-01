package elevator;

import java.io.IOException;

/**
 * 
 * @author 1303:Melroy Fernandes
 * 		   1309:Miracle D'souza
 *		
 */
public class ElevatorMain
{

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		
		ElevatorController ec=new ElevatorController(0);
		ec.serviceRequest(0,5);
		ec.serviceRequest(2,0);
		
	}

}
