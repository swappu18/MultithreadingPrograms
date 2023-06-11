package Way1Thread;

public class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("anonymous is running");
    }
}
