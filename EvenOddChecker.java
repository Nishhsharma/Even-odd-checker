import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Even or Odd Checker ===");
        System.out.print("Enter an integer: ");

        // Read integer input from the user
        int number = scanner.nextInt();

        // Check even or odd using modulus operator
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }

        // Close scanner
        scanner.close();

        System.out.println("=== Program Ended ===");
    }
}
