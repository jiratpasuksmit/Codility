package g_stackAndQueue;

import utils.Util;

import java.util.Arrays;
import java.util.Stack;

public class Fish {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{4, 3, 2, 1, 5}, new int[]{0, 1, 0, 0, 0}), 2);

    }

    public static int solution(int[] A, int[] B) {
        int survivalCount = 0;
        Stack<Integer> downStreamFish = new Stack<>();
        for (int i = 0; i < A.length; i++) {
            if (B[i] == 1) { // if this is downStream
                downStreamFish.push(A[i]);
            } else { // upStream
                while (downStreamFish.size() > 0) {
                    if (A[i] > downStreamFish.peek()) { // fight with downstream stack
                        // if win, remove downstream fish
                        downStreamFish.pop();
                    } else {
                        // if lose, stop.
                        break;
                    }
                }

                if (downStreamFish.size() == 0) { // win all downstream
                    survivalCount++;
                }
            }
        }

        survivalCount += downStreamFish.size();
        return survivalCount;
    }

}