package activities;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        try {
		            throw new CustomException("This is a custom exception message.");
		        } catch (CustomException e) {
		            System.out.println("Caught Exception: " + e.getMessage());
		        }
		    
	}

}
