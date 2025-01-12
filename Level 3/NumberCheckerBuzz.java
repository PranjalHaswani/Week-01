public class NumberCheckerBuzz {
	   public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // number is divisible by i, hence not prime
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
      
        return sumOfDigits == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        // Check if the square ends with the number itself
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7");
    }

    // Main method to test the NumberChecker methods
    public static void main(String[] args) {
        int number = 153; // You can change this number for testing other cases
        
        boolean prime = isPrime(number);
        System.out.println(number + " is a prime number: " + prime);
        
        boolean neon = isNeonNumber(number);
        System.out.println(number + " is a neon number: " + neon);
        
        boolean spy = isSpyNumber(number);
        System.out.println(number + " is a spy number: " + spy);
       
        boolean automorphic = isAutomorphicNumber(number);
        System.out.println(number + " is an automorphic number: " + automorphic);
        boolean buzz = isBuzzNumber(number);
        System.out.println(number + " is a buzz number: " + buzz);
    }
}