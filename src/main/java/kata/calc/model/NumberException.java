package kata.calc.model;

public class NumberException extends Exception {
    public static String description = "Принимаются только два целых числа от 1 до 10 (арабские)";

    public NumberException(){super();}

    public static String getDescription() {
        return description;
    }
}
