import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        int before = 0;
        int cnt = 1;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == before) {
                cnt ++;
            }

            before = arr[i];
        }

        System.out.print(cnt);
    }
}