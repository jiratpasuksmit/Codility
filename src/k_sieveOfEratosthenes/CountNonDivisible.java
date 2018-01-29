package k_sieveOfEratosthenes;

import utils.Util;

import java.util.*;

public class CountNonDivisible {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{6, 3}), new int[]{0, 1});
        Util.printResult(solution(new int[]{3, 1, 2, 3, 6}), new int[]{2, 4, 3, 2, 0});
        Util.printResult(solution(new int[]{6}), new int[]{0});
        Util.printResult(solution(new int[]{1, 3, 5, 7, 11, 13}), new int[]{5, 4, 4, 4, 4, 4});
    }

    public static int[] solution(int[] A) {
        HashMap<Integer, Integer> count = new HashMap<>();
        Arrays.stream(A).boxed().forEach(i -> count.put(i, count.get(i) == null ? 1 : count.get(i) + 1));


        // find divisors first
        HashMap<Integer, Integer> div = new HashMap<>();
        Set<Integer> keySet = count.keySet();
        for (Integer i : keySet) {
            int sum = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0 && j * j <= i) {
                    if (keySet.contains(j)) {
                        sum += count.get(j);
                    }
                    int k = i / j;
                    if (keySet.contains(k) && k != j) {
                        sum += count.get(k);
                    }
                }
                div.put(i, A.length - sum);
            }
        }

        for (int i = 0; i < A.length; i++) {
            A[i] = div.get(A[i]);
        }

        return A;
    }
}
