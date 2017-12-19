package d_countingElements;

import utils.Util;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        Util.printResult(solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}), new int[]{3, 2, 2, 4, 2});
        Util.printResult(solution(5, new int[]{3}), new int[]{0, 0, 1, 0, 0});
        Util.printResult(solution(1, new int[]{1}), new int[]{1});
        Util.printResult(solution(1, new int[]{6}), new int[]{0});
    }


    public static int[] solution(int N, int[] A) {
        // 100 / 66 Solution
//        int counter[] = new int[N];
//        int max = 0;
//        for (int i = 0; i < A.length; i++) {
//            if (1 <= A[i] && A[i] <= N) {
//                // increase(X)
//                int newValue = ++counter[A[i] - 1];
//                max = Math.max(max, newValue);
//            } else if (A[i] == N + 1) {
//                // max counter
//                Arrays.fill(counter, max);
//            }
//        }
//
//        return counter;

        /** 100/100 solution **/
        int counter[] = new int[N];
        int max = 0, min = 0;
        for (int i = 0; i < A.length; i++) {
            if (1 <= A[i] && A[i] <= N) {
                // increase(X)
                int updatedValue = Math.max(min, counter[A[i] - 1]) + 1;
                counter[A[i] - 1] = updatedValue;
                max = Math.max(max, updatedValue);
            } else if (A[i] == N + 1) {
                // max counter
                min = max;
            }
        }

        for (int i = 0; i < counter.length; i++) {
            if (counter[i] < min) {
                counter[i] = min;
            }
        }

        return counter;
    }
}