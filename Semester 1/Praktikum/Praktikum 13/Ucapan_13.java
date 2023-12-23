import java.util.Scanner;
/**
 * Ucapan_13
 */
public class Ucapan_13 {

    public static String PenerimaUcapan() {
        Scanner sc13 = new Scanner(System.in);
        System.out.print("Tuliskan Nama orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc13.nextLine();
        sc13.close();
        return namaOrang;
    }

    public static void main(String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " +nama+"\nMay the force be with you.");
    }

}