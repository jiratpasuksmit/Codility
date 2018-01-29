package _a;

import utils.Util;

public class LCM {
    public static void main(String[] args) {
        Util.printResult(lcm(2,3), 6);
    }

    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}
