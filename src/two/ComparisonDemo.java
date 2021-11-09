package two;

import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi broj1:");
        int broj1 = new Scanner(System.in) .nextInt();
        System.out.println("Unesi broj2:");
        int broj2 = new Scanner(System.in) .nextInt();
        if (broj1==broj2){System.out.println("Isti su uneseni brojevi:");
        }
        if (broj1!=broj2){System.out.println("Različiti su uneseni brojevi:");
        }


        System.out.println("Pritisni peticu i započni igricu:");
        int broj3 = new Scanner(System.in) .nextInt();

        if(broj1==5) {
            System.out.println("Pritisnuo peticu i započni igricu:");
        } else {
            System.out.println("Nisi pritisnuo peticu i započni igricu:");
        }

    }
}
