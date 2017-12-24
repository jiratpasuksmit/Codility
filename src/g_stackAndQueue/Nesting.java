package g_stackAndQueue;

import utils.Util;

import java.util.Arrays;
import java.util.Stack;

public class Nesting {
    public static void main(String[] args) {
        Util.printResult(solution(new int[]{8,8,5,7,9,8,7,4,8}), 7);

    }

    public static int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < H.length; i++) {
            if (stack.size() > 0) {
                if (stack.peek() == H[i]) {
                    continue;
                } else if (stack.peek() < H[i]) {
                    stack.push(H[i]);
                    count++;
                } else {
                    while (stack.size() > 0 &&stack.peek() > H[i]) {
                        stack.pop();
                    }
                    if (stack.size() > 0 && stack.peek() == H[i]) {
                        continue;
                    } else {
                        stack.push(H[i]);
                        count++;
                    }
                }
            } else {
                stack.push(H[i]);
                count++;
            }
        }
        return count;
    }
}