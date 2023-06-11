package java8Feauters;


@FunctionalInterface

public interface StringProcessor {
    public String StringProcessor(String str);

    public static void main(String[] args) {
        StringProcessor upperCase = (str) ->  str.toUpperCase();
        System.out.println("Convert uppercase: "+ upperCase.StringProcessor("welcome lambda"));

        StringProcessor removeSpaces = (str)->str.trim();
        System.out.println(removeSpaces.StringProcessor("      lambda is making life easy       "));
    }
}

