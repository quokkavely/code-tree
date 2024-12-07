import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for(int i = a ; i <= b ; i++) {
            if(isPrime(i) &&(checkSum(i))) cnt ++;
        }

        System.out.print(cnt);

    }

    private static boolean isPrime(int n) {
        for(int i = 2; i*i <= n; i ++) {
            if(n % i == 0) return false;
        }
        return true;   
    }

    private static boolean checkSum(int n) {
        String s = n + "" ;
        int sum = 0;
        for(int i = 0 ; i < s.length(); i++) {
            sum += s.charAt(i);
        }

        if(sum % 2 == 0) return true;
        return false;
    }
}