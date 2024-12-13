import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int curdir = 0;
        int[] dx ={0, 1, -0, -1};
        int[] dy ={1, 0, -1, -0};

        char[][] arr = new char[n][m];
        int x = 0;
        int y = 0;
        arr[x][y] = 'A';
        
        int alpaIdx = 66;

        for(int i = 1; i < n*m ; i ++) {
            int nx = x + dx[curdir];
            int ny = y + dy[curdir];
            //0이 아니거나, 범위 내라면
            if(isAvailable(nx, ny, n, m) && arr[nx][ny] == 0) {
                x = x+ dx[curdir];
                y = y+ dy[curdir];
                arr[x][y] = (char)(alpaIdx);

            } else {
                curdir = (curdir + 1) % 4;
                x = x+ dx[curdir];
                y = y+ dy[curdir];
                arr[x][y] = (char)(alpaIdx);
            }

            if(alpaIdx < 90) alpaIdx++;
            else alpaIdx = 65; 
        
        }

        for(int i = 0; i < n ; i++) {
            for(int j = 0; j <m ; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }

    private static boolean isAvailable(int x, int y, int n, int m) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }
}