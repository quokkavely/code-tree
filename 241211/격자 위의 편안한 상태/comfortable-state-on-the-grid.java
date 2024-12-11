import java.util. *;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //편안한 상태 : 직전색칠칸의 상하좌우에 색칠되어있는 칸이 3개인 경우
        int r = 1;
        int c= 1;
    
        int[][] arr = new int[n+1][n+1];

        for(int i = 0 ; i < m ; i ++) {
            r = sc.nextInt();
            c = sc.nextInt();
            
            //색칠
            arr[r][c] = 1;

            if(isComportable(r, c, arr)) System.out.println(1);
            else System.out.println(0);
        }

    }

    private static boolean isComportable(int r, int c, int[][] arr) {
        int cnt = 0;
        //좌
        if(r-1 > 0 && arr[r-1][c] == 1) cnt++;
        //하
        if(c-1 > 0 && arr[r][c-1] == 1) cnt++;
        //우
        if(r+1 <arr.length && arr[r+1][c] == 1) cnt++;
        //상
        if(c+1 <arr.length&& arr[r][c+1] == 1) cnt++;

        return cnt==3;
    }
}