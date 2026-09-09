import java.util.Scanner;

class Students {
    String name;
    int age;

    Students() {
        System.out.println("Default Constructor");
    }

    Students(String name, int age) {
        this();
        this.name = name;
        this.age = age;

        System.out.println("Parameterized Constructor");
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class THIS_COSTRUCTOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        Students s = new Students(name, age);
        s.display();
    }
}