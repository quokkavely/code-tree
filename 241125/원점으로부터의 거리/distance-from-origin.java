import java.util.*;

class Location implements Comparable<Location> {
    int number; //번호
    int d; //원점으로부터 거리
    
    public Location(int number, int d ) {
        this.number = number;
        this.d = d;
    }

    @Override
    public int compareTo(Location location) {
        if (this.d == location.d ) {
            return this.number - location.number;
        }

        return this.d - location.d;
    }

}

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
    
        Scanner sc = new Scanner(System.in);
        //점의 개수
        int n = sc.nextInt();

        Location[] arr = new Location[n];

        //원점부터 거리 계산
        for(int i = 0; i < n ; i ++ ) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            a = a > 0 ? a : -a;
            b = b > 0 ? b : -b;
            
            arr[i]  = new Location(i+1, a+b);

        }

        Arrays.sort(arr);

        for(int i = 0; i < n ; i ++ ) {
            System.out.println(arr[i].number);
        }
    }
}