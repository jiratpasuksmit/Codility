package beforeTest;

import utils.Util;

import java.util.Arrays;

public class CountDiv {
    public static void main(String[] args) {
        Util.printResult(solution(6, 11, 2), 3);
        Util.printResult(solution(0, 0, 1), 1);
        Util.printResult(solution(0, 1, 1), 2);
        Util.printResult(solution(1, 14, 7), 2);
        Util.printResult(solution(1, 1, 11), 0);
    }

    public static int solution(int A, int B, int K) {
        return B / K - A / K + (A % K == 0 ? 1 : 0);
    }
}
