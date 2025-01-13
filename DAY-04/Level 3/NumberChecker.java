import java.util.Arrays;

public class NumberChecker {
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

    // Method to check if the number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false; // Duck number must have at least one non-zero digit
    }

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number);
        int numDigits = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits); // Sum of digits raised to the power of the number of digits
        }
        return sum == number;
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[]{smallest, secondSmallest};
    }

    // Main method to test the NumberChecker methods
    public static void main(String[] args) {
        int number = 153; // You can change this number for testing other cases
        int digitCount = countDigits(number);
        System.out.println("Count of digits in " + number + ": " + digitCount);
        int[] digits = storeDigits(number);
        System.out.println("Digits of the number: " + Arrays.toString(digits));
        boolean isDuck = isDuckNumber(number);
        System.out.println(number + " is a Duck number: " + isDuck);

        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println(number + " is an Armstrong number: " + isArmstrong);

        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);

        int[] smallestAndSecondSmallest = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestAndSecondSmallest[0]);
        System.out.println("Second smallest digit: " + smallestAndSecondSmallest[1]);
    }
}