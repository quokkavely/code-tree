import java.util.*;

class NumberArr implements Comparable<NumberArr> {
    int idx;
    int number;
    int newIdx;

    public NumberArr(int idx, int number) {
        this.idx = idx;
        this.number = number;
    }

    @Override
    public int compareTo(NumberArr n) {
        if (this.number == n.number) {
            return this.idx - n.idx;
        }

        return this.number - n.number;
    }
}


public class Main {
    public static void main(String[] args) {
    // 정렬 전의 순서로 정렬 후의 idx를 출력해야함

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        NumberArr[] arr = new NumberArr[n];
        
        for(int i = 0 ; i < n ; i ++) {
            arr[i] = new NumberArr(i+1, sc.nextInt());
        }
        
        // number 순으로 정렬
        Arrays.sort(arr);

        for(int i = 0 ; i < n ; i++) {
            arr[i].newIdx = i + 1; //정렬 후의 idx 저장
        }

        //원래 idx 순서로 다시 정렬
        Arrays.sort(arr, new Comparator<NumberArr>() {
            @Override
            public int compare (NumberArr a1, NumberArr a2) {
                return a1.idx - a2.idx;
            }
        });

        for(int i = 0 ; i < n ; i ++) {
            System.out.print(arr[i].newIdx+ " ");
        }

    }
}