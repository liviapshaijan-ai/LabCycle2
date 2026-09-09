class Demo {
    Demo() {
        System.out.println("Object Created");
    }

    protected void finalize() {
        System.out.println("Object Destroyed");
    }
}

public class GARBAGE_COLLECTION {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        d1 = null;
        d2 = null;
        d3 = null;

        System.gc();

        System.out.println("Garbage Collection Requested");
    }
}