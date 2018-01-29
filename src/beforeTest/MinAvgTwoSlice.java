package beforeTest;

import utils.Util;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        Util.printResult(solution(new int[] {10000,-10000}), 0);
        Util.printResult(solution(new int[] {4,2,2,5,1,5,8}), 1);
    }

    public static int solution(int[] A) {
        double minAvg = Integer.MAX_VALUE;
        int minPos = 0;
        for (int i = 0; i < A.length - 2; i++) {
            double a = (A[i] + A[i + 1]) / 2.0;
            double b = (A[i] + A[i + 1] + A[i + 2]) / 3.0;
            double c = (A[i + 1] + A[i + 2]) / 2.0;
            if (a < b && a < c && a < minAvg) {
                minPos = i;
                minAvg = a;
            } else if (b < a && b < c && b < minAvg) {
                minPos = i;
                minAvg = b;
            } else if (c < a && c < b && c < minAvg) {
                minPos = i + 1;
                minAvg = c;
            }
        }

        double last = (A[A.length - 2] + A[A.length - 1]) / 2.0;
        if (last < minAvg) {
            minPos = A.length - 2;
            minAvg = last;
        }

        return minPos;
    }
}
