package sda.programowanieII_PoziomSredniozaawansowany.liczbyLancuchZnakow;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Main.binarySystem("10011010010");
        System.out.println(Main.convertBinaryToDecimal("10011010010"));
        System.out.println(Main.convertBinaryToDecimal("101101"));
        System.out.println(Main.convertToBase(2, "101101"));
        System.out.println(Main.convertDecimalToBinary("23"));

    }

    private static void binarySystem(String string) {
        int decimal = Integer.parseInt(string, 2);
        System.out.println(decimal);

    }

    private static String convertBinaryToDecimal(String binaryNumber) {
        int result = 0;
        int powerOf2 = 1;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            if (binaryNumber.charAt(i) == '1') {
                result += powerOf2;
            }
            powerOf2 *= 2;

        }
        return Integer.toString(result);
    }

    private static String convertToBase(int base, String baseNumber) {
        int result = 0;
        int powerOfBase = 1;

        for (int i = baseNumber.length() - 1; i >= 0; i--) {
            char digit = baseNumber.charAt(i);
//            System.out.println(digit-48);
            result += getDigitValue(digit) * powerOfBase;
            powerOfBase *= base;

        }
        return Integer.toString(result);

    }

    private static int getDigitValue(char digit) {
        return digit - 48;
    }

    //    private static String decimalNumber(String string, int base, int pow){
//
//
//    }
    private static String convertDecimalToBinary(String decimalNumber) {
        int number = Integer.parseInt(decimalNumber);

        StringBuilder resultBuilder = new StringBuilder();
        while (number > 0) {
         resultBuilder.append(number%2);
            number /= 2;
        }
        return resultBuilder.reverse().toString();
    }

//    private static String myOwnConvert(String decimalString){
//        int number =
//    }



}
