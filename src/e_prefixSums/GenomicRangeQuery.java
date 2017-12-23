package e_prefixSums;

import utils.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenomicRangeQuery {
    public static void main(String[] args) {
        Util.printResult(solution("CAGCCTA", new int[]{2, 5, 0}, new int[]{4, 5, 6}), new int[]{2,4,1});
    }

    public static int[] solution(String S, int[] P, int[] Q) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < P.length; i++) {
            int pScore = getImpactScore(S.charAt(P[i]));
            int qScore = getImpactScore(S.charAt(Q[i]));
            ans.add(Math.min(pScore, qScore));
        }

        int[] intArray = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            intArray[i] = ans.get(i);
        }

        return intArray;
    }

    public static int getImpactScore(char c) {
        switch (c) {
            case 'A':
                return 1;
            case 'C':
                return 2;
            case 'G':
                return 3;
            case 'T':
                return 4;
            default:
                return -1;
        }
    }

}