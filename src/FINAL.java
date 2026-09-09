import java.util.Scanner;

public class FINAL {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.print("Radius: ");
        double radius = sc.nextDouble();

        double area = PI * radius * radius;

        System.out.printf("Area = %.2f", area);
    }
}