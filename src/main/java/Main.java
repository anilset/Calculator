import java.util.Scanner;
import kata.calc.model.*;
import kata.calc.service.Calculation;

/*Требования:
Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотри пример)! Решения, в которых каждое число и арифмитеческая операция передаются с новой строки считаются неверными.
Калькулятор умеет работать только с арабскими числами (1,2,3,4,5...).
Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
Калькулятор умеет работать только с целыми числами.
При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выбрасывает исключение и завершает свою работу.
Результатом операции деления является целое число, остаток отбрасывается.
Результатом работы калькулятора могут быть отрицательные числа и ноль.
Input:
1 + 2
Output:
3

Input:
1
Output:
throws Exception //т.к. строка не является математической операцией

Input:
1 + 2 + 3
Output:
throws Exception //т.к. формат математической операции не удовлетворяет заданию
*/
public class Main {
    public static void main(String[] args) throws NumberException, NullPointerException, ArrayIndexOutOfBoundsException {

        Scanner scanner = new Scanner(System.in);
        Input input = new Input(scanner.nextLine());
        Calculation calculation = new Calculation(input);
            System.out.println(calculation.getResult());
    }
}