import java.util.Scanner;

public class UcapanTerimaKasih_13 {

    public static String PenerimaUcapan() {
        Scanner sc13 = new Scanner(System.in);
        System.out.print("Tuliskan Nama orang yang ingin Anda beri ucapan : ");
        String namaOrang = sc13.nextLine();
        sc13.close();
        return namaOrang;
    }

    public static String UcapanTambahan(String nama) {
        // Tambahkan ucapan tambahan sesuai kebutuhan
        String ucapanTambahan = "You have made a lasting impact on my life, and I am truly grateful for your guidance.";
        return ucapanTambahan;
    }

    public static void UcapanTerimaKasih() {
        String nama = PenerimaUcapan();
        String ucapanTambahan = UcapanTambahan(nama);
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n" +
                "You inspired in me a love for learning and made me feel like I could ask you anything.\n" +
                ucapanTambahan);
    }

    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}
