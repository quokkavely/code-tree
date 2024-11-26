import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        //최소공배수는  모든 수의 곱 / 모든 수의 최대공약수

        int l = call (arr, n-1);
        System.out.println(l);

    }

    //최대공약수
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcd (b , a % b);
    }

    //최소공배수
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    
    private static int call(int[] arr, int idx) {
        if(idx == 0){
            return arr[0];
        }
        
        return lcm(call(arr, idx - 1), arr[idx]);
    }
}