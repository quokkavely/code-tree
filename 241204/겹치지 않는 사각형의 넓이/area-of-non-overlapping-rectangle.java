import java.util.;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 직사각형 A
        int ax1 = sc.nextInt(), ay1 = sc.nextInt(), ax2 = sc.nextInt(), ay2 = sc.nextInt();
        // 직사각형 B
        int bx1 = sc.nextInt(), by1 = sc.nextInt(), bx2 = sc.nextInt(), by2 = sc.nextInt();
        // 직사각형 M
        int mx1 = sc.nextInt(), my1 = sc.nextInt(), mx2 = sc.nextInt(), my2 = sc.nextInt();

        int areaA = (ax2 - ax1) * (ay2 - ay1);
        int areaB = (bx2 - bx1) * (by2 - by1);

    
        int overlapA = getOverlapArea(ax1, ay1, ax2, ay2, mx1, my1, mx2, my2);

        int overlapB = getOverlapArea(bx1, by1, bx2, by2, mx1, my1, mx2, my2);

        int answer = (areaA - overlapA) + (areaB - overlapB);

        System.out.println(answer);
    }

    //겹치는 부분 넓이를 계산
    private static int getOverlapArea(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        int overlapX1 = Math.max(x1, x3);
        int overlapY1 = Math.max(y1, y3);
        int overlapX2 = Math.min(x2, x4);
        int overlapY2 = Math.min(y2, y4);

        if (overlapX1 < overlapX2 && overlapY1 < overlapY2) {
            return (overlapX2 - overlapX1) * (overlapY2 - overlapY1);
        } else {
            return 0; 
        }
    }
}