package d_countingElements;

import utils.Util;

import java.util.Arrays;

public class PermCheck {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{4,1,3,2}),1);
        Util.printResult(solution(new int[]{4,1,3}),0);
        Util.printResult(solution(new int[]{1}),1);
        Util.printResult(solution(new int[]{2}),0);
        Util.printResult(solution(new int[]{}),0);
    }

    public static int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return 0;
            }
        }
        return 1;
    }

}