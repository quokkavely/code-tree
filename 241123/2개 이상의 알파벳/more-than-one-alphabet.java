import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(str.length() <= 1) {
            System.out.print("No");
            return;
        }


        List<Character> list = new ArrayList<>();

        for(char c : str.toCharArray()) {
            if(!list.contains(c)) {
                list.add(c);
            } 
        }

        
        String result = list.size() >= 2 ? "Yes" : "No";

        System.out.print(result);
    }
}