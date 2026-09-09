import java.util.Scanner;

public class CELSIUS_TO_FARENHEIT {

    static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Celsius: ");
        double celsius = sc.nextDouble();

        System.out.println("Fahrenheit = " + toFahrenheit(celsius));
    }
}