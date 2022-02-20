package singleResponsibilityPrinciple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AppOrderedNumbers {
    public static final int THRESHOLD = 5;

    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");
        System.out.println("Enter 5 valid integers in the range [0, 10]");

        List<Integer> nums = getInputFromUser();
        sortInput(nums);
        returnOutput(nums);
    }

    private static void sortInput(List<Integer> nums) {
        Collections.sort(nums);
    }

    private static List<Integer> getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        while (nums.size() < THRESHOLD) {

            String input = scanner.nextLine();

            if (!isInputANumber(input))
                System.out.println("Invalid! Try again!");

            int inputNumber = Integer.parseInt(input);

            if (!isNumberInTheRange(inputNumber))
                System.out.println("Invalid range! Try again!");

            nums.add(inputNumber);
        }

        scanner.close();
        return nums;
    }

    private static boolean isInputANumber(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private static boolean isNumberInTheRange(Integer input) {
        if (input < 0 || input > 10)
            return false;

        return true;
    }

    private static void returnOutput(List<Integer> nums) {
        for (int num : nums)
            System.out.print(num + " ");
    }
}
