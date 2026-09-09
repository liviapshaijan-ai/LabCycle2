class Area {

    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }
}

public class AREA_OVERLOADING {
    public static void main(String[] args) {
        Area a = new Area();

        a.area(6);
        a.area(8, 4);
    }
}