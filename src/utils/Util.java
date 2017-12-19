package utils;

import java.util.Arrays;

public class Util {
    public static void printArray(int[] ints) {
        System.out.println(getArrayString(ints));
    }

    public static String getArrayString(int[] ints) {
        StringBuilder s = new StringBuilder();
        for (int anInt : ints) {
            s.append(anInt).append(", ");
        }
        return s.toString();
    }

    public static void printResult(int input, int expected) {
        System.out.println("guess " + input + " / result " + expected + " :: " + (input == expected));
    }

    public static void printResult(int[] input, int[] expected) {
        System.out.println("guess " + getArrayString(input) + " / result " + getArrayString(expected) + " :: " + (Arrays.equals(input, expected)));
    }
}
