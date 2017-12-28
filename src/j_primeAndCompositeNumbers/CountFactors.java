package j_primeAndCompositeNumbers;


import utils.Util;

public class CountFactors {
    public static void main(String[] args) {
        Util.printResult(solution(24), 8);
        Util.printResult(solution(1), 1);
        Util.printResult(solution(2), 2);
        Util.printResult(solution(3), 2);
    }

    public static int solution(int N) {
        if (N == 1) {
            return 1;
        }

        int count = 2;
        int i;
        for (i = 2; i * i < N; i++) {
            if (N % i == 0) {
                count += 2;
            }
        }
        if (Math.pow(i,2) == N) {
            count += 1;
        }
        return count;
    }
}