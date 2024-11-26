import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        makeStars(n);

    }

    private static void makeStars(int n) {
        //a 는 n , b 는 idx
        if(n == 0) return;
        // String star = "* ";
        
        // System.out.println(star.repeat(n));
        printing(n);
        
        makeStars(n-1);

       // System.out.println(star.repeat(n));

       printing(n);
    }

    private static void printing(int n) {

        for(int i = 0 ; i < n ; i ++) {
            System.out.print("* ");
        }

        System.out.println();
    } 
}