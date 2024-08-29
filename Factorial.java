import java.util.Scanner;

public class Factorial {

    // Method to calculate factorial iteratively
    public static long factorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method to calculate factorial recursively
    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int number = 0;
        
        System.out.println("Factorial Calculator");
        System.out.println("Choose a method:");
        System.out.println("1. Iterative");
        System.out.println("2. Recursive");

        // Validate input for method choice
        while (true) {
            try {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please select 1 or 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }

        // Validate and get number input
        while (true) {
            try {
                System.out.println("Enter a non-negative integer:");
                number = scanner.nextInt();
                if (number < 0) {
                    System.out.println("Number must be non-negative.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear invalid input
            }
        }

        long result = 0;

        if (choice == 1) {
            result = factorialIterative(number);
        } else {
            result = factorialRecursive(number);
        }

        System.out.println("The factorial of " + number + " is: " + result);

        scanner.close();
    }
}