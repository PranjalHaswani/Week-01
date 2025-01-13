import java.util.Scanner;

public class LeapYearChecker {
	 public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;  // Divisible by 100 but not 400, not a leap year
                }
            } else {
                return true;  // Divisible by 4 but not by 100, it's a leap year
            }
        }
        return false;  // Not divisible by 4, not a leap year
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (year >= 1582) {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Please enter a year greater than or equal to 1582.");
        }
        scanner.close();   // Close the scanner object
    }
}