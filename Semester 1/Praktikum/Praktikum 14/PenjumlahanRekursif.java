import java.util.Scanner;

public class PenjumlahanRekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        int hasil = hitungPenjumlahan(n);
        System.out.println("Hasil penjumlahan dari 1 hingga " + n + " adalah " + hasil);
    }

    public static int hitungPenjumlahan(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + hitungPenjumlahan(n - 1);
        }
    }
}