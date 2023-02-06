package kata.calc.review1;
import java.util.Scanner;
import static kata.calc.review1.Calc.calc;


public class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NullPointerException, NumberException {
        Scanner sc = new Scanner(System.in);
        System.out.println(calc(sc.nextLine()));
    }
}
