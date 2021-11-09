package two;

/**
 * Tipovi:
 * prosti i slozeni
 *
 * Prosti:
 *
 */
public class SecondExecutor {
    public static void main(String[] args) {
       //tip varijabla = podatak;
        byte firstNumber = 127; //8 bitni
        short secondNumber = 32767; // 16 bitni
        int thirdNumber = 55000; // 32 bitni podrazumjevani
        long fourthNumber = 55000L; // 64 bitni

        long longNumber = 32000L;
        int intNumber = (int) longNumber;

        float floatNumber = 2.3F;
        double doubleNumber = 2.3;

        double decimalNumber = 123.4;
        double decimalNumber2 = 1.234e2;

        int specijalniBroj1 = 26;
        System.out.println(specijalniBroj1);
        int specijalniBroj2 = 0x1a;
        System.out.println(specijalniBroj2);
        int specijalniBroj3 = 0b11010;
        System.out.println(specijalniBroj3);

        char charVariable = 'a';
        char charVar = 87;
        System.out.println(charVar);

        int intNumber3 = charVariable;
        System.out.println(intNumber3);



    }
}
