package beforeTest;

import utils.Util;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{9, 5, 7, 3, 2, 7, 3, 1, 10, 8}), 0);
        Util.printResult(solution(new int[]{4,1,3,2}), 1);
        Util.printResult(solution(new int[]{4,1,3}), 0);
        Util.printResult(solution(new int[]{4,1,3}), 0);
        Util.printResult(solution(new int[]{2}), 0);
        Util.printResult(solution(new int[]{1}), 1);
    }

    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (set.contains(A[i])) {
                return 0;
            } else {
                set.add(A[i]);
            }
            max = Math.max(max, A[i]);
        }

        if (max == A.length) {
            return 1;
        } else {
            return 0;
        }
    }
}
