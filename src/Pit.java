
class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1, 3, -2, 0, 1, 0, -3, 2, 3}));
    }

    static int maxDepth = Integer.MIN_VALUE;
    static boolean decreasing = false;
    static int P = -1, Q = -1, R = -1;

    static int solution(int[] A) {
        for (int i = 0; i < A.length; i++) {
            int iPrevious = i - 1;
            int iNext = i + 1;
            if (iPrevious < 0) {
                continue;
            }

            if (iNext < A.length && A[i] < A[iNext] && P != -1 && Q != -1) { // increasing, posible end of pit
                R = iNext;
                int currentDepth = Math.min(A[P] - A[Q], A[R] - A[Q]);
                maxDepth = Math.max(maxDepth, currentDepth);
            }

            if (iNext < A.length && A[iPrevious] > A[i] && A[i] < A[iNext]) { // lowest pit
                Q = i;
            }

            if (iNext < A.length && A[iPrevious] < A[i] && A[i] > A[iNext]) { // the edge
                decreasing = false;
                P = -1;
                Q = -1;
                R = -1;
            }

            if (A[iPrevious] > A[i]) { // decreasing
                if (!decreasing) { // start of decreasing
                    decreasing = true;
                    P = iPrevious;
                }
            }
        }
        return maxDepth;
    }
}