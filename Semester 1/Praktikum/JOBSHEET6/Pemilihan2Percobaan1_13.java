import java.util.Scanner;
/**
 * Pemilihan2Percobaan1_13
 */
public class Pemilihan2Percobaan1_13 {

    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);    

    int tahun;
    
    System.out.print("Masukkan Tahun : ");
    tahun = sc.nextInt();

    if ((tahun % 4) == 0 ) {
        if ((tahun % 100) != 0) {
            System.out.println("Tahun Kabisat");
        }
    } else {
        System.out.println("Bukan Tahun Kabisat");
    }

    }
}