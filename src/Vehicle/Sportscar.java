package Vehicle;

public class Sportscar extends Car1 {
	double maxspeed=0;

	public Sportscar(int i_numberofseats, double imaxspeed) {
		super(i_numberofseats);
		// TODO Auto-generated constructor stub
		maxspeed=imaxspeed;
	}
	// vehicle class has setLicenseplate method
	@Override 
	public void setlicensePlate(String License)
	{
		this.licenseplate=License.toLowerCase();
	}
	// Car1 class has To string which is here override method
	@Override
	public String toString()
	{
		return super.toString() + "..its max speed is  " +maxspeed;
		
	}

}
