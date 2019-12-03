import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //declare variables
        double firstOperand;
        double secondOperand;
        int performOp;
        double outputNumber;

        //calculator begins

        System.out.print("Enter first operand: ");
        firstOperand = scanner.nextDouble();

        System.out.print("Enter second operand: ");
        secondOperand = scanner.nextDouble();

        System.out.print("\n");

        //menu
        System.out.println("Calculator Menu");
        System.out.println("---------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division\n");

        System.out.print("Which operation do you want to perform? ");
        performOp = scanner.nextInt();
        System.out.print("\n");

        //calculations
        if (performOp == 1) {
            //addition
            outputNumber = firstOperand + secondOperand;
            System.out.println("The result of the operation is " + outputNumber + ". Goodbye!");
        }
        else if (performOp == 2) {
            //subtraction
            outputNumber = firstOperand - secondOperand;
            System.out.println("The result of the operation is " + outputNumber + ". Goodbye!");
        }
        else if (performOp == 3) {
            //multiplication
            outputNumber = firstOperand * secondOperand;
            System.out.println("The result of the operation is " + outputNumber + ". Goodbye!");
        }
        else if (performOp == 4) {
            //division
            outputNumber = firstOperand / secondOperand;
            System.out.println("The result of the operation is " + outputNumber + ". Goodbye!");
        }
        else {
            //error message
            System.out.println("Error: Invalid selection! Terminating program.");
        }
    }
}

