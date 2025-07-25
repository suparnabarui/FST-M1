package activities;

public class Activity7 {

	public static void main(String[] args) {
		
		Bicycle myBike = new Bicycle();
        System.out.println("Tyres: " + BicycleParts.tyres);
        System.out.println("Max Speed: " + BicycleParts.maxSpeed + " km/h");

        myBike.speedUp(30);
        myBike.speedUp(50);
        myBike.applyBrake(20);
        myBike.applyBrake(70);
	}

}
