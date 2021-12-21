public class Mahasiswa extends Siakad {
    private String nim;
    private String nama;
    private double ipk;
    private String semester;
    private String jurusan;

    public Mahasiswa(String nim, String nama, double ipk, String semester, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.semester = semester;
        this.jurusan = jurusan;
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

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return this.jurusan;
    }


    public void getDetail() {
        System.out.printf("%7s %17s %14s %10s %10s", "NIM", "NAMA", "IPK", "SEMESTER", "JURUSAN" );
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.printf("%10s %22s %6s %5s %13s", this.nim, this.nama.toUpperCase(), String.valueOf(this.ipk), this.semester, this.jurusan.toUpperCase());
        System.out.println();
    }

}