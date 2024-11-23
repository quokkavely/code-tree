import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int[] arr = new int[]{a, b};
        solution(arr);

        System.out.print(arr[0] + " " + arr[1]);
    }
    
    private static void solution(int[] numbers) {
        int a = numbers[0];
        int b = numbers[1];

        if (a > b) {
            numbers[0] = a *2;
            numbers[1] = b + 10; 
        } else {
            numbers[0] = a +10;
            numbers[1] = b * 2;
        }
    }
}