package beforeTest;

import utils.Util;

import java.util.HashSet;
import java.util.Set;

public class FragRiverOne {
    public static void main(String[] args) {
        Util.printResult(solution(5, new int[]{1,3,1,4,2,3,5,4}), 6);
    }

    public static int solution(int X, int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (!set.contains(A[i])) {
                set.add(A[i]);
            }

            if (set.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
