package Calculator;

/* Тестовое задание на обучение в Java Mentor от Царёва М. Д. */

public class Main {
    public static void main (String[] args) throws IncorrectInputDataException {
        Input input = new Input();
            input.inputString();
            input.inputVerification();
        Splitter splitter = new Splitter();
            splitter.split();
        CalcInt calcInt = new CalcInt();
            calcInt.calculate();
            calcInt.getFinalResult();

    }
}

