package Task;

import java.util.Scanner;

public class Java1 {

    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = one.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = one.nextDouble();

        one.nextLine();

        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String typeofoperation = one.nextLine().toLowerCase();

        double result;

        if (typeofoperation.equals("add")) {
            result = a + b;
        } else if (typeofoperation.equals("subtract")) {
            result = a - b;
        } else if (typeofoperation.equals("multiply")) {
            result = a * b;
        } else if (typeofoperation.equals("divide")) {
            if (b == 0) {
                System.out.println("Cannot divide by zero.");
                return;
            }
            result = a / b;
        } else {
            System.out.println("Invalid operation.");
            return;
        }

        System.out.println("Result: " + result);
    }
}
