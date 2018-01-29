package _a;

public class CountDivisors {
    public static void main(String[]args) {
//        System.out.println(solution(10));
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("01:05:45AM"));
        System.out.println(timeConversion("12:05:45PM"));
        System.out.println(timeConversion("12:05:45AM"));
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



    static String timeConversion(String s) {
        String[] sss = s.split(":");
        String ssss = s.substring(8, s.length());
        String hh = sss[0];
        String mm = sss[1];
        String ss = sss[2].replace(ssss, "");
        if ((ssss.toUpperCase().equals("PM") && !hh.equals("12")) || (ssss.toUpperCase().equals("AM") && hh.equals("12"))) {
            hh = "" + (Integer.parseInt(hh) + 12) % 24;
        }

        if (hh.length() == 1) {
            hh = "0" + hh;
        }
        return hh+":"+mm+":"+ss;
    }
}
