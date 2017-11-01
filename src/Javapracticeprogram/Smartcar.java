package Javapracticeprogram;
import Vehicle.Car;

public class Smartcar extends Car {

	public static void main(String[] args) {
		Smartcar Toyota=new Smartcar();
		Toyota.smodel="Camry x";
		Toyota.igear=6;
		Toyota.highspeed=300;
		Toyota.Displaycharacterstics();
	}

}
