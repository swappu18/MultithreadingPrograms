package java8Feauters;

public class RunnableTest {
    public static void main(String[] args) {
        // 1-Traditional way
        Runnable runImpl=new RunImpl();
        runImpl.run();

        //2-anonymous class way
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("Anon is Running");
            }
        };
        //3-Lambda
        Runnable lambda=()-> System.out.println("Lambda is running");
        lambda.run();
    }
}
class RunImpl implements Runnable
{
    @Override
    public void run() {
        System.out.println("RunImpl is running");
    }
}

