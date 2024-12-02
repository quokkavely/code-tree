import java.util.*;
public class Main {

    private static final Scanner sc= new Scanner(System.in);
    private static int minV, maxV;
    
    public static void main(String[] args) {
        int n = sc.nextInt();
        int loc = 0;
        String direction = "";
        
        // n 총 개수
        while( n-- > 0) {
            
            // 이동거리
            int x = sc.nextInt() -1 ;
            direction = sc.next();
            
            //다음 위치
            int next = loc + (direction.equals("R")? x : -x);

            minV = Math.min(minV, next);
            maxV = Math.max(maxV, next);

            loc = next; 
        }
   
        if(direction.equals("R")) {
            System.out.print((maxV - loc) + " " +(loc - minV + 1));
        } else {
            System.out.print((maxV - loc + 1) + " " +(loc - minV));
        }
    }
}