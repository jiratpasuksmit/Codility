package _a;

import utils.Util;

import java.util.Arrays;

public class OneSwap {
    public static void main(String[]args) {
        Util.printResult(solution(new int[]{1,5,3,3,7}), true);
        Util.printResult(solution(new int[]{1,3,5,3,4}), false);
        Util.printResult(solution(Util.getRandomArrayInt(1000000000, 100)), false);
    }

    public static boolean solution(int[] A) {
        int[] b = Arrays.copyOf(A, A.length);
        Arrays.sort(b);
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != b[i]) {
                count++;
            }
        }

        return count <= 2 ;
    }
}
