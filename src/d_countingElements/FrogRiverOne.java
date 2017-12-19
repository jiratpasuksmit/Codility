package d_countingElements;

import utils.Util;

import java.util.HashSet;

public class FrogRiverOne {
    public static void main(String[] args) {
        Util.printResult(solution(5, new int[]{1,3,1,4,2,3,5,4}), 6);
        Util.printResult(solution(5, new int[]{1}), -1);
        Util.printResult(solution(1, new int[]{1}), 0);
        Util.printResult(solution(2, new int[]{1, 2}), 1);
    }

    public static int solution(int X, int[] A) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X) {
                hashSet.add(A[i]);
            }

            if (hashSet.size() >= X) {
                return i;
            }
        }
        return -1;
    }

}