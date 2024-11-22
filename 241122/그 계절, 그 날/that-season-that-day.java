import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(isValidDate(y, m, d)) {
            System.out.println(seasonSelect(m));
        } else {
            System.out.println(-1);
        }

    }

    private static boolean isValidDate (int y, int m, int d) {
        
        //2월 29일 제거
        if (y % 4 != 0) {
            if(m == 2 && d >= 29) {return false; }
        } else {
            if (d > 29) return false;
        }

        if((m == 4 || m == 6 || m == 9 || m == 11) && d > 30) {
            return false;
        } else if (d > 31) {
            return false;
        }

        return true;
    }

    private static String seasonSelect (int m) {
        String answer = "";

        if (3 <= m && m <= 5) {
            answer = "Spring";
        } else if (6 <= m && m <= 8) {
            answer = "Summer";
        } else if (9 <= m && m <= 11) {
            answer = "Fall";
        } else {
            answer = "Winter";
        }

        return answer;
    }
}