import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner scnr = new Scanner(System.in);
        double num1;
        double num2;
        int token;

        System.out.print("Enter first operand: ");
        num1 = scnr.nextDouble();
        System.out.print("Enter second operand: ");
        num2 = scnr.nextDouble();

        System.out.println("\nCalculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("\nWhich operation do you want to perform? ");
        token = scnr.nextInt();

        switch(token)
        {
            case 1:
                System.out.println("\nThe result of the operation is " + (num1 + num2) + ". Goodbye!");
                break;
            case 2:
                System.out.println("\nThe result of the operation is " + (num1 - num2) + ". Goodbye!");
                break;
            case 3:
                System.out.println("\nThe result of the operation is " + (num1 * num2) + ". Goodbye!");
                break;
            case 4:
                System.out.println("\nThe result of the operation is " + (num1 / num2) + ". Goodbye!");
                break;
            default:
                System.out.println("\nError: Invalid selection! Terminating program.");
                break;
        }

    }

}
