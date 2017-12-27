package _a;

public class Prime {
    public static void main(String[]args) {
        System.out.println(solution(10));
    }

    public static boolean solution(int N) {
        int i = 2; // 1 is not prime and also not a composite number
        while (i * i <= N) {
            if (N % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
