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
        long N = A.length + 1;
        long total = (N * (N + 1)) / 2;

        long sum = 0L;

        for (int i : A) {

            sum += i;
        }

        return (int)(total - sum);
    }
}
