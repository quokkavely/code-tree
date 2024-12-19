import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(); 

        int max = 0; 


        for (int i = 0; i < a.length(); i++) {
            StringBuilder sb = new StringBuilder(a);


            if (sb.charAt(i) == '0') {
                sb.setCharAt(i, '1');
            } else {
                sb.setCharAt(i, '0');
            }


            int n = Integer.parseInt(sb.toString(), 2);


            max = Math.max(max, n);
        }


        System.out.println(max);
    }
}