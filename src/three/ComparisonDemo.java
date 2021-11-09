package three;

import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi cijeli broj 1: ");
        int number1= new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi cijeli broj 2: ");
        int number2= new Scanner(System.in).nextInt();

        if (number1==number2){
            System.out.println("Unio si dva jednaka broja");
        }
        if (number1!=number2){
            System.out.println("Unio si dva nejednaka broja");
        }
        if (number1>number2){
            System.out.println("Prvi broj je veci od drugog broja");
        }
        if (number1>=number2){
            System.out.println("Prvi broj je veci ili jednak od drugog broja");
        }
        if (number1<number2){
            System.out.println("Prvi broj je manji od drugog broja");
        }
        if (number1<=number2){
            System.out.println("Prvi broj je manji ili jednak od drugog broja");
        }
    }
}
