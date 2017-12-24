package f_sorting;

import utils.Util;

import java.util.Arrays;
import java.util.function.ToIntFunction;

public class NumberOfDiscIntersections {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{1,5,2,1,4,0}), 11);
    }

    public static int solution(int[] A) {
        int intersects = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                long right = j - A[j];
                long left = i + A[i];
                if (right <= left) {
                    intersects++;
                    if (intersects > 10000000) {
                        return -1;
                    }
                }
            }
        }
        return intersects;
        // 100% / 100%
        // https://stackoverflow.com/questions/14042447/counting-disk-intersections-using-treeset
    }

}