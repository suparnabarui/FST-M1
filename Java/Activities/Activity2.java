package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {10, 77, 10, 54, -11, 10};

        // Target number and expected sum
        int target = 10;
        int expectedSum = 30;

        // Sum the 10s in the array
        int sum = 0;
        for (int number : numbers) {
            if (number == target) {
                sum += number;
            }
        }

        // Check if the sum of 10s is exactly 30
        boolean result = (sum == expectedSum);
        System.out.println("Result: " + result);  // Output: true
	}

}
