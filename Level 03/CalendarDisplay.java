import java.util.Scanner;

public class CalendarDisplay {

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] monthNames = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return monthNames[month - 1];
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // Check for leap year in February
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        
        return daysInMonth[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        // Adjust month and year for January and February
        if (month <= 2) {
            month += 12;
            year--;
        }
        
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + 31 * m0 / 12) % 7;
        
        return d0;
    }

    // Method to display the calendar for the given month and year
    public static void displayCalendar(int month, int year) {
        // Get the name of the month and the number of days in the month
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        
        // Get the first day of the month
        int firstDay = getFirstDayOfMonth(month, year);

        // Display the header of the calendar
        System.out.println(monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Display the initial spaces based on the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Print spaces for the days before the first day
        }

        // Display the days of the month
        int day = 1;
        for (int i = firstDay; i < 7; i++) {
            System.out.printf("%3d ", day++);
        }
        System.out.println();

        // Display the remaining weeks
        while (day <= daysInMonth) {
            for (int i = 0; i < 7 && day <= daysInMonth; i++) {
                System.out.printf("%3d ", day++);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user for the month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        // Display the calendar for the given month and year
        displayCalendar(month, year);
        
        // Close the scanner
        scanner.close();
    }
}
