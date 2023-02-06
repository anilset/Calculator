package kata.calc.review1;
//Должен быть реализован метод public static String calc(String input)

public class Calc {

    static byte a;
    static byte b;
    static String operator;
    static int result;


    public static String calc(String input) throws NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NumberException {
        try {
            String[] inputs = input.split(" ");
            if (inputs.length > 3) {
                throw new ArrayIndexOutOfBoundsException();
            }
            a = Byte.parseByte(inputs[0]);
            b = Byte.parseByte(inputs[2]);
            operator = inputs[1];
            if ((a < 1 || a > 10) || (b < 1 || b > 10)) {
                throw new NumberException();
            }
            switch (operator) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    //result += Math.round(a * 100.0 / b/ 100.0);
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } catch(NullPointerException | ArrayIndexOutOfBoundsException | IllegalArgumentException |
                NumberException exception) {
            NumberException.printDescription();
        }
        return Integer.toString(result);
    }
}


