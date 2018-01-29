package beforeTest;

import utils.Util;

import java.util.HashSet;

public class MissingInteger {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{1,3,1,4,2,3,5,4}), 6);
    }

    public static int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0)
                set.add(A[i]);
        }

        int smallest = 1;
        while (set.contains(smallest)) {
            smallest++;
        }
        return smallest;
    }
}
