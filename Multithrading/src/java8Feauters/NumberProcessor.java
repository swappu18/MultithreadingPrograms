package java8Feauters;
@FunctionalInterface
public interface NumberProcessor {
    int process(int number);

    public static void main(String[] args) {
        NumberProcessor demo=new Demo();
        NumberProcessor square=(number)->number*number;
        System.out.println(demo.process(100));
        System.out.println(square.process(100));
    }
}
