import java.util.Scanner;

class StuDent {
    String name;
    int rollNo;

    StuDent(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

public class PASSING_OBJECT {

    static void display(StuDent s) {
        System.out.println("Student Name : " + s.name);
        System.out.println("Roll No : " + s.rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();

        StuDent s = new StuDent(name, rollNo);

        display(s);
    }
}