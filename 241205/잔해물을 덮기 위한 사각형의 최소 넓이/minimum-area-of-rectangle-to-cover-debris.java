import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //첫번째 직사각형
        int ax1 = sc.nextInt();
        int ay1 = sc.nextInt();
        int ax2 = sc.nextInt();
        int ay2 = sc.nextInt();
        
        //두번째 직사각형
        int bx1 = sc.nextInt();
        int by1 = sc.nextInt();
        int bx2 = sc.nextInt();
        int by2 = sc.nextInt();

        //겹치는 부분
        int overlapX1 = Math.max(ax1, bx1); 
        int overlapY1 = Math.max(ay1, by1); 
        int overlapX2 = Math.min(ax2, bx2); 
        int overlapY2 = Math.min(ay2, by2); 

        int answer = remainArea(ax1, ax2, overlapX1, overlapX2, ay1, ay2, overlapY1, overlapY2);
        System.out.println(answer);
    }

    private static int remainArea (int ax1, int ax2, int overlapX1, int overlapX2, int ay1, int ay2, int overlapY1, int overlapY2) {
        if (ax2 - ax1 <= overlapX2 - overlapX1 && ay2 - ay1 <= overlapY2 - overlapY1) {
            return 0; 
        } 
        //가로만 덮었을 때
        else if(ax2 - ax1 <= overlapX2 - overlapX1) {
            return (ax2 - ax1) * (ay2 - overlapY2);
        } 
        //세로만 덮었을때
        else if(ay2 - ay1 <= overlapY2 - overlapY1) {
            return (ax2 - overlapX2) * (ay2 - ay1);
        }
        else {
            return (ax2 - ax1) * (ay2 - ay1);
        }
    }
}