package Way1Thread;

public class Demo1 {
    public static void main(String[] args) {

        // traditional way
        Runnable worker=new Worker();
        worker.run();

        // anonymous way
        Runnable ref=new Runnable() {
            @Override
            public void run() {
                System.out.println("anonymous is running");
            }
        };

        // java 8 way lambda expression \
        Runnable runnable=()-> System.out.println("Lambda is running");
        runnable.run();
    }
}
