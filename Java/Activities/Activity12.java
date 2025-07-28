package activities;


public class Activity12 {
    public static void main(String[] args) {
        // Lambda expression without a body (single expression)
        Addable ad1 = (num1, num2) -> num1 + num2;

        // Lambda expression with a body (uses curly braces and return)
        Addable ad2 = (num1, num2) -> {
            int result = num1 + num2;
            return result;
        };

        // Use the lambda expressions
        System.out.println("Using ad1: 10 + 20 = " + ad1.add(10, 20));
        System.out.println("Using ad2: 15 + 25 = " + ad2.add(15, 25));
    }
}
