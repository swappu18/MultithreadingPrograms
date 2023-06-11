package Way2Runnable;

public class GreetingDemo {
    public static void main(String[] args) {
        Runnable morningGreeting=()-> System.out.println("good morning");
        Thread task1=new Thread(morningGreeting,"morning");

        Runnable afternoonGreeting=()-> System.out.println("good afternoon");
        Thread task2=new Thread(afternoonGreeting,"afternoon");


        Runnable eveningGreeting=()-> System.out.println("good evening");
        Thread task3=new Thread(eveningGreeting,"evening");

        task1.start();
        task2.start();
        task3.start();
    }
}
