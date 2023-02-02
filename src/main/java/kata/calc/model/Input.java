package kata.calc.model;

public class Input {
    private String input;
    private String[] strings;
    private byte a;
    private byte b;
    private String operator;

    public Input(String input) {
        try {
        this.input = input;
            String[] strings = input.split(" ");
            if (strings.length > 3) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.a = Byte.parseByte(strings[0]);
            this.b = Byte.parseByte(strings[2]);
            this.operator = strings[1];
            if ((a < 1 || a > 10) || (b < 1 || b > 10)) {
                throw new NumberException();
            }
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | NumberException exception) {
            System.out.println(NumberException.getDescription() +
                    ". Числа должны быть отделены от знака пробелами. Введите валидные данные");
        }
    }
        public byte getA() throws ArrayIndexOutOfBoundsException {
            return a;
        }

        public byte getB () throws ArrayIndexOutOfBoundsException {
            return b;
        }

        public String getOperator () throws ArrayIndexOutOfBoundsException, NullPointerException{
            return operator;
        }
    }
