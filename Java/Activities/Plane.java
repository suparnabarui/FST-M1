package activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Plane {
    // Private fields
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOff;
    private Date lastTimeLanded;

    // Constructor
    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    // Method to onboard a passenger
    public boolean onboardPassenger(String passengerName) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passengerName);
            return true;
        }
        return false;
    }

    // Method to take off
    public void takeOff() {
        this.lastTimeTookOff = new Date();
        System.out.println("Plane took off at: " + lastTimeTookOff);
    }

    // Method to land
    public void land() {
        this.lastTimeLanded = new Date();
        passengers.clear(); // all passengers leave
        System.out.println("Plane landed at: " + lastTimeLanded);
    }

    // Getters
    public List<String> getPassengers() {
        return new ArrayList<>(passengers); // return a copy to protect internal list
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public Date getLastTimeTookOff() {
        return lastTimeTookOff;
    }

    public Date getLastTimeLanded() {
        return lastTimeLanded;
    }
}
