package j_primeAndCompositeNumbers;


import utils.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Flags {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2}), 3);
        Util.printResult(solution(new int[]{1, 0, 1, 0, 1}), 1);
        Util.printResult(solution(new int[]{1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1}), 299);

        ArrayList<Integer> pattern = new ArrayList<>();
        Integer[] zeros = new Integer[300];
        Arrays.fill(zeros, 0);
        pattern.addAll(Arrays.asList(zeros));
        pattern.add((int) (Math.random() * 399999 + 1));
        int times = 300000;
        Util.printResult(solution(Util.getArrayInt(pattern, times)), times - 1);
    }

    public static int solution(int[] A) {
        ArrayList<Integer> array = new ArrayList<>();
        //loop through all data
        for (int i = 1; i < A.length - 1; i++) {
            if (A[i - 1] < A[i] && A[i + 1] < A[i]) {
                // keep all peak's index in array
                array.add(i);
            }
        }

        // if it is only peak, or theres no peak, return it right away (0/1)
        if (array.size() == 1 || array.size() == 0) {
            return array.size();
        }

        int flag = 1; // number of flag (also min distance between peaks)
        int result = 1; // number of flag as answer
        while (flag <= array.size()) { // find all possibility from 0 to peaks count
            boolean success = false;
            int used = 0;
            int mark = array.get(0);
            for (int i = 0; i < array.size(); i++) { // loop through peak count again
                if (array.get(i) >= mark) { // if this peak is far beyond last peak + lowest distance (flag) ?
                    used++;
                    mark = array.get(i) + flag; // move mark to this peak + loweest distance (flag)

                    if (used == flag) {
                        success = true;
                        break;
                    }
                }
            }

            if (success) {
                result = flag;
                flag++;
            } else {
                break;
            }
        }
        return result;
    }
}