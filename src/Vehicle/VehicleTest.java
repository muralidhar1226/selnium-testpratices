package Vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		Car1 personalcar=new Car1(4);
		personalcar.setlicensePlate("PERSONAL CAR AP09CQ1658");
		System.out.println(personalcar);
		
		Sportscar sportscar=new Sportscar(2, 200);
		sportscar.setlicensePlate("sports car AP 09 CQ 0007");
		System.out.println(sportscar);
	}
	

}
