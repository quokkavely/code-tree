import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int g = 0;
       if (n > m)  g = gcd(m, n);
       else g = gcd(m, n);

       System.out.print( m*n /g );
    }

    private static int gcd (int a, int b) {
        //a < b 일때

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }
}