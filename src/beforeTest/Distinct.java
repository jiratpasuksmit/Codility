package beforeTest;

import utils.Util;

import java.util.HashSet;

public class Distinct {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{2, 1, 1, 2, 3, 1}), 3);
        Util.printResult(solution(new int[]{2, 1, 1, 1}), 2);
        Util.printResult(solution(new int[]{1, 1, 1, 2}), 2);
    }

    public static int solution(int[] A) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : A) {
            set.add(i);
        }
        return set.size();
    }
}
