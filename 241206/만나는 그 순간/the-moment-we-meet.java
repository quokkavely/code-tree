import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int nloc = 0;
        int mloc = 0;

        // key : 시간, value : 위치
        Map<Integer, Integer> nMap = new HashMap<>(); 
        Map<Integer, Integer> mMap = new HashMap<>();
        
        int before = 1;
        for(int i = 0; i < n ; i++) {
            char direction = sc.next().charAt(0);
            int next = sc.nextInt();
            int addBN = before + next;
            for(int j = before; j < addBN; j++) {
              if(direction == 'R') {
                    nloc++;
                    nMap.put(j , nloc);
                } else {
                    nloc--;
                    nMap.put(j, nloc);
                }
            }

            //시간 동기화
            before += next;
        }

        int mBefore = 1;
        for(int i = 0; i < m ; i++) {
            char direction = sc.next().charAt(0);
            int next = sc.nextInt();
            int addBN = mBefore + next;
            for(int j = mBefore; j < addBN; j++) {
                if(direction == 'R') {
                    mloc++;
                    mMap.put(j , mloc); 
                } else {
                    mloc--;
                    mMap.put(j, mloc);
                }
            }
            //시간 동기화
            mBefore += next;
        }

        int answer = -1;
        for(int i = 1; i < before ; i ++) {
            if(mMap.get(i).equals(nMap.get(i))) {
                answer = i;
                break;
            }
        }

        System.out.println(answer);
    }
}