import java.util.Scanner;

public class Tugas1Jobsheet9 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);

        System.out.print("Seberapa banyak kamu sudah menabung : ");
        int n = sc13.nextInt();

        if (n <= 0) {
            System.out.println("Tidak ada tabungan untuk dihitung.");
            return;
        }

        int[] tabungan = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai tabungan ke-" + (i + 1) + ": ");
            tabungan[i] = sc13.nextInt();
        }

        sc13.close();

        int nilaiTertinggi = tabungan[0];
        int nilaiTerendah = tabungan[0];
        int totalTabungan = tabungan[0];

        for (int i = 1; i < n; i++) {
            if (tabungan[i] > nilaiTertinggi) {
                nilaiTertinggi = tabungan[i];
            }
            if (tabungan[i] < nilaiTerendah) {
                nilaiTerendah = tabungan[i];
            }
            totalTabungan += tabungan[i];
        }

        double rataRataTabungan = (double) totalTabungan / n;

        System.out.println("Tabungan tertinggi: " + nilaiTertinggi);
        System.out.println("Tabungan terendah: " + nilaiTerendah);
        System.out.println("Rata-rata tabungan: " + rataRataTabungan);
    }
}
