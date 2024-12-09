import java.util.*;

public class Main {
    static class Move {
        int t;
        char d;
        Move(int t, char d) {
            this.t = t;
            this.d = d;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Move[] A = new Move[n];
        Move[] B = new Move[m];

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            A[i] = new Move(t, d);
        }

        for (int i = 0; i < m; i++) {
            int t = sc.nextInt();
            char d = sc.next().charAt(0);
            B[i] = new Move(t, d);
        }

        int aIndex = 0, bIndex = 0;
        int aTimeLeft = A.length > 0 ? A[aIndex].t : 0;
        int bTimeLeft = B.length > 0 ? B[bIndex].t : 0;

        int aPos = 0;
        int bPos = 0;

        int prevAPos = aPos;
        int prevBPos = bPos;

        int cnt = 0;
        int currentTime = 0;

        while (aIndex < n || bIndex < m) {
            currentTime++;
            // 로봇 A 이동
            if (aIndex < n && aTimeLeft > 0) {
                if (A[aIndex].d == 'R') aPos++;
                else aPos--;
                aTimeLeft--;
                if (aTimeLeft == 0) {
                    aIndex++;
                    if (aIndex < n) {
                        aTimeLeft = A[aIndex].t;
                    }
                }
            }

            // 로봇 B 이동
            if (bIndex < m && bTimeLeft > 0) {
                if (B[bIndex].d == 'R') bPos++;
                else bPos--;
                bTimeLeft--;
                if (bTimeLeft == 0) {
                    bIndex++;
                    if (bIndex < m) {
                        bTimeLeft = B[bIndex].t;
                    }
                }
            }

            if (aPos == bPos && prevAPos != prevBPos) {
                cnt++;
            }

            prevAPos = aPos;
            prevBPos = bPos;
        }

        System.out.println(cnt);
    }
}
