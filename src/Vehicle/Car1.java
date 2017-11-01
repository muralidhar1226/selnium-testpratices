package Vehicle;

public class Car1 extends Vehicle {
	protected int numberofseats=0;
	
	public int getNumberofseats()
	{
		return this.numberofseats;
	}
	// constructor
	public Car1(int i_numberofseats)
	{
		super();
		numberofseats=i_numberofseats;
	}
	//method
	public void setlicensePlate(String License)
	{
		super.setlicensePlate(License);
	}
	
	public String toString()
	{
		return "the car has number of seats" +numberofseats+ " and its license plate number is " +licenseplate;
	}

}
