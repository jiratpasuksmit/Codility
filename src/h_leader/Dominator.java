package h_leader;

import utils.Util;

public class Dominator {
    public static void main(String[] args) {
        Util.printResultIfMatchAny(solution(new int[]{3, 4, 3, 2, 3, -1, 3, 3}), new int[]{0,2,4,6,7}); // 0/2/4/6/7
        Util.printResultIfMatchAny(solution(new int[]{0, 1, 1, 0, 1, 0, 1, 1}), new int[]{1,2,4,6,7});
        Util.printResultIfMatchAny(solution(new int[]{0}), new int[]{0});
        Util.printResultIfMatchAny(solution(new int[]{}), new int[]{-1});
        Util.printResultIfMatchAny(solution(new int[]{1,2,3,4,5}), new int[]{-1});
        Util.printResultIfMatchAny(solution(new int[]{1,1,2,2}), new int[]{-1});

    }

    public static int solution(int[] A) {
        int size = 0;
        int temp = -1;
        for (int i = 0; i < A.length; i++) {
            if (size == 0) {
                temp = A[i];
                size++;
            } else {
                if (A[i] == temp) {
                    size++;
                } else {
                    size--;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == temp) {
                count++;
                if (count > A.length / 2) {
                    return i;
                }
            }
        }

        return -1;
    }
}
