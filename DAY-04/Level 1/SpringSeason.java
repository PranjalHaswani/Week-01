public class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
		 // Spring season is from March 20 to June 20
        if (month == 3 && day >= 20) {
            return true; // March 20 and after
        } else if (month == 4 || month == 5) {
            return true; // All days in April and May
        } else if (month == 6 && day <= 20) {
            return true; // June 1 to June 20
        } else {
            return false; // Outside the Spring season
        }
    }

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide both month and day as command line arguments.");
            return;
        }
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check if the date is within Spring season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}