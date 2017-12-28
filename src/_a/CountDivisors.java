package _a;

public class CountDivisors {
    public static void main(String[]args) {
        System.out.println(solution(10));
    }

    public static int solution(int N) {
        int i = 1, result = 0;
        while (i * i < N) {
            if (N % i == 0) {
                result += 2;
            }
            i++;
        }
        if (i * i == N) {
            result += 1;
        }
        return result;
    }
}
