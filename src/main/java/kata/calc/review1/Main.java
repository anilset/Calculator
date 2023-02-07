package kata.calc.review1;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException, IllegalArgumentException,
            NullPointerException, NumException {
        Scanner sc = new Scanner(System.in);
        System.out.println(Calc.calc(sc.nextLine()));
    }
}
