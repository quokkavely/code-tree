import java.util.*;

class Student implements Comparable<Student> {    
    String name;
    int tall;
    double weight;

    public Student(String name, int tall, double weight) {
        this.name = name;
        this.tall = tall;
        this.weight = weight;
    }

    @Override
    public int compareTo(Student student){
        return this.name.compareTo(student.name);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Student[] students = new Student[5];
        for(int i =0; i < 5 ; i++ ) {
            String[] input = sc.nextLine().split(" ");
            String n = input[0];
            int t = Integer.parseInt(input[1]);
            double w = Double.parseDouble(input[2]);

            students[i] = new Student(n, t, w);
        }

        Arrays.sort(students);

        System.out.println("name");
        
        for(int i = 0; i < students.length ; i++) {
            System.out.println(students[i].name + " " + students[i].tall + " " + students[i].weight);
        }

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.tall - s1.tall;
            }
        });

        System.out.println();
        System.out.println("height");

           for(int i = 0; i < students.length ; i++) {
            System.out.println(students[i].name + " " + students[i].tall + " " + students[i].weight);
        }
    }
}