package utils;

import java.util.Arrays;
import java.util.function.IntPredicate;

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

    public static void printResultIfMatchAny(int input, int[] expected) {
        boolean correct = Arrays.stream(expected).anyMatch(value -> value == input);
        System.out.println("guess " + input + " / result " + getArrayString(expected) + " :: " + correct);
    }
}
