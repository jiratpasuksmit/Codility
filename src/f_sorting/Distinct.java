package f_sorting;

import utils.Util;

import java.util.Arrays;

public class Distinct {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{-3, 1, 2, -2, 5, 6}), 60);
        Util.printResult(solution(new int[]{-5, 5, -5, 4}), 125);
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        return Math.max(A[A.length - 1] * A[A.length-2] * A[A.length-3], A[0] * A[1] * A[A.length - 1]);
    }

}