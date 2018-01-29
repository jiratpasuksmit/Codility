package beforeTest;

import utils.Util;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{-3,1,2,-2,5,6}), 60);
        Util.printResult(solution(new int[]{-3,-2,-1,0,1,2}), 12);
        Util.printResult(solution(new int[]{-3,-2,-1,1,2}), 12);
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        int maxA = A[A.length - 1];
        int maxB = A[A.length - 2];
        int maxC = A[A.length - 3];

        int minA = A[0];
        int minB = A[1];

        int a = maxA * maxB * maxC;
        int b = maxA * minA * minB;

        return Math.max(a,b);
    }
}
