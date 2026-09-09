import java.util.Scanner;

class student {
    String name;
    int age;

    student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class THISEXAMPLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        student s = new student(name, age);
        s.display();
    }
}