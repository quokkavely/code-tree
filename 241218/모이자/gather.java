import java.util.*;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i ++) {
            int sum = 0;
            for(int j = 0; j < n ; j ++) {
                int current = arr[j] * (j-i);
                if( current < 0) current *= -1; 
                sum += current;
            }
            min = Math.min(sum, min);
        }

        System.out.print(min);
    }
}