import java.util.Scanner;
/**
 * Gaji13
 */
public class Gaji13 {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    int jmlMasuk, jmlTdkMasuk, TotGaji, Gaji, potGaji;

    System.out.println("Massukkan Jumlah Gaji Anda ");
    Gaji=input.nextInt();
    System.out.println("Masukkan Jumlah Potongan Gaji Anda ");
    potGaji=input.nextInt();
    System.out.println("Masukkan Jumlah Hari Masuk Kerja Anda ");
    jmlMasuk=input.nextInt();
    System.out.println("Masukkan Jumlah Hari Tidak Masuk Kerja Anda ");
    jmlTdkMasuk=input.nextInt();

    TotGaji=(jmlMasuk*Gaji)-(jmlTdkMasuk*potGaji);

    System.out.println("Gaji yang anda terima adalah " + TotGaji);

    }
}