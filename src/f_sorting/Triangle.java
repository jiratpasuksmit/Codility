package e_prefixSums;

import utils.Util;

import java.util.Arrays;

public class CountDiv {
    public static void main(String[] args) {
        Util.printResult(solution(11, 345, 17), 20);
        Util.printResult(solution(6, 11, 2), 3);
        Util.printResult(solution(6, 12, 2), 4);
        Util.printResult(solution(1, 5, 2), 2);
        Util.printResult(solution(1, 6, 2), 3);

        Util.printResult(solution(6, 11, 3), 2);
        Util.printResult(solution(6, 12, 3), 3);
        Util.printResult(solution(1, 5, 3), 1);
        Util.printResult(solution(1, 6, 3), 2);
    }

    public static int solution(int A, int B, int K) {
        return (B - A) / K + (A % K != 0 ? 1 : 0) + 1;


//        if(B < K) {
//            return 0;
//        }
//
//        int num1 = A / K;
//        if(A % K != 0) {
//            num1++;
//        }
//
//        int num2 = B / K;
//
//        return num2 - num1 + 1;
    }

}