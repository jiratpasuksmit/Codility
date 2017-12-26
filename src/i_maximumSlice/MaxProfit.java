package i_maximumSlice;


import utils.Util;

public class MaxProfit {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{23171,21011,21123,21366,21013,21367}), 356);
        Util.printResult(solution(new int[]{}), 0);
        Util.printResult(solution(new int[]{-1}), 0);
    }

    public static int solution(int[] A) {
        if (A.length == 0) {
            return 0;
        }
        int maxEnding = 0, maxProfit = 0;
        for (int i = 1; i < A.length; i++) {
            int currentProfit = A[i] - A[i-1];
            maxEnding = Math.max(0, maxEnding + currentProfit);
            maxProfit = Math.max(maxProfit, maxEnding);
        }
        return maxProfit > 0 ? maxProfit : 0;
    }
}