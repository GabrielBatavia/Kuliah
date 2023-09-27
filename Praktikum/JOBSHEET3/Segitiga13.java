import java.util.Scanner;

public class Segitiga13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Menggunakan nama singkat "sc"

        int alas, tinggi;
        float luas;

        System.out.println("Masukkan alas: ");
        alas = sc.nextInt(); // Menggunakan "sc" sebagai nama Scanner
        System.out.println("Masukkan tinggi: ");
        tinggi = sc.nextInt(); // Menggunakan "sc" sebagai nama Scanner

        luas = (float) (alas * tinggi) / 2; // Menggunakan casting untuk hasil float
        System.out.println("Luas segitiga: " + luas);

        sc.close(); // Selalu ingat untuk menutup scanner setelah digunakan
    }
}
