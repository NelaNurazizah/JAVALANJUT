public class tugas1 {
    private String nama;
    private String nim;
    private String prodi;
    private double uas;
    private double uts;

    public tugas1(String nama, String nim, String prodi, double uas, double uts) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.uas = uas;
        this.uts = uts;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("UAS : " + uas);
        System.out.println("UTS : " + uts);
    }

    public static void main(String[] args) {
        tugas1 student = new tugas1("Nela Nurazizah", "301230029", "Teknik Informatika", 80.0, 90.0);
        student.displayInfo();
    }
}