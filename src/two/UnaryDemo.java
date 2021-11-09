package two;

public class UnaryDemo {
    public static void main(String[] args) {
        int broj1=+23;
        System.out.println("Broj 1 sa +: " +broj1);
        broj1=-broj1;
        System.out.println("Broj 1 sa -: " +broj1);
        broj1=23;
        broj1++;
        System.out.println("POST INCREMENT: " +broj1);
        broj1=23;
        ++broj1;
        System.out.println("PRE INCREMENT: " +broj1);
        broj1=23;
        System.out.println(broj1++);
        System.out.println(broj1);

        broj1=23;
        System.out.println(++broj1);
        System.out.println(broj1);
        broj1=23;
        System.out.println(broj1--);
        System.out.println(broj1);
        broj1=23;
        System.out.println(--broj1);
        System.out.println(broj1);

        boolean lav=false;
        System.out.println(!lav);


    }
}
