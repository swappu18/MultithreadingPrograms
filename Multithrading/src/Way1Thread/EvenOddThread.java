package Way1Thread;

public class EvenOddThread {
    public static void main(String[] args) {
        EvenThread even=new EvenThread ();
        even.setName("even");
        even.start();

        OddThread odd=new OddThread();
        odd.setName();
        odd.start();

    }
}
