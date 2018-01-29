package beforeTest;

import utils.Util;

public class GenomicRangeQuery {
    public static void main(String[] args) {
        Util.printResult(solution("CAGCCTA",
                new int[]{2,5,0},
                new int[] {4,5,6}),
                new int[]{2,4,1});
    }

    public static int[] solution(String s, int[] P, int[] Q) {
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int lowest = Integer.MAX_VALUE;
            for (int j = P[i]; j <= Q[i]; j++) {
                lowest = Math.min(lowest, getImpactFactor(s.charAt(j)));
            }
            result[i] = lowest;
        }

        return result;
    }

    public static int getImpactFactor(char c) {
        switch (c) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            default :
                return 4;
        }
    }
}
