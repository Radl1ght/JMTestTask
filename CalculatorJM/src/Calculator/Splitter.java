package Calculator;

public class Splitter {

    private static char operator;
    private static String[] splittedString;
    private static String str = Input.getInput();

        public static void split() {

        if (str.contains("+")) {
            operator = '+';
            splittedString = str.split("\\+");
        } else {if (str.contains("-")) {
            operator = '-';
            splittedString = str.split("\\-");
        }
        else {
            if (str.contains("*")) {
                operator = '*';
                splittedString = str.split("\\*");
            }
            else if (str.contains("/")) {
                operator = '/';
                splittedString = str.split("\\/");
            }
        }
        }
        }

    public static String[] getSplittedString() {
        return splittedString;
    }

    public static char getOperator() {
        return operator;
    }
}
