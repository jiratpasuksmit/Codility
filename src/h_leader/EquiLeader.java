package h_leader;


import utils.Util;

public class EquiLeader {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{4, 3, 4, 4, 4, 2}), 2);
        Util.printResult(solution(new int[]{1, 0, 1, 0, 1, 0}), 0);
    }

    public static int solution(int[] A) {
        if (A.length == 1) {
            return 0;
        }

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
            }
        }

        int leader = -1;
        if (count > A.length / 2) {
            leader = temp;
        } else {
            return 0;
        }

        int ansCount = 0;
        int leftCount = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                leftCount++;
            }

            if (leftCount > ((i + 1) / 2) && count - leftCount > (A.length - i - 1) / 2) {
                ansCount++;
            }
        }
        return ansCount;
    }
}