package Vehicle;

//default member 
public class Car {
	public String smodel;
	 public int igear;
	 public int highspeed;
	 public static int isteering;
	 public static int wheels;
	 public static int idoors;
	 
	 public Car()
	 {
		isteering=1;
		wheels=4;
		
		
	 }
	
	public void Displaycharacterstics()
	 {
		 System.out.println("model of the car" + smodel);
		 System.out.println("Gears of the car are"+ igear);
		 System.out.println("top speed of the car"+ highspeed);
	 }
	/*public void Print()
	{
		Displaycharacterstics();
	}*/

}
