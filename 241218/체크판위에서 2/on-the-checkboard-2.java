import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] arr = new char[r][c];

        for(int i = 0; i < r ; i ++) {
            for(int j = 0 ; j < c ; j ++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        //이동은 점프. 다른색. 우측아래
        //시작. 도착 지 포함 총 4곳만 도달 가능
        int answer = 0;
       for (int i2 = 1; i2 < r; i2++) { // 1
            for (int j2 = 1; j2 < c; j2++) {
                if (arr[0][0] != arr[i2][j2]) { 

                    for (int i3 = i2 + 1; i3 < r -1; i3++) { // 2
                        for (int j3 = j2 + 1; j3 < c -1; j3++) {
                            if (arr[i2][j2] != arr[i3][j3]) { 

                                if (arr[i3][j3] != arr[r - 1][c - 1]) {
                                    answer++;
                                
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}