import java.util.Scanner;

public class SwitchCaseCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        String op = sc.next();
        
        for (int i = 1; i < 2; i++) {
            switch (op) {
                case "+":
                    System.out.println(first + second);
                    break;
                case "-":
                    System.out.println(first - second);
                    break;
                case "*":
                    System.out.println(first * second);
                    break;
                case "/":
                    if (second != 0) {
                        System.out.println(first / second);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
                    break;
            }
        }
    }
}
