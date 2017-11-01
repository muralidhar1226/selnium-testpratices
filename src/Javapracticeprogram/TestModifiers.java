package Javapracticeprogram;
import Vehicle.Car;

public class TestModifiers extends Car {

	public static void main(String[] args) {
		Car Toyota=new Car();
		Toyota.smodel="chevorlet";
		Toyota.igear=4;
		Toyota.highspeed=240;
		
		Toyota.Displaycharacterstics();
		//Toyota.Print();

		
	}

}
