import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수열 개수
        int t = sc.nextInt(); // 정수 t
        
        int cnt = 0;
        int max = 0;        
        int[] arr = new int[n];
        for(int i = 0; i < n; i ++) {
           arr[i] = sc.nextInt();
           if(arr[i]> t ) {
            cnt++;
            max = Math.max(cnt, max);
           } else cnt = 0; 
        }

        System.out.print(max);
    }
}