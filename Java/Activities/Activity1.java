package activities;

public class Activity1 {

	public static void main(String[] args) {
		
		Car myCar = new Car();  
        myCar.color = "Black";
        myCar.transmission = "Automatic";
        myCar.make = 2023;

        myCar.displayCharacteristics();
        myCar.accelarate();
        myCar.brake();
	}

}
