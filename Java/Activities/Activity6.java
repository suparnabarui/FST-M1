package activities;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Plane plane = new Plane(5);

        plane.onboardPassenger("Alice");
        plane.onboardPassenger("Bob");

        plane.takeOff();
        
        System.out.println("Passengers onboard: " + plane.getPassengers());

        plane.land();

        System.out.println("Last landing time: " + plane.getLastTimeLanded());
        System.out.println("Passengers after landing: " + plane.getPassengers());
    }
}
