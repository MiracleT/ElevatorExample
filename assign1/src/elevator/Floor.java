package elevator;

public class Floor {
	int floorNumber;

	public int getFloorNumber() {
		return floorNumber;
	}

	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public void gotoFloor(int currentFloorNumber){
		if(floorNumber!=currentFloorNumber){
			if(floorNumber<currentFloorNumber){
				for(int i=floorNumber+1;i<=currentFloorNumber;i++){
					this.setFloorNumber(i);
					System.out.println("elevator reached "+floorNumber);
				}
			}
			if(floorNumber>currentFloorNumber){
				for(int i=getFloorNumber()-1;i>=currentFloorNumber;i--){
					this.setFloorNumber(i);
					System.out.println("elevator reached "+floorNumber);
				}
			}

		}

	}
}
