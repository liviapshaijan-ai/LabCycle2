import java.util.Scanner;

class StudenT {
    String name;
    int mark;

    StudenT(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class RETURN_METHOD {

    static StudenT getStudent(String name, int mark) {
        return new StudenT(name, mark);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Mark: ");
        int mark = sc.nextInt();

        StudenT s = getStudent(name, mark);

        System.out.println("Student Name : " + s.name);
        System.out.println("Mark : " + s.mark);
    }
}