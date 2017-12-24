package g_stackAndQueue;

import utils.Util;

import java.util.Arrays;

public class Brackets {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{10, 2, 5, 1, 8, 20}), 1);
        Util.printResult(solution(new int[]{10, 50, 5, 1}), 0);
        Util.printResult(solution(new int[]{5, 3, 3}), 1);

    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length - 2; i++) {
            if (isTriangular(A[i], A[i + 1], A[i + 2])) {
                return 1;
            }
        }
        return 0;
    }

    public static boolean isTriangular(int p, int q, int r) {
        return (long) p + q > r &&
                (long) q + r > p &&
                (long) r + p > q;
    }

}