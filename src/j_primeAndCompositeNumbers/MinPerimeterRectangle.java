package j_primeAndCompositeNumbers;


import utils.Util;

public class MinPerimeterRectangle {
    public static void main(String[] args) {
        Util.printResult(solution(30), 22);
    }

    public static int solution(int N) {
        int maxPerimeter = Integer.MAX_VALUE;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                maxPerimeter = Math.min(maxPerimeter, 2 * ((N / i) + i));
            }
        }
        return maxPerimeter;
    }
}