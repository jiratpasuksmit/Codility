package b_Arrays;

import utils.Util;

import java.util.ArrayList;

public class CyclicRotation {
    public static void main(String[] args) {
        Util.printArray(solution(new int[]{3, 8, 9, 7, 6}, 8));
    }

    public static int[] solution(int[] A, int K) {
        if (A.length <= 1) {
            return A;
        }

        int startIndex = A.length - (K % A.length);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = startIndex; i < A.length; i++) {
            list.add(A[i]);
        }
        for (int i = 0; i < startIndex; i++) {
            list.add(A[i]);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
