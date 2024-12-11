import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        // L - 왼쪽 90도, R - 오른쪽 90도, F -현재방향 한칸
        // 모든 이동은 1초

        Scanner sc= new Scanner(System.in);
        String str = sc.next();

        int dx = 0;
        int dy = 0;

        // 북 > 동 > 남 > 서
        char[] rDir = {'N', 'E', 'S', 'W'};
        //char[] lDir = {'N', 'W', 'S', 'E'};
    
        int idx = 0;
        int second = 0;
        
        //현재 방향 
        char curDir = rDir[idx];

        List<Integer> answer = new ArrayList<>();

        for(char c : str.toCharArray()) {
            if( c == 'L') {
                idx --;
                if( idx < 0 ) idx += 4;
                
                curDir = rDir[idx % 4];
            } else if( c == 'R') {
                idx ++;
                if( idx < 0 ) idx += 4;
                
                curDir = rDir[idx % 4];

            } else {
                 // F 라면 현재 방향으로 이동
                if(curDir == 'N') dy++;
                else if(curDir == 'W') dx--;
                else if(curDir == 'S') dy--;
                else if(curDir == 'E') dx++;
            }

            second ++;

            if(second > 0 && dx == 0 && dy == 0) answer.add(second);
        }

        if(answer.size() == 0 ) System.out.print(-1);
        else System.out.print(answer.get(0));
    }

}