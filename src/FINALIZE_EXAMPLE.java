class Demo2 {
    Demo2() {
        System.out.println("Object Created");
    }

    protected void finalize() {
        System.out.println("finalize() method called");
    }
}

public class FINALIZE_EXAMPLE {
    public static void main(String[] args) {
        Demo2 obj = new Demo2();

        obj = null;

        System.gc();
    }
}