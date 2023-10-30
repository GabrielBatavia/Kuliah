import java.util.Scanner;
/**
 * BioskopWithScanner13
 */
public class BioskopWithScanner13 {

    public static void main(String[] args) {

    Scanner sc13 = new Scanner(System.in);

    int baris, kolom;
    String nama, next;

    String[][] penonton = new String[4][2];

    while (true) {
        System.out.print("Masukkan nama: ");
        nama = sc13.nextLine();
        System.out.print("Masukkan baris: ");
        baris = sc13.nextInt();
        System.out.print("Masukkan kolom: ");
        kolom = sc13.nextInt();
        sc13.nextLine();

        penonton[baris-1][kolom-1] = nama;

        System.out.print("input penonton lainnya? (y/n): ");
        next = sc13.nextLine();

        if (next.equalsIgnoreCase("n")) {
            break;
        }

    }

    }
}