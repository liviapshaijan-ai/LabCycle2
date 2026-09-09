import java.util.Scanner;

class STudent {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class GETTER_AND_SETTER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        STudent s = new STudent();

        s.setName(name);
        s.setAge(age);

        System.out.println("Student Name : " + s.getName());
        System.out.println("Age : " + s.getAge());
    }
}