package c_TimeComplexity;

public class TapeEquilibrium {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3}));
    }

    public static int solution(int[] A) {
        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }

        int leftSum = 0, rightSum = 0;
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            rightSum += A[i];
        }
        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            int diff = Math.abs(leftSum - rightSum);
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
