package activities;

public class Activity3 {

	
		static final double EARTH_YEAR_SECONDS = 31557600;

	    
	    public static double onEarth(double seconds) {
	        return seconds / EARTH_YEAR_SECONDS;
	    }

	    public static double onMercury(double seconds) {
	        return onEarth(seconds) / 0.2408467;
	    }

	    public static double onVenus(double seconds) {
	        return onEarth(seconds) / 0.61519726;
	    }

	    public static double onMars(double seconds) {
	        return onEarth(seconds) / 1.8808158;
	    }

	    public static double onJupiter(double seconds) {
	        return onEarth(seconds) / 11.862615;
	    }

	    public static double onSaturn(double seconds) {
	        return onEarth(seconds) / 29.447498;
	    }

	    public static double onUranus(double seconds) {
	        return onEarth(seconds) / 84.016846;
	    }

	    public static double onNeptune(double seconds) {
	        return onEarth(seconds) / 164.79132;
	    }

	    public static void main(String[] args) {
	        double ageInSeconds = 1_000_000_000;

	        System.out.printf("Age on Earth: %.2f years%n", onEarth(ageInSeconds));
	        System.out.printf("Age on Mercury: %.2f years%n", onMercury(ageInSeconds));
	        System.out.printf("Age on Venus: %.2f years%n", onVenus(ageInSeconds));
	        System.out.printf("Age on Mars: %.2f years%n", onMars(ageInSeconds));
	        System.out.printf("Age on Jupiter: %.2f years%n", onJupiter(ageInSeconds));
	        System.out.printf("Age on Saturn: %.2f years%n", onSaturn(ageInSeconds));
	        System.out.printf("Age on Uranus: %.2f years%n", onUranus(ageInSeconds));
	        System.out.printf("Age on Neptune: %.2f years%n", onNeptune(ageInSeconds));
	}

}
