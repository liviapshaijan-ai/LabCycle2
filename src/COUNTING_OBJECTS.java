class StUdent {
    static int count = 0;

    StUdent() {
        count++;
    }
}

public class COUNTING_OBJECTS {
    public static void main(String[] args) {

        StUdent s1 = new StUdent();
        StUdent s2 = new StUdent();
        StUdent s3 = new StUdent();

        System.out.println("Objects Created : " + StUdent.count);
    }
}