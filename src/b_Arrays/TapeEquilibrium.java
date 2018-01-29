package b_Arrays;

import utils.Util;

public class TapeEquilibrium {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{-1000, 1000}), 2000);
        Util.printResult(solution(new int[]{3, 1, 2, 4, 3}), 1);
        Util.printResult(solution(new int[]{0, 1}), 1);
    }

    public static int solution(int[] A) {
        int rightSum = 0;
        for (int i : A) {
            rightSum += i;
        }

        int lowestSum = Integer.MAX_VALUE;
        int leftSum = 0;
        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            lowestSum = Math.min(lowestSum, Math.abs(leftSum - rightSum));
        }

        return lowestSum;
    }
}
