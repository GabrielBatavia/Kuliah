import java.util.Scanner;

/**
 * Percobaan2
 */
public class Percobaan2 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return 1;
        } else {
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Bilangan yang dihitung:");
        int bilangan = sc.nextInt();
    
        System.out.print("Pangkat:");
        int pangkat = sc.nextInt();
    
        System.out.println(hitungPangkat(bilangan, pangkat));
    
        // Cetak deret perhitungan pangkat
        System.out.print("Deret perhitungan pangkat: ");
        cetakDeretPangkat(bilangan, pangkat);
    }
    
    static void cetakDeretPangkat(int x, int y) {
        for (int i = 0; i < y; i++) {
            System.out.print(x);
            if (i < y - 1) {
                System.out.print("x");
            }
        }
        System.out.print(" = " + hitungPangkat(x, y));
    }
    
}
