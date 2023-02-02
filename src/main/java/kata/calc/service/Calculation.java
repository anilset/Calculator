package kata.calc.service;
import kata.calc.model.Input;
import kata.calc.model.NumberException;

public class Calculation {
    private Input input;

    public Calculation (Input input) {
            this.input = input;
        }
    public String getResult() throws NullPointerException, NumberException, ArrayIndexOutOfBoundsException {
        int result = 0;
        if (( input.getA() < 1 || input.getA() > 10) ||  (input.getB() < 1 || input.getB() > 10)) {
            throw new NumberException();
        }
        switch (input.getOperator()) {
            case "+":
                result += (input.getA() + input.getB());
                break;
            case "-":
                result += (input.getA() - input.getB());
                break;
            case "*":
                result += (input.getA() * input.getB());
                break;
            case "/":
                result += (input.getA() / input.getB());
                //result += Math.round(input.getA() * 100.0 / input.getB()/ 100.0);
                break;
            default :
               throw new IllegalArgumentException( "Поддерживаемые операторы: +, -, *, /");
        } return Integer.toString(result);
    }
}


