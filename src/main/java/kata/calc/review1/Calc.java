package kata.calc.review1;
//Должен быть реализован метод public static String calc(String input)

public class Calc {

    static byte a;
    static byte b;
    static String operator;
    static Integer result;


    public static String calc(String input) throws NullPointerException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NumException {
        try {
            String[] inputs = input.split(" ");
            if (inputs.length > 3) {
                throw new ArrayIndexOutOfBoundsException();
            }
            a = Byte.parseByte(inputs[0]);
            b = Byte.parseByte(inputs[2]);
            operator = inputs[1];
            if ((a < 1 || a > 10) || (b < 1 || b > 10)) {
                throw new NumException();
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
                NumException exception) {
            NumException.printDescription();
        } if (result == null) {
            throw new NullPointerException ();
        } return Integer.toString(result);
    }
}


