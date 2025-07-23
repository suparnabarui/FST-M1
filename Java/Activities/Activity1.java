package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car myCar = new Car();  // tyres and doors default to 4
        myCar.color = "Black";
        myCar.transmission = "Automatic";
        myCar.make = 2023;

        myCar.displayCharacteristics();
        myCar.accelarate();
        myCar.brake();
	}

}
