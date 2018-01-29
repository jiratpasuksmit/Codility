package _a;

import utils.Util;

public class PositiveNegativeSlice {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{0, 0, 0}), 3);
        Util.printResult(solution(new int[]{0}), 1);
        Util.printResult(solution(new int[]{1}), 1);
        Util.printResult(solution(new int[]{-1}), 1);
        Util.printResult(solution(new int[]{1, 2, 3}), 1);
        Util.printResult(solution(new int[]{5, 4, -3, 2, 0, 1, -1, 0, 2, -3, 4, -5}), 7);
        Util.printResult(solution(new int[]{5, -3, 2, 0, 0, 0, 0, 5, 0, 0, -1, 3, 0, 8}), 11);
    }

    public static int solution(int[] A) {
        if (A.length == 1) {
            return 1;
        }
        int maxCount = 0;
        int aCount = 0, bCount = 0;
        for (int p = 0; p < A.length; p++) {
            boolean odd = p % 2 == 1;

            if (odd && A[p] >= 0) { // positive at odd pos
                aCount++;
            } else if (!odd && A[p] <= 0) {
                aCount++;
            } else {
                maxCount = Math.max(aCount, maxCount);
                aCount = 0;
            }

            if (!odd && A[p] >= 0) { // positive at even pos
                bCount++;
            } else if (odd && A[p] <= 0) {
                bCount++;
            } else {
                maxCount = Math.max(bCount, maxCount);
                bCount = 0;
            }
        }

        maxCount = Math.max(maxCount, Math.max(bCount, aCount));
        return maxCount;
    }
}