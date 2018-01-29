package b_Arrays;

import utils.Util;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{2,3,1,5}), 4);
    }

    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i : A) {
            set.add(i);
        }
        return 0;
    }
}
