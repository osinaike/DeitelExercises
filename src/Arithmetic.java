import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number1 - number2;
        int quotient = number1 / number2;

        System.out.printf("sum is %d%n", sum);
        System.out.printf("product is %d%n", product);
        System.out.printf("difference is %d%n", difference);
        System.out.printf("division is %d%n", quotient);
    }
}
