import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 구간 개수
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for(int i = 0 ; i < n ; i ++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }


        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = arr[i][0]; j <= arr[i][1]; j++) {
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        int count = 0; // 몇번 등장?

        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue() >= count) {
                count = entry.getValue();               
            }
        }

        System.out.println(count);

    }
}