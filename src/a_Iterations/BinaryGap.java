package a_Iterations;

public class BinaryGap {
    public static void main(String[]args) {
        System.out.println(solution(74901729));
    }

    public static int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int maxCount = 0, count = 0;
        for (char c : binary.toCharArray()) {
            if (c == '1') {
                maxCount = Math.max(maxCount, count);
                count = 0;
            } else {
                count++;
            }

        }

        return maxCount;
    }
}
