import java.util.Scanner;

public class Tugas2_13 {
    // Deklarasi array 2 dimensi untuk menyimpan nilai mahasiswa
    static double[][] nilaiMahasiswa = new double[5][7];
    static String[] namaMahasiswa = new String[5];

    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);

        // Input data nilai mahasiswa
        inputDataNilai(sc13);

        // Menampilkan seluruh nilai mahasiswa dalam format tabel
        tampilkanTabelNilaiMahasiswa();

        // Mencari hari dengan nilai tertinggi
        int hariTertinggi = cariHariTertinggi();
        System.out.println("Hari dengan nilai tertinggi adalah hari ke-" + (hariTertinggi + 1));

        // Menampilkan mahasiswa dengan nilai tertinggi pada hari tertentu
        tampilkanMahasiswaTertinggi(hariTertinggi);

        sc13.close();
    }

    // Fungsi untuk menginputkan data nilai mahasiswa
    public static void inputDataNilai(Scanner sc13) {
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = sc13.nextLine();

            for (int j = 0; j < 7; j++) {
                System.out.print("Masukkan nilai tugas minggu ke-" + (j + 1) + " untuk " + namaMahasiswa[i] + ": ");
                nilaiMahasiswa[i][j] = sc13.nextDouble();
            }

            // Mengonsumsi newline setelah input nilai
            sc13.nextLine();
        }
    }

    // Fungsi untuk menampilkan seluruh nilai mahasiswa dalam format tabel
    public static void tampilkanTabelNilaiMahasiswa() {
        System.out.println("==============================================================================================================");
        System.out.printf("| %-15s |", "Nama Mahasiswa");
        for (int j = 0; j < 7; j++) {
            System.out.printf(" %-10s |", "Minggu " + (j + 1));
        }
        System.out.println("\n==============================================================================================================");

        for (int i = 0; i < 5; i++) {
            System.out.printf("| %-15s |", namaMahasiswa[i]);
            for (int j = 0; j < 7; j++) {
                System.out.printf(" %-10.2f |", nilaiMahasiswa[i][j]);
            }
            System.out.println();
        }

        System.out.println("==============================================================================================================");
    }

    // Fungsi untuk mencari hari dengan nilai tertinggi
    public static int cariHariTertinggi() {
        int hariTertinggi = 0;
        double nilaiTertinggi = nilaiMahasiswa[0][0];

        for (int j = 1; j < 7; j++) {
            double nilaiMinggu = 0;
            for (int i = 0; i < 5; i++) {
                nilaiMinggu += nilaiMahasiswa[i][j];
            }

            if (nilaiMinggu > nilaiTertinggi) {
                nilaiTertinggi = nilaiMinggu;
                hariTertinggi = j;
            }
        }

        return hariTertinggi;
    }

    // Fungsi untuk menampilkan mahasiswa dengan nilai tertinggi pada hari tertentu
    public static void tampilkanMahasiswaTertinggi(int hari) {
        System.out.println("Mahasiswa dengan nilai tertinggi pada hari ke-" + (hari + 1) + ":");
        double nilaiTertinggi = 0;
        int mahasiswaTertinggi = -1;

        for (int i = 0; i < 5; i++) {
            if (nilaiMahasiswa[i][hari] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMahasiswa[i][hari];
                mahasiswaTertinggi = i;
            }
        }

        if (mahasiswaTertinggi != -1) {
            System.out.println("Nama Mahasiswa: " + namaMahasiswa[mahasiswaTertinggi]);
            System.out.println("Nilai pada hari ke-" + (hari + 1) + ": " + nilaiMahasiswa[mahasiswaTertinggi][hari]);
        } else {
            System.out.println("Tidak ada mahasiswa dengan nilai tertinggi pada hari ke-" + (hari + 1));
        }
    }
}