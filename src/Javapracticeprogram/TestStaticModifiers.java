package Javapracticeprogram;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import Vehicle.Car;

public class TestStaticModifiers extends Car {

	public static void main(String[] args) {
		Car Toyota=new Car();
		Toyota.smodel="camry";
		Toyota.igear=4;
		Toyota.highspeed=240;
		Car.idoors=4;
		Toyota.Displaycharacterstics();
		System.out.println(" number of steering" + Car.isteering);
		System.out.println("number of doors" + Car.idoors);
		System.out.println("number of wheels" + Car.wheels);
	}

}
