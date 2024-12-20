import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //첫번째 마지막 제외, 한개만 건너뜀
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i ++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        

        int min  = Integer.MAX_VALUE;
        for(int i = 1; i < n -1 ; i++) { 
            //i를 제외하고 거리 계산
            int x = arr[0][0];
            int y = arr[0][1];
            int distance = 0;
            
            for(int j = 1; j < n ; j ++) { 
                if( i == j ) continue;

                int nx = arr[j][0];
                int ny = arr[j][1];
                distance += Math.abs(nx-x) + Math.abs(ny - y);

                x = nx;
                y = ny;
            }

            distance += Math.abs(arr[n-1][0]-x) + Math.abs(arr[n-1][1] - y);
            min = Math.min(distance, min);
        }

        System.out.println(min);
    }
}