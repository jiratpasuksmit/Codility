package beforeTest;

import utils.Util;

public class CyclicRotation {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{3, 8, 9, 7, 6}, 3), new int[]{9, 7, 6, 3, 8});
        Util.printResult(solution(new int[]{5, -1000}, 1), new int[]{-1000, 5});
        Util.printResult(solution(new int[]{1, 2, 3, 4}, 4), new int[]{1, 2, 3, 4});
        Util.printResult(solution(new int[]{1}, 4), new int[]{1});
        Util.printResult(solution(new int[]{}, 4), new int[]{});
        Util.printResult(solution(new int[]{2, 3, 1, 5, 6, 7, 0}, 4), new int[]{5, 6, 7, 0, 2, 3, 1});
    }


    public static int[] solution(int[] A, int K) {
        if (A.length <= 1) {
            return A;
        }

        int startPos = A.length - (K % A.length);
        int[] result = new int[A.length];
        for (int i = startPos; i < A.length ; i++) {
            result[i - startPos] = A[i];
        }
        for (int i = 0; i < startPos; i++) {
            result[i + startPos + 1] = A[i];
        }


        return result;
    }
}
