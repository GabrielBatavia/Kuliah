import java.util.Scanner;

public class Toko13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);

        System.out.println("Program Toko");

        // Input nama13 pelanggan
        System.out.print("Masukkan nama Anda: ");
        String namaPelanggan = sc13.nextLine();

        double totalHarga = 0;
        int totalItem = 0;
        double totalDiskon = 0;

        // Input produk13 yang dibeli
        char lanjut = 'y';
        while (lanjut == 'y' || lanjut == 'Y') {
            System.out.print("Masukkan produk yang Anda beli: ");
            String produk = sc13.nextLine();

            System.out.print("Banyaknya: ");
            int kuantitas = sc13.nextInt();

            System.out.print("Harga: ");
            double hargaSatuan = sc13.nextDouble();

            System.out.print("Diskon (%): ");
            double diskon = sc13.nextDouble();

            double subTotal = kuantitas * hargaSatuan;
            double diskonProduk = (subTotal * diskon / 100);

            totalItem += kuantitas;
            totalHarga += subTotal;

            totalDiskon += diskonProduk;

            System.out.print("Apakah Anda mau menambahkan produk (Y/N)? ");
            lanjut = sc13.next().charAt(0);
            sc13.nextLine(); // Buang karakter newline
        }

        // Input apakah pelanggan member13 atau bukan
        System.out.print("Apakah Anda punya kartu member (Y/N)? ");
        char isMember = sc13.next().charAt(0);

        sc13.close();

        double memberDiskon = 0;
        if (isMember == 'Y' || isMember == 'y') {
            if (totalHarga >= 200000) {
                memberDiskon = totalHarga * 0.1;
            } else {
                memberDiskon = totalHarga * 0.05;
            }
        }

        // Output hasil13
        System.out.println("-----------------Total Pembelian--------------");
        System.out.println("Nama pelanggan: " + namaPelanggan);
        System.out.println("Tipe: " + (isMember == 'Y' || isMember == 'y' ? "Member" : "Bukan Member"));
        System.out.println("Total item barang yang dibeli: " + totalItem);
        System.out.println("SubTotal                     = " + totalHarga);
        System.out.println("Total Diskon                 = " + (totalDiskon + memberDiskon));
        System.out.println("Total yang harus dibayar     = " + (totalHarga - totalDiskon - memberDiskon));
        System.out.println("----------------------------------------------");
    }
}
