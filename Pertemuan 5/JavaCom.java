import java.util.Scanner;

public class JavaCom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukan nilai A = ");
        double a = scanner.nextDouble();
        
        System.out.print("Masukan nilai B = ");
        double b = scanner.nextDouble();

        System.out.println("A == B = " + (a==b));
        System.out.println("A != B = " + (a!=b));
        System.out.println("A > B = " + (a>b));
        System.out.println("A < B = " + (a<b));
        System.out.println("A >= B = " + (a>=b));
        System.out.println("A <= B = " + (a<=b));

        boolean hasil = (a < 5 && b > 2);
        System.out.println("Hasil A < 5 && B > 2 = " + hasil);
        System.out.println("Hasil A < 5 || B > 2 = " + (a < 5 || b >2));
        System.out.println("Hasil !(A < 5 && B > 2) = " + !hasil);
        
    }
}