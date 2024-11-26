import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        int max = whoMax(arr[0], arr, n);
        
        System.out.print(max);
    }

    private static int whoMax(int a, int[] arr, int n) {
        //a 가 최대값 , n은 idx
        
        if (n == 0) {
            return a;
        }

        if (a >= arr[n-1]) {
            return whoMax(a, arr, n-1);
        } else {
            return whoMax(arr[n-1], arr, n-1);
        }

    }
}