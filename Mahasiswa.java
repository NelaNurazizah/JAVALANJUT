import java.util.Scanner;

public class Mahasiswa {
    // Atribut
    private String nama;
    private String nim;
    private String prodi;
    private String alamat;
    private String tanggalLahir;
    private double[] nilaiUTS;
    private double[] nilaiUAS;

    // Constructor
    public Mahasiswa(String nama, String nim, String prodi, String alamat, String tanggalLahir, double[] nilaiUTS, double[] nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Method untuk mencetak data mahasiswa
    public void cetakData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.print("Nilai UTS: ");
        for (double nilai : nilaiUTS) {
            System.out.print(nilai + " ");
        }
        System.out.println();
        System.out.print("Nilai UAS: ");
        for (double nilai : nilaiUAS) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        System.out.print("Masukkan prodi: ");
        String prodi = scanner.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamat = scanner.nextLine();

        System.out.print("Masukkan tanggal lahir: ");
        String tanggalLahir = scanner.nextLine();

        System.out.print("Masukkan jumlah nilai UTS: ");
        int jumlahUTS = scanner.nextInt();
        double[] nilaiUTS = new double[jumlahUTS];
        for (int i = 0; i < jumlahUTS; i++) {
            System.out.print("Nilai UTS ke-" + (i + 1) + ": ");
            nilaiUTS[i] = scanner.nextDouble();
        }

        System.out.print("Masukkan jumlah nilai UAS: ");
        int jumlahUAS = scanner.nextInt();
        double[] nilaiUAS = new double[jumlahUAS];
        for (int i = 0; i < jumlahUAS; i++) {
            System.out.print("Nilai UAS ke-" + (i + 1) + ": ");
            nilaiUAS[i] = scanner.nextDouble();
        }

        Mahasiswa mahasiswa = new Mahasiswa(nama, nim, prodi, alamat, tanggalLahir, nilaiUTS, nilaiUAS);
        mahasiswa.cetakData();

        scanner.close();
    }
}