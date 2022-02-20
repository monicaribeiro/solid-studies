package singleResponsibilityPrinciple;

import java.util.Scanner;

public class MathematicalCalculationApp {
    public static void main(String[] args) {
        // Receiving input
        System.out.println("Welcome to the Application!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        String firstNumber = scanner.nextLine();

        System.out.println("Enter the second number:");
        String secondNumber = scanner.nextLine();

        scanner.close();

        int firstInteger = 0;
        int secondInteger = 0;

        // Validations
        if (firstNumber == null) {
            System.out.println("First number is not valid...");
            return;
        }

        try {
            firstInteger = Integer.parseInt(firstNumber);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("First number is not valid...");
            return;
        }

        if (secondNumber == null) {
            System.out.println("Second number is not valid...");
            return;
        }

        try {
            secondInteger = Integer.parseInt(secondNumber);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Second number is not valid...");
            return;
        }

        // Mathematical calculation
        int result = firstInteger + secondInteger;

        // Returning result to user
        System.out.println("The result is: " + result);
        System.out.println("End of the application!");
    }
}
