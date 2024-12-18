import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //현재 a진수
        int a = sc.nextInt();
        
        //변경해야 할 b진수
        int b = sc.nextInt();

        // 주어진 숫자
        String n = sc.next();

        int num = 0;

        // a 진수 - > 십진수로 변환
        for(int i = 0 ; i < n.length(); i++) {
            num = num * a + (n.charAt(i)-'0');
        }

        // 십진수 -> b 진수로 변환
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % b);
            num = num / b ;
        }

        for(int i = list.size()-1 ; i >= 0 ; i--) {
            System.out.print(list.get(i));
        }
    }
}