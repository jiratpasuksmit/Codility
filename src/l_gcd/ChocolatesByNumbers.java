package l_gcd;

import utils.Util;

public class ChocolatesByNumbers {
    public static void main(String[] args) {
        Util.printResult(solution(9), 2);
        Util.printResult(solution(529), 4);
        Util.printResult(solution(1041), 5);
    }


    public static int solution(int N) {
        char[] s = Integer.toBinaryString(N).toCharArray();
        int longest = 0;
        int current = 0;

        for (int i = 0; i < s.length; i++) {
            if (s[i] == '1') {
                longest = current > longest ? current : longest;
                current = 0;
            } else if (s[i] == '0') {
                current++;
            }
        }
        return longest;
    }
}
