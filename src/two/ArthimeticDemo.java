package two;

public class ArthimeticDemo {
    public static void main(String[] args) {
        int broj1 = 23;
        int broj2 = 13;
        int result = broj1 + broj2;
        System.out.println("Suma: "+result);
        result = result -3;
        System.out.println("Oduzimanje: "+result);
        result=result*2;
        System.out.println("Mnozenje: "+result);
        result=result/3;
        System.out.println("Dijeljenje: "+result);
        result=result%6;
        System.out.println("Modulo result: "+result);

        char singleChar = 'W';
        String ime = "John";
        String prezime = "_Doe";
        String fullName=ime+prezime;
        System.out.println(fullName);

    }
}
