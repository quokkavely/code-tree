import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for(int i = a ; i <= b; i++) {
            String s = i +"";
            if(i % 3 == 0 ||  (s.contains("3") || s.contains ("6")||s.contains("9"))) cnt++;
        }

        System.out.print(cnt);
    }
}