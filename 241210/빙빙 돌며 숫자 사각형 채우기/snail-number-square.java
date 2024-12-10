import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        
        int[][] arr = new int[n][m];
        
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;
        
        int num = 1;
        int total = n * m;
        
        while (num <= total) {
            for (int i = left; i <= right && num <= total; i++) {
                arr[top][i] = num++;
            }
            top++;
            
            for (int i = top; i <= bottom && num <= total; i++) {
                arr[i][right] = num++;
            }
            right--;
            
            for (int i = right; i >= left && num <= total; i--) {
                arr[bottom][i] = num++;
            }
            bottom--;
            
            for (int i = bottom; i >= top && num <= total; i--) {
                arr[i][left] = num++;
            }
            left++;
        }

        for(int i = 0; i < n; i++) {
            for(int j =0; j < m; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        } 
    }
}