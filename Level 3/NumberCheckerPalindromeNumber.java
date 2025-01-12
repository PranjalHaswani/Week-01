import java.util.Arrays;

public class NumberCheckerPalindromeNumber {
	 public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
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

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversedDigits = reverseDigits(digits);
        return compareArrays(digits, reversedDigits);
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        for (int digit : digits) {
            if (digit != 0) {
                return true; // Duck number has a non-zero digit
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 131;  // Example number

        int digitCount = countDigits(number);
        System.out.println("Number of digits in " + number + ": " + digitCount);

        int[] digits = storeDigits(number);
        System.out.print("Digits of " + number + ": ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        int[] reversedDigits = reverseDigits(digits);
        System.out.print("Reversed digits of " + number + ": ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        boolean isPalindrome = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + isPalindrome);

        boolean isDuckNumber = isDuckNumber(number);
        System.out.println("Is " + number + " a duck number? " + isDuckNumber);
    }
}