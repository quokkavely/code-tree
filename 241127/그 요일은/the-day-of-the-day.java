import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();

        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String day = sc.next();

        int sub = checkDay(m1, d1, m2, d2);

        int answer = checkDayNumber(sub, day);

        System.out.println(answer);

    }
    
    private static int checkDayNumber(int d, String day) {
        int number = 0;

        String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        // d1 이 월요일
        // d2 의 요일은 나머지로 계산
        String dayOfD2 = week[d % 7]; 

        if ( d / 7 >= 1) {
            number = (d / 7) + 1 ; 
        } else if (day.equals("Mon") || day.equals(dayOfD2)){
            number = 1;
        } 

        return number;
    }

    private static int checkDay(int m1, int d1, int m2, int d2) {
        int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        //4월 17일 6월 30일  그럼 이 사이에 있는 일 수 계산

        int total = 0;

        if (m1 == m2) {
            //일수만 빼면 됨
            total = d2 - d1;
        } else if (m2 > m1) {
            for(int i = m1 - 1 ; i < m2 - 1 ; i++) {
                total += days[i];
            }

            total = total - d1 + d2;
        }

        return total;
    }

}