package beforeTest;

import utils.Util;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{10, 2, 5, 1, 8, 20}), 1);
        Util.printResult(solution(new int[]{10, 50, 5, 1}), 0);
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        for (int p = 0; p < A.length - 2; p++) {
            long l = (long)A[p] + (long)A[p + 1];
            if (l > A[p + 2]) {
                return 1;
            }
        }
        return 0;
    }
}
