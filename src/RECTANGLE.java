class Rectangle {

    int length;
    int width;

    // Default constructor
    Rectangle() {
        length = 1;
        width = 1;
    }

    // Parameterized constructor
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    // Method to calculate area
    int area() {
        return length * width;
    }
}

public class RECTANGLE {
    public static void main(String[] args) {

        // Object using default constructor
        Rectangle r1 = new Rectangle();

        // Object using parameterized constructor
        Rectangle r2 = new Rectangle(8, 5);

        System.out.println("Rectangle 1 Area = " + r1.area());
        System.out.println("Rectangle 2 Area = " + r2.area());
    }
}