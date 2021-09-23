import java.util.Scanner;

public class Tugas2 {
        public static void main(String[] args) {
        System.out.println("Berikut Tugas Kalkulator Sederhana");
        System.out.println();

        Scanner Scanner = new Scanner(System.in);

        System.out.print("Masukan nilai a = ");
        double a = Scanner.nextDouble();

        System.out.print("Masukan nilai b = ");
        double b = Scanner.nextDouble();

        double hasil = a + b;
        System.out.println("Hasil dari a + b = " + hasil);

        hasil = a - b;
        System.out.println("Hasil dari a - b = " + hasil);

        hasil = a * b;
        System.out.println("Hasil dari a * b = " + hasil);

        hasil = a / b;
        System.out.println("Hasil dari a / b = " + hasil);

        hasil = a % b;
        System.out.println("Hasil dari a % b = " + hasil);

        System.out.println("Sekian tugas kalkulator sederhana, Terima kasih");
    }
}