//Nama  : Sri Fauzie Kurniawan
//NIM   : 21537144030
//Kelas : J2
//Prodi : Teknologi Informasi

import java.util.Scanner;

public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    private int jumlahData = 0;

    public static void main(String[] args) {
        
        Siakad siakad = new Siakad();
        int menu = 0;
        while (menu!=9) {
            menu = tampilanMenu();
            if (menu==1) {
                siakad.lihatData();
            } else if (menu==2) {
                siakad.tambahData();
            } else if (menu==3) {
                siakad.cariDataByNIM();
            } else if (menu==4) {
                siakad.editNama();
            } else if (menu==5) {
                siakad.editNIM();
            } else if (menu==6) {
                siakad.editSemester();
            } else if (menu==7) {
                siakad.rerataIPK();
            } else if (menu==8) {
                siakad.hapusData();
            }
        }
    }

    private static int tampilanMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("----< Menu Siakad >----");
        System.out.println(" ");
        System.out.println("1. Lihat Data");
        System.out.println("2. Tambah Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Edit Nama");
        System.out.println("5. Edit NIM");
        System.out.println("6. Edit Semester");
        System.out.println("7. Rerata IPK");
        System.out.println("8. Hapus Data");
        System.out.println("9. Keluar");
        System.out.print("Pilih menu = ");
        int menu = scan.nextInt();
        return menu;     
    }

    private void lihatData() {
        if (jumlahData==0) {
            System.out.println("Belum ada data");
        } else {
            System.out.println("Berikut data mahasiswa");
            for (int i=0; i<jumlahData;i++) {
                mahasiswa[i].getDetail();
            }
        }
        
    }

    private void tambahData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa = ");
         String nim = scan.nextLine();
        System.out.print("Masukan nama mahasiswa = ");
         String nama = scan.nextLine();
        System.out.print("Masukan Semester mahasiswa = ");
         String semester = scan.nextLine();
         System.out.print("Masukan Jurusan mahasiswa = ");
         String jurusan = scan.nextLine();
        double ipk = 0;
        try {
             System.out.print("Masukan IPK mahasiswa = ");
             ipk = scan.nextDouble();
        } catch (Exception e) {
            System.out.println("Anda harus memasukan bilangan desimal dengan menggunakan tanda titik. Silahkan edit IPK anda setelah input data");
        }
         Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, ipk, semester, jurusan);
        mahasiswa[jumlahData] = inputMahasiswa;
        jumlahData++;
        lihatData();
    }

    public void cariDataByNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan dicari = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("NIM yang anda cari tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
        }
    }

    public int getIndexByNIM(String nim) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNIM().equals(nim)) {
                return i;
            }
        }
        return -1;
    }

    public void editNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("NIM yang anda akan edit tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan Nama mahasiswa yang baru = ");
            String nama = scan.nextLine();
            mahasiswa[index].setNama(nama);
            mahasiswa[index].getDetail();         
        }
    }

    public void editNIM() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nama mahasiswa yang akan diedit = ");
        String nama = scan.nextLine();
        int index = getIndexByNama(nama);
        if (index==-1) {
            System.out.println("Nama yang anda akan edit tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan NIM mahasiswa yang baru = ");
            String nim = scan.nextLine();
            mahasiswa[index].setNIM(nim);
            mahasiswa[index].getDetail();           
        }
    }

    public int getIndexByNama(String nama) {
        for (int i=0; i<jumlahData; i++) {
            if (mahasiswa[i].getNama().equals(nama)) {
                return i;
            }
        }
        return -1;
    }

    public void editSemester() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa yang akan diedit = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("NIM yang anda akan edit tidak ketemu");
        } else {
            mahasiswa[index].getDetail();
            System.out.print("Masukan semester mahasiswa yang baru = ");
            String semester = scan.nextLine();
            mahasiswa[index].setSemester(semester);
            mahasiswa[index].getDetail();         
        }
    }

    public void hapusData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM mahasiswa dari data yang akan dihapus = ");
        String nim = scan.nextLine();
        int index = getIndexByNIM(nim);
        if (index==-1) {
            System.out.println("Data yang anda akan hapus tidak ketemu");
        } else {
            for (int i = index; i<jumlahData; i++) {
                mahasiswa[i] = mahasiswa[i+1];
            }
            jumlahData--;
            lihatData();
        }
    }

    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahData; i++) {
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahData;
        System.out.println("Rerata IPK Mahasiswa = "+ rerata);
    }
    
}