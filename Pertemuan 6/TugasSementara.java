import java.util.Scanner;

public class TugasSementara {
    public static void main(String[] args) {
        System.out.println(".:Program Siakad:.");

        System.out.println("1.Tambahkan Data");
        System.out.println("2.Edit Data");
        System.out.println("3.Hapus Data");
        System.out.println("4.Lihat Data");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Pilih menu di atas = ");
        int menu = scanner.nextInt();
        if (menu == 1) {
            System.out.println("1.Tambah Data Mahasiswa");
            System.out.println("2.Tambah Data Mata Kuliah");
            System.out.println("3.Kembali");

            System.out.print("Masukan menu yang anda pilih : ");
            int menu1 = scanner.nextInt();
            if (menu1 == 1){
                System.out.print("Masukan nama Mahasiswa = ");            
            } if (menu1 == 2){
                System.out.print("Masukan nama Mata kuliah = ");
            } if (menu1 == 3){
                System.out.print("Terima Kasih");
            }else {
                System.out.print("menu tidak ditemukan");
            }
        }  
    }  
}
