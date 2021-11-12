package three;

import java.util.Scanner;

public class IfElsDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj poena");
        int brojPoena = new Scanner(System.in).nextInt();
        char ocjena;
        if (brojPoena >= 90) {
            ocjena = 'A';
        } else if (brojPoena >= 80) {
            ocjena = 'B';
        } else if (brojPoena >= 70) {
            ocjena = 'C';
        } else if (brojPoena >= 60) {
            ocjena = 'D';
        }else{
            ocjena='F';
        }
        System.out.println("Zasluzena ocjena: " +ocjena);
    }
}
