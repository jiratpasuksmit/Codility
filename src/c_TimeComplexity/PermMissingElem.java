package c_TimeComplexity;

import java.util.Arrays;

public class PermMissingElem {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 3, 1, 5, 4, 8, 6, 7, 9}));
        System.out.println(solution(new int[]{1}));
        System.out.println(solution(new int[]{1, 2}));
        System.out.println(solution(new int[]{}));
    }

    public static int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }
        Arrays.sort(A);
        int i;
        for (i = 0; i < A.length; i++) {
            if (A[i] != i + 1) {
                return i + 1;
            }
        }
        return i + 1;
    }
}
