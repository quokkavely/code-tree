import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int loc = 0;
        
        Map<Integer, Character> map = new HashMap<>();
        
        for(int i = 0 ;  i < n ; i ++) {
            int distance = sc.nextInt();
            char direction = sc.next().charAt(0);

            if(direction == 'R') {
                for(int j = loc; j < loc + distance ; j++) {
                    map.put(j, 'B');
                }
                loc += distance;

            } else {
                for(int j = loc; j > loc - distance ; j--) {
                    map.put(j-1, 'W');
                }
                loc -= distance;
            }
        }

        int blackCnt = 0;
        int whiteCnt = 0;
        for(char value : map.values()) {
            if(value == 'B') blackCnt++;
            else if(value == 'W') whiteCnt++;
        }

        System.out.print(whiteCnt+ " " + blackCnt); 
    }
}