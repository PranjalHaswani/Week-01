import java.util.Scanner;

public class SumOfNaturalNumbersForLoop {
    public static boolean isNaturalNumber(int n) {
        return n > 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        
        if (isNaturalNumber(n)) {
            int sumFormula = n * (n + 1) / 2;
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }
            System.out.println("Sum using formula (n*(n+1)/2): " + sumFormula);
            System.out.println("Sum using for loop: " + sumFor);

            if (sumFormula == sumFor) {
                System.out.println("Both results are correct and the same!");
            } else {
                System.out.println("The results do not match.");
            }
        } else {
            System.out.println("Please enter a valid natural number.");
        }

        sc.close();
    }
}
