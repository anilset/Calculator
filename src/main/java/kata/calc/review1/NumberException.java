package kata.calc.review1;

public class NumberException extends Exception {

    public NumberException(){super();}

    public static void printDescription() {
        System.out.println("Принимаются только два целых числа от 1 до 10 (арабские). Числа должны быть отделены от знака пробелами.");
        System.out.println("Поддерживаемые операторы: +, -, /, *. Введите валидные данные");
    }
}
