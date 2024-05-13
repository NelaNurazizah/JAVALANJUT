import java.util.Scanner;

public class MahasiswaBubblesort {
    private String nama;
    private String nim;
    private String prodi;
    private String alamat;
    private String tanggalLahir;
    private double nilaiUTS;
    private double nilaiUAS;

    // Constructor
    public MahasiswaBubblesort(String nama, String nim, String prodi, String alamat, String tanggalLahir, double nilaiUTS, double nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    // Getter and Setter methods
    // ...

    // Method untuk mencetak detail mahasiswa
    public void printDetails() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Prodi: " + this.prodi);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Tanggal Lahir: " + this.tanggalLahir);
        System.out.println("Nilai UTS: " + this.nilaiUTS);
        System.out.println("Nilai UAS: " + this.nilaiUAS);
        System.out.println("-------------------------");
    }

    // Method main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Buat array dari objek MahasiswaBubbleSort
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        MahasiswaBubblesort[] mahasiswa = new MahasiswaBubblesort[jumlahMahasiswa];

        // Input data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            scanner.nextLine(); // Consume newline character
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Prodi: ");
            String prodi = scanner.nextLine();
            System.out.print("Alamat: ");
            String alamat = scanner.nextLine();
            System.out.print("Tanggal Lahir (dd-MM-yyyy): ");
            String tanggalLahir = scanner.nextLine();
            System.out.print("Nilai UTS: ");
            double nilaiUTS = scanner.nextDouble();
            System.out.print("Nilai UAS: ");
            double nilaiUAS = scanner.nextDouble();

            mahasiswa[i] = new MahasiswaBubblesort(nama, nim, prodi, alamat, tanggalLahir, nilaiUTS, nilaiUAS);
        }

        // Cetak detail mahasiswa sebelum pengurutan
        System.out.println("Detail Mahasiswa sebelum pengurutan:");
        for (MahasiswaBubblesort m : mahasiswa) {
            m.printDetails();
        }

        // Lakukan pengurutan menggunakan Bubble Sort berdasarkan NIM
        for (int i = 0;i < mahasiswa.length - 1; i++) {
            for (int j = 0; j < mahasiswa.length - 1 - i; j++) {
                if (mahasiswa[j].nim.compareTo(mahasiswa[j + 1].nim) > 0) {
                    // Tukar posisi jika NIM yang lebih kecil berada di indeks yang lebih besar
                    MahasiswaBubblesort temp = mahasiswa[j];
                    mahasiswa[j] = mahasiswa[j + 1];
                    mahasiswa[j + 1] = temp;
                }
            }
        }

        // Cetak detail mahasiswa sesudah pengurutan
        System.out.println("Detail Mahasiswa sesudah pengurutan:");
        for (MahasiswaBubblesort m : mahasiswa) {
            m.printDetails();
        }
    }
}