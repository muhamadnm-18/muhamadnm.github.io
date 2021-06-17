package inheritanceTest;

public class Bike extends Vehicle {
	// Mountain bike, road bike, recumbent bik ... etc
	private String bikeType;
	
	public Bike (int numWheels, String bikeType)
	{
		super(numWheels);
		this.bikeType = bikeType;
	}
	
	public String getBikeType() {
		return bikeType;
	}
}
