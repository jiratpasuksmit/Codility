package d_countingElements;

import utils.Util;

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{1, 3, 6, 4, 1, 2}), 5);
        Util.printResult(solution(new int[]{1, 2, 3}), 4);
        Util.printResult(solution(new int[]{-1, -3}), 1);
        Util.printResult(solution(new int[]{}), 1);
        Util.printResult(solution(new int[]{0}), 1);
        Util.printResult(solution(new int[]{1, 2, 5}), 3);
        Util.printResult(solution(new int[]{2}), 1);
    }

    public static int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }

        Arrays.sort(A);
        if (A[A.length - 1] <= 0) {
            return 1;
        }

        boolean firstPositiveFound = false;
        for (int i = 0; i < A.length; i++) {

            if (!firstPositiveFound && A[i] > 0) {
                firstPositiveFound = true;
                if (A[i] != 1) {
                    return 1;
                }
            }

            if (firstPositiveFound &&
                    i < A.length - 1 &&
                    !(A[i + 1] - 1 == A[i] || A[i + 1] == A[i])) {
                return A[i] + 1;
            }
        }

        return A[A.length - 1] + 1;
    }

}