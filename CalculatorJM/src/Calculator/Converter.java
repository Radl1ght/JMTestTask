package Calculator;

public class Converter{

public static int toArabic(String romanVar)
    {
        int intRomanValue = 0;
        int addValue;
        for(int i=0; i<romanVar.length(); i++) {

            if(i+1<romanVar.length()){
                if(valueOfRomanChar(romanVar.charAt(i))<valueOfRomanChar(romanVar.charAt(i+1))){
                    addValue = valueOfRomanChar(romanVar.charAt(i+1)) - valueOfRomanChar(romanVar.charAt(i));
                    intRomanValue = intRomanValue + addValue;
                    i++;
                } else{
                    addValue = valueOfRomanChar(romanVar.charAt(i));
                    intRomanValue = intRomanValue + addValue;
                }
            } else {
                addValue = valueOfRomanChar(romanVar.charAt(i));
                intRomanValue = intRomanValue + addValue;
            }
        }
        return intRomanValue;
    }

    private static int valueOfRomanChar(char ch){
        switch(ch){
            case 'I':  return 1;
            case 'V':  return 5;
            case 'X':  return 10;
            case 'L':  return 50;
            case 'C':  return 100;
        }
        return 0;
    }

    public static String toRoman(int number) {
    switch (number) {
        case 100: return "C";
        default:
        String arabicNumeral = String.valueOf(number);
        String baseRoman;
        String romanNumeral = "";
        int i = 3 - arabicNumeral.length();
        int location = 0;
        switch (i) {
            case 1:
                baseRoman = getBaseRoman(arabicNumeral.charAt(location++));
                romanNumeral = convertIVXtoXLC(baseRoman, romanNumeral);
            case 2:
                baseRoman = getBaseRoman(arabicNumeral.charAt(location++));
                romanNumeral += baseRoman;
                break;
            default:
        }
        return romanNumeral;
    }
    }

    private static String getBaseRoman(char ch) {
        String romanBase="";
        if ((ch>='1') && (ch<='3')){
            for(int i=0;i<Character.getNumericValue(ch);i++){
                romanBase=romanBase + "I";

            }
        }else if((ch>='5') && (ch<'9')){
            romanBase=romanBase+'V';
            for(int i=5;i<Character.getNumericValue(ch);i++){
                romanBase=romanBase+ 'I';
            }
        }else if(ch=='9'){
            romanBase=romanBase+"IX" ;
        }else if(ch=='4'){
            romanBase=romanBase+"IV" ;
        }else if(ch=='0'){
        }
        return romanBase;
    }

    //конвертирует первую цифру двухзначного римского числа в соответствующий десяток
    private static String convertIVXtoXLC(String baseRoman, String romanNumeral) {
        if (baseRoman != null) {
            for (int location = 0; location <baseRoman.length(); location++) {
                switch(baseRoman.charAt(location)){
                    case 'I':
                        romanNumeral = romanNumeral + "X";
                        break;
                    case 'V':
                        romanNumeral = romanNumeral + "L";
                        break;
                    case 'X':
                        romanNumeral = romanNumeral + "C";
                        break;
                }
            }
        }
        return romanNumeral;
    }
}
