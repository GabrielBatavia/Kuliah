import java.util.Scanner;

public class HitungIP13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);

        System.out.print("Program Hitung IP\nMasukkan nama: ");
        String namaMahasiswa = sc13.nextLine();

        double totalNilai = 0.0;
        int totalSKS = 0;
        int mataKuliahRemidi = 0;
        int jumlahMataKuliah = 0;

        char lanjutInput = 'y';

        while (lanjutInput == 'y' || lanjutInput == 'Y') {
            System.out.print("Nama Mata Kuliah: ");
            String namaMataKuliah = sc13.nextLine();

            System.out.print("Nilai (A,B+,B,C+,C,D,E): ");
            String nilai = sc13.next();

            System.out.print("Masukkan jumlah SKS: ");
            int sks = sc13.nextInt();

            switch (nilai) {
                case "A":
                    totalNilai += 4.0 * sks;
                    break;
                case "B+":
                    totalNilai += 3.5 * sks;
                    break;
                case "B":
                    totalNilai += 3.0 * sks;
                    break;
                case "C+":
                    totalNilai += 2.5 * sks;
                    break;
                case "C":
                    totalNilai += 2.0 * sks;
                    break;
                case "D":
                    totalNilai += 1.0 * sks;
                    mataKuliahRemidi++;
                    break;
                case "E":
                    totalNilai += 0.0 * sks;
                    mataKuliahRemidi++;
                    break;
                default:
                    System.out.println("Nilai yang dimasukkan tidak valid. Nilai diabaikan.");
            }

            totalSKS += sks;
            jumlahMataKuliah++;

            System.out.print("Apakah lanjut input nilai (Y/N)? ");
            lanjutInput = sc13.next().charAt(0);

            //Membersihkan NewLine 13
            sc13.nextLine();
        }

        double IP = totalNilai / totalSKS;

        System.out.println("----------Hasil Perhitungan IP----------\n");
        System.out.println("Nama                 : " + namaMahasiswa);
        System.out.println("Indeks Prestasi (IP) : " + String.format("%.2f", IP));
        System.out.println("Jumlah mata kuliah   : " + jumlahMataKuliah); 
        System.out.println("Jumlah SKS           : " + totalSKS);
        System.out.println("Jumlah MK yang harus perbaikan/remidi: " + mataKuliahRemidi);

        sc13.close();
    }
}
