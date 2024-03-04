import java.util.Scanner;

public class latihanNestedLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        int panjang = scanner.nextInt();
        System.out.print("Masukkan lebar: ");
        int lebar = scanner.nextInt();
        System.out.print("Masukkan tinggi: ");
        int tinggi = scanner.nextInt();

        System.out.println("Pilih bentuk (1 untuk kotak, 2 untuk segitiga): ");
        int pilihan = scanner.nextInt();

        if (pilihan == 1) {
            // Mencetak kotak
            for (int i = 0; i < lebar; i++) {
                for (int j = 0; j < panjang; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else if (pilihan == 2) {
            // Mencetak segitiga
            for (int i = 0; i < tinggi; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
