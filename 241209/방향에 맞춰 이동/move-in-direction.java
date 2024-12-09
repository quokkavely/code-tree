import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int dx = 0;
        int dy = 0;

        for(int i = 0; i < n; i ++) {
            char dir = sc.next().charAt(0);
            int trans = sc.nextInt();

            if(dir == 'N') dy += trans;
            else if(dir == 'E') dx += trans;
            else if (dir == 'S') dy-= trans;
            else dx -= trans;

        }

        System.out.print(dx + " " + dy);
    }
}