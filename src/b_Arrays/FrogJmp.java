package b_Arrays;

import utils.Util;

public class FrogJmp {
    public static void main(String[] args) {
        Util.printResult(solution(10, 85, 30), 3);
    }

    public static int solution(int X, int Y, int D) {
        return (int) Math.ceil((double)(Y-X) / D);
    }
}
