package k_sieveOfEratosthenes;

import utils.Util;

public class CountSemiprimes {
    public static void main(String[] args) {
        Util.printResult(solution(26, new int[]{1, 4, 16}, new int[]{26, 10, 20}), new int[]{10, 4, 0});
    }

    public static int[] solution(int N, int[] P, int[] Q) {
        boolean[] includeList = new boolean[N + 1];
        includeList[0] = false;
        if (includeList.length > 1) {
            includeList[1] = false;
        }
        for (int i = 2; i < includeList.length; i++) {
            includeList[i] = true;
        }

        return new int[]{};

    }
}
