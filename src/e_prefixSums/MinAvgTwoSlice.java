package e_prefixSums;

import utils.Util;

import java.util.Arrays;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{4, 2, 2, 5, 1, 5, 8}), 1);
        Util.printResult(solution(new int[]{-3, -5, -8, -4, -10}), 2);
    }

    public static int solution(int[] A) {
        int lastP = 0;
        double minAvg = Integer.MAX_VALUE;
        for (int i = 0; i < A.length - 1; i++) {
            int sum = A[i];
            for (int j = i + 1; j < A.length; j++) {
                sum += A[j];
                double newAvg = sum / (j - i + 1.0);
                if (newAvg < minAvg) {
                    minAvg = newAvg;
                    lastP = i;
                }
            }
        }

        return lastP;
    }

}