package i_maximumSlice;


import utils.Util;

public class MaxSliceSum {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{3, 2, -6, 4, 0}), 5);
    }

    public static int solution(int[] A) {
        int maxEnding = A[0], maxSum = A[0];
        for (int i = 1; i < A.length; i++) {
            maxEnding = Math.max(A[i], maxEnding + A[i]);
            maxSum = Math.max(maxSum, maxEnding);
        }
        return maxSum;
    }
}