import java.util.*;


class Student implements Comparable<Student> {
    int tall; int weight; int number;

    public Student(int tall, int weight, int number) {
        this.tall = tall;
        this.weight = weight;
        this.number = number;
    }

    @Override
    public int compareTo(Student student) {
        return student.tall - this.tall;
    }
};

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        

        //학생 수
        int n = sc.nextInt();
        
        Student[] students = new Student[n];

        for(int i = 0 ; i < n ; i++) {           
            Student s = new Student(sc.nextInt(), sc.nextInt(), i+1);
            students[i] = s;
        }

        Arrays.sort(students);

        for(int i = 0; i < n ; i++) {
            System.out.println(students[i].tall+ " " + students[i].weight + " " + students[i].number);
        }


    }


}