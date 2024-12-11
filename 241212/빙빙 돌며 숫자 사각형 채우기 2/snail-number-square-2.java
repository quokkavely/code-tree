import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 현재 방향
        int curDir = 0;
        // 남 동 북 서
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        int[][]arr = new int[n][m];
        
        int x =0; 
        int y =0;
        
        arr[x][y] = 1;

        for(int i = 1; i < n*m ; i++) {
            int nx = x + dx[curDir];
            int ny = y + dy[curDir];
            
            if(permitRange(nx,ny,n,m) && arr[nx][ny] == 0) {
                x = x + dx[curDir];
                y = y + dy[curDir];
                arr[x][y] = i+1;
            
            } else {
                curDir = (curDir +1 ) % 4;
                x = x + dx[curDir];
                y = y + dy[curDir];
                arr[x][y] = i+1;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static boolean permitRange (int x, int y, int n , int m){
        return x >=0 && x < n && y >=0 && y < m ;
    }
}