package _a;

import utils.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PlaneSeats {
    public static void main(String[] args) {
        Util.printResult(solution(1, "1D"), 3);
        Util.printResult(solution(1, "1G"), 3);
        Util.printResult(solution(2, "1A 2F 1C"), 4);
        Util.printResult(solution(1, "1D 1G"), 2);
        Util.printResult(solution(1, ""), 3);
    }

    public static int solution(int N, String S) {
        if (S.length() == 0) {
            return 3 * N;
        }
        HashMap<Integer, TreeSet<Integer>> seats = new HashMap<>();
        for (int i = 0; i < N; i++) {
            seats.put(i, new TreeSet<>());
        }

        for (String s : S.split(" ")) {
            int rowNum = s.charAt(0) - '0';
            TreeSet<Integer> rowList = seats.get(rowNum - 1);
            rowList.add(getSeatColumn(s.charAt(1)));
        }


        int count = 0;
        for (int i = 0; i < N; i++) {
            TreeSet<Integer> rowList = seats.get(i);
            boolean isThirdSeatOccupied = false;
            boolean left = true, middle = true, right = true;
            for (Integer integer : rowList) {
                switch (integer) {
                    case 0:
                    case 1:
                    case 2:
                        left = false;
                        break;
                    case 3:
                        isThirdSeatOccupied = true;
                        break;
                    case 4:
                    case 5:
                        middle = false;
                    case 6:
                        if (isThirdSeatOccupied) {
                            middle = false;
                        }
                        break;
                    case 7:
                    case 8:
                    case 9:
                        right = false;
                        break;
                }
            }

            count += (left ? 1 : 0) + (right ? 1 : 0) + (middle ? 1 : 0);
        }
        return count;
    }

    public static int getSeatColumn(char input) {
        char c = Character.toLowerCase(input);
        switch (c) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
                return c - 'a';
            case 'h':
                return getSeatColumn('g') + 1;
            case 'j':
                return getSeatColumn('g') + 2;
            case 'k':
                return getSeatColumn('g') + 3;
            default:
                throw new IllegalArgumentException("wrong input");
        }
    }
}
