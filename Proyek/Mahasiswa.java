public class Mahasiswa extends Siakad {
    private String nim;
    private String nama;
    private double ipk;
    private String semester;

    public Mahasiswa(String nim, String nama, double ipk, String semester) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public String getNIM() {
        return this.nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setIPK(double ipk) {
        this.ipk = ipk;
    }

    public double getIPK() {
        return this.ipk;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getSemester() {
        return this.semester;
    }

    public void getDetail() {
        System.out.printf("%7s %17s %14s %10s", "NIM", "NAMA", "IPK", "SEMESTER" );
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.printf("%10s %22s %6s %5s", this.nim, this.nama.toUpperCase(), String.valueOf(this.ipk), this.semester);
        System.out.println();
    }

}