package beforeTest;

import utils.Util;

public class PassingCars {
    public static void main(String[] args) {
        Util.printResult(solution(new int[] {0,1,0,1,1}), 5);
        Util.printResult(solution(new int[] {1,0}), 0);
        Util.printResult(solution(new int[] {1,1}), 0);
    }

    public static int solution(int[] A) {
        int total = 0;
        int z = 0;
        int zCount = A[0] == 0 ? 1 : 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != z) {
                total+= zCount;
            } else {
                zCount++;
            }

            if (total > 1000000000) {
                return -1;
            }
        }
        return total;
    }
}
