import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
 
        int[] dx =  {0, -1, 0, 1};  
        int[] dy =  {-1, 0, 1, 0};
        int curDir = 0;

        int x = n-1;
        int y = n-1;
        arr[x][y] = n*n;
        
        for(int i = n*n -1; i >= 1; i --) {
            int nx = x + dx[curDir];
            int ny = y + dy[curDir];

            if(isPermit(nx, ny, n) && arr[nx][ny] == 0) {
                x  = x + dx[curDir];
                y  = y + dy[curDir];
                arr[x][y] = i; 

            } else {
                curDir = (curDir + 1) % 4;
                x  = x + dx[curDir];
                y  = y + dy[curDir];
                arr[x][y] = i;
            }
        }


        for(int i = 0; i < n; i ++) {
            for(int j = 0; j < n; j ++) {
                System.out.print(arr[i][j]+ " ");
            }

            System.out.println();
        } 
    }
    
    private static boolean isPermit(int x, int y ,int n) {
        return x >= 0 && x < n && y >= 0 && y < n ;
    }
}