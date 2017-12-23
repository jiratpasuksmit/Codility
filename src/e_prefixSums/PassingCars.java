package e_prefixSums;

import utils.Util;

import java.util.Arrays;

public class PassingCars {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{0, 1, 0, 1, 1}), 5);
        Util.printResult(solution(new int[]{1}), 0);
        Util.printResult(solution(new int[]{0, 1}), 1);
        Util.printResult(solution(new int[]{1, 0}), 0);
    }

    public static int solution(int[] A) {
        int pairs = 0;
        int stackCount = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] == 1) {
                stackCount++;
            } else {
                pairs += stackCount;
                if (pairs > 1000000000) {
                    return -1;
                }
            }
        }

        return pairs;
    }

}