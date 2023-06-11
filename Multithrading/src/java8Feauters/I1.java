package java8Feauters;

public interface I1 {
    int add(int num1,int num2);

    public static void main(String[] args) {
        //Anonymous way
        I1 i1=new I1()
        {
            @Override
            public int add(int num1, int num2) {
                return num1+num2;
            };

        };
        System.out.println(i1.add(20,20));

        // Lambda Expression
        I1 i=(num1,num2)-> num1+num2;
        System.out.println("Lambda"+i.add(20,30));
    }

}
