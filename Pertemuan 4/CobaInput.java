import java.util.Scanner;

public class CobaInput {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        
        System.out.print("Masukan nama anda : ");
        String namaDepan = Scanner.nextLine();

        System.out.print("Masukan Umur anda : ");
        int umur = Scanner.nextInt();

        System.out.println("Nama anda adalah " + namaDepan);
        System.out.println("Umur anda adalah " + umur);

    }  
}