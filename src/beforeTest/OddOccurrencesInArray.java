package beforeTest;

import utils.Util;

import java.util.HashMap;
import java.util.HashSet;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        Util.printResult(solution(new int[] {9,3,9,3,9,7,9}), 7);
    }


    public static int solution(int[] A) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (hashSet.contains(A[i])) {
                hashSet.remove(A[i]);
            } else {
                hashSet.add(A[i]);
            }
        }

        return hashSet.iterator().next();
    }
}
