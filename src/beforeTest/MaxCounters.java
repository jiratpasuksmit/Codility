package beforeTest;

import utils.Util;

import java.util.HashSet;

public class MaxCounters {
    public static void main(String[] args) {
        Util.printResult(solution(5, new int[]{3,4,4,6,1,4,4}), new int[] {3,2,2,4,2});
    }

    public static int[] solution(int N, int[] A) {
        int[] result = new int[N];

        int max = Integer.MIN_VALUE;
        int min = 0;
        for (int i = 0; i < A.length; i++) {
            if (1 <= A[i] && A[i] <= N) {
                int base = Math.max(min, result[A[i] - 1]);
                result[A[i] - 1] = base + 1;
                max = Math.max(result[A[i] - 1], max);
            } else if (A[i] == N + 1) {
                min = max;
            }
        }

        for (int i = 0; i < result.length; i++) {
            result[i] = Math.max(min, result[i]);
        }
        return result;
    }
}
