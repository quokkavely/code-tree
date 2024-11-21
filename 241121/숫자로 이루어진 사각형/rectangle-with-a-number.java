import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printRect(n);

    }

    private static void printRect(int n) {
        int a = 1;
        for(int i = 0; i < n*n ; i ++ ) {

            if (a < 10) {
                System.out.print(a);
                a ++;

                if (a == 10) {
                    a = 1;
                }
            } 

            if ((i+1) % n == 0 ) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }
    }
}