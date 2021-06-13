package Calculator;

public class CalcInt {

    private int var1;
    private int var2;
    private char operator = Splitter.getOperator();
    private static int intResult;
    private String finalResult;
    private boolean isRoman = Input.getIsRoman();


    public int calculate() throws IncorrectInputDataException {

         if (isRoman==false) {
             var1 = Integer.parseInt(Splitter.getSplittedString()[0]);
             var2 = Integer.parseInt(Splitter.getSplittedString()[1]);
         } else {
             var1 = Converter.toArabic(Splitter.getSplittedString()[0]);
             var2 = Converter.toArabic(Splitter.getSplittedString()[1]);
         }

                intResult = 0;
                switch (operator) {
                    case ('+'):
                        return intResult = var1 + var2;

                    case ('-'):
                        if ((var1 <= var2 & isRoman) == true)
                        {throw new IncorrectInputDataException("Римские числа не могут быть отрицательными или равными нулю!");}
                        else
                        return intResult = var1 - var2;

                    case ('*'):
                       return intResult = var1 * var2;

                    case ('/'):
                        return intResult = var1 / var2;

                }
                return intResult;
            }

    public static int getIntResult() {
        return intResult;
    }

    public String getFinalResult() {

        if (isRoman==false) {
            finalResult = Integer.toString(intResult);

        } else {
            finalResult = Converter.toRoman(intResult);

        }
        System.out.printf("Результат: %s \n", finalResult);
        return finalResult;

    }
}







