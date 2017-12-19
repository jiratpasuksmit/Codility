package b_Arrays;

import java.util.HashSet;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    public static int solution(int[] A) {
        HashSet<Integer> tree = new HashSet<>();
        for (int i : A) {
            int oldSize = tree.size();
            tree.add(i);
            if (tree.size() == oldSize) {
                tree.remove(i);
            }
        }

        return tree.iterator().next();
    }
}
