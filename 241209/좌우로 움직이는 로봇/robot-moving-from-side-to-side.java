import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //시간, 위치
        Map<Integer,Integer> nMap = new HashMap<>();
        Map<Integer,Integer> mMap = new HashMap<>();
        
        int nbefore = 1;
        int nloc = 0;
        for(int i = 0; i < n ; i ++) {
            int sec = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            for(int j = nbefore; j < sec + nbefore; j ++) {
                if(dir == 'R') nloc ++;
                else nloc--;
                
                nMap.put(j, nloc);
               // System.out.println( j + ", n위치" + nloc);
            }
            nbefore += sec;
        }

        int mbefore = 1;
        int mloc = 0;
        for(int i = 0; i < m ; i ++) {
            int sec = sc.nextInt();
            char dir = sc.next().charAt(0);
            
            for(int j = mbefore; j < sec + mbefore; j ++) {
                if(dir == 'R') mloc ++; 
                else mloc--;
                
                mMap.put(j, mloc);
               // System.out.println( j + ", m위치" + mloc);
            }
            mbefore += sec;
        }

        int cnt = 0;
        int leng = 0;
        if(nbefore >= mbefore) leng = nbefore;
        else leng = mbefore;

        for(int i = 1 ; i <= leng ; i ++) {
            if(nMap.getOrDefault(i, nloc) == mMap.getOrDefault(i, mloc)) {
                if(nMap.getOrDefault(i-1, nloc) != mMap.getOrDefault(i-1, mloc) && i-1 != 0) cnt ++;
            }
        }

        System.out.println(cnt);

    
    }
} 