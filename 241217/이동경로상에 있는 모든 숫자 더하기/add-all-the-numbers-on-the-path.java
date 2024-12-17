import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        String commands = sc.next(); 

        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j <n ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        //북 동 남 서
        int[][] directions = {
            {-1, 0}, 
            {0, 1},
            {1, 0},  
            {0, -1}  
        };
        int direction = 0; 
        int x = n / 2;
        int y = n / 2;

        int sum = arr[x][y];

        for (int i = 0; i < t; i++) {
            char command = commands.charAt(i);

            if (command == 'L') {
                direction = (direction + 3) % 4; 
            } else if (command == 'R') {
                direction = (direction + 1) % 4; 
            } else if (command == 'F') {
                int nx = x + directions[direction][0];
                int ny = y + directions[direction][1];

                
                if (nx >= 0 && nx < n && ny >= 0 && ny < n) {
                    x = nx;
                    y = ny;
                    sum += arr[x][y]; 
                }
            }
        }

        System.out.println(sum);
    }
}


