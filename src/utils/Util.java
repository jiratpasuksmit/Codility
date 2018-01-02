package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.ToIntFunction;

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

    public static int[] getRandomArrayInt(int maxValue, int length) {
        int result[] = new int[length];
        for (int i = 0; i < result.length - 1; i++) {
            result[i] = (int)(Math.random() * maxValue);
        }
        result[result.length-1] = maxValue;
        return result;
    }

    public static int[] getArrayInt(ArrayList<Integer> pattern, int times) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < times; i++) {
            result.addAll(pattern);
        }
        return result.stream().mapToInt(value -> value).toArray();
    }

    public static void printResult(int input, int expected) {
        System.out.println("guess " + input + " / result " + expected + " :: " + (input == expected));
    }

    public static void printResult(boolean input, boolean expected) {
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
