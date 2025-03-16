import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Use ternary operator to check if the year is a leap year
        String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? "Leap Year" : "Not a Leap Year";

        // Output the result
        System.out.println(result);

        // Close the scanner object
        scanner.close();
    }
}
