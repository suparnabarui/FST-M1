package activities;


public class Bicycle implements BicycleParts, BicycleOperations{

	 private int speed;

	    public Bicycle() {
	        this.speed = 0; // Initial speed
	    }

	    // Implement speedUp
	    public void speedUp(int increment) {
	        speed += increment;
	        if (speed > maxSpeed) {
	            speed = maxSpeed;
	        }
	        System.out.println("Speed increased to: " + speed + " km/h");
	    }

	    // Implement applyBrake
	    public void applyBrake(int decrement) {
	        speed -= decrement;
	        if (speed < 0) {
	            speed = 0;
	        }
	        System.out.println("Speed decreased to: " + speed + " km/h");
	    }

	    public int getCurrentSpeed() {
	        return speed;
}
}
