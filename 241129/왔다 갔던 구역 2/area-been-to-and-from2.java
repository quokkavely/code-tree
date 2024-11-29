import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int loc = 0;
        
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n ; i ++) {
            // 0 ~ 2로 이동
            int trans = sc.nextInt();
            String direction = sc.next();
            
            if(direction.equals("L")) {
                trans = -1 * trans;
                for(int j = loc; j > loc + trans ; j --) {
                    //System.out.println("L:"+ (j-1));
                    map.put(j-1, map.getOrDefault(j-1, 0) + 1);
                }
            } else {
                for(int j = loc; j < loc + trans ; j ++) {
                    //System.out.println("R:" + j);
                    map.put(j, map.getOrDefault(j, 0) + 1);
                }
            }

            loc += trans;
        }

        int cnt = 0;
        for(Integer key : map.keySet()) {
            if(map.get(key) >= 2) cnt++;
        }

        System.out.print(cnt);
    }
}