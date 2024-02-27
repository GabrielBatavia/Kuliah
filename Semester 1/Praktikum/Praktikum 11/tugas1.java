import java.util.Scanner;

public class tugas1 {

    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N = ");
        int N = sc13.nextInt();

        // Perulangan untuk mencetak baris
        for (int i = 1; i <= N; i++) {

            // Perulangan untuk mencetak spasi
            for (int k = 1; k <= N - i; k++) {
                System.out.print(" ");
            }


            // Perulangan untuk mencetak angka
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Baris baru setelah setiap baris angka
            System.out.println();
        }
    }
}