import java.util.Random;
import java.util.Scanner;

class Lab_09_ArrayStuff {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Declare and initialize the array
        int[] dataPoints = new int[100];

        // Populate the array with random values between 1 and 100
        Random rnd = new Random();
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1; // Generates a random integer between 1 and 100 (inclusive)
        }

        // Display the values in the array separated by " | "
        System.out.print("Values in dataPoints array: ");
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // Move to the next line

        // Calculate the sum and average of the values in the array
        int sum = 0;
        for (int dataPoint : dataPoints) {
            sum += dataPoint;
        }
        double average = (double) sum / dataPoints.length;

        // Output the sum and average
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);

        // Prompt user for input
        int userValue = getRangedInt("Enter an integer between 1 and 100: ", 1, 100);

        // Count how many times the user's value is found within the array
        int count = 0;
        for (int value : dataPoints) {
            if (value == userValue) {
                count++;
            }
        }
        System.out.println("The user's value " + userValue + " was found " + count + " times in the array.");

        // Prompt user again for input
        userValue = getRangedInt("Enter another integer between 1 and 100: ", 1, 100);

        // Find the position of the user's value in the array
        int position = -1;
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                position = i;
                break; // exit the loop when the value is found
            }
        }
        if (position != -1) {
            System.out.println("The value " + userValue + " was found at array index " + position);
        } else {
            System.out.println("The value " + userValue + " was not found in the array.");
        }

        // Find minimum and maximum values in the array
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int i = 1; i < dataPoints.length; i++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            }
        }
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);

        // Calculate and display the average of dataPoints
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }

    public static int getRangedInt(String prompt, int low, int high) {
        int intValue;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // discard non-integer input
            }
            intValue = scanner.nextInt();
        } while (intValue < low || intValue > high);
        return intValue;
    }

    public static double getAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}
