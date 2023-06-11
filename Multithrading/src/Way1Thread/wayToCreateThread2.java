package Way1Thread;

public class wayToCreateThread2 {
    public static void main(String[] args) {
        //step1: create class of type runnable
        //1-traditional way
        //2-anonymous class
        //3-lambda expression
        //4-method reference
        Runnable runnable=new RunnableImpl();

        //step2:create thread class object and pass name and runnable type
        Thread thread=new Thread(runnable,"task");

        //step3:call the start method
        thread.start();
    }
}
class RunnableImpl implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + Thread.currentThread().getName());

        }
    }
}


