package SafeInput;

import java.util.Scanner;

import static java.lang.reflect.Array.getInt;

class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        // Your main method code here
    }

    /**
     * Prompts the user to input an integer within a specified inclusive range.
     *
     * @param pipe    a Scanner opened to read from System.in
     * @param prompt  prompt for the user
     * @param low     low value for the input range
     * @param high    high value for the input range
     * @return an integer within the specified range inputted by the user
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int intValue;
        do {
            intValue = getInt(pipe, prompt + " [" + low + " - " + high + "]");
        } while (intValue < low || intValue > high);
        return intValue;
    }

    private static int getInt(Scanner pipe, String s) {


        return 0;
    }
}
