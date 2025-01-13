import java.util.Arrays;

public class NumberCheckerStaticMethod {
	  public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];  
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;  // First column: digit
            frequency[i][1] = 0;  // Second column: frequency
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        int number = 12345;
        int[] digits = storeDigits(number);
      
        System.out.println("Count of digits: " + countDigits(number));  //  Count of digits
        System.out.println("Sum of digits: " + sumOfDigits(digits)); // Sum of digits
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is the number a Harshad number? " + isHarshadNumber(number, digits));      
        int[][] frequency = digitFrequency(digits);        // Frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }
    }
}