import java.util.Scanner;

public class latihanIndividu2_13 {

    public static void main(String[] args) {
        
        Scanner sc13 = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        float hargaBuku;
        double diskon = 0, hargaNormal = 0, potongan1 = 0, potongan2 = 0, totalHarga1 = 0, totalHarga2 = 0, tambahanPotongan2 = 0, potongan3 = 0;

        System.out.print("Masukkan Jenis Buku yang Anda Beli : ");
        jenisBuku = sc13.nextLine();

        System.out.print("Masukkan Jumlah Buku yang Anda Beli : ");
        jumlahBuku = sc13.nextInt();

        System.out.print("Masukkan Harga Buku Anda : ");
        hargaBuku = sc13.nextFloat();

        hargaNormal = hargaBuku * jumlahBuku;
        
        if (jenisBuku.equalsIgnoreCase("kamus")) {
            diskon = hargaNormal * 0.1; 
            potongan1 = hargaNormal - diskon;

            if (jumlahBuku > 2) {
                diskon = potongan1 * 0.02; 
                totalHarga1 = potongan1 - diskon;
                System.out.println("Total Harga yang harus Anda Bayar adalah : " + totalHarga1 + " Dengan Diskon yang Anda dapatkan : " + diskon);

            } else {
                System.out.println("Harga yang harus Anda bayarkan adalah : " + potongan1 + " Dengan Diskon yang Anda dapatkan : " + diskon);
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            diskon = hargaNormal * 0.07; 
            potongan2 = hargaNormal - diskon;


            if (jumlahBuku > 3) {
                diskon = potongan2 * 0.02; 
                totalHarga2 = potongan2 - diskon;
                System.out.println("Total Harga yang harus Anda Bayar adalah : " + totalHarga2 + " Dengan Diskon yang Anda dapatkan : " + diskon);

            } else {
                diskon = potongan2 * 0.01; 
                tambahanPotongan2 = potongan2 - diskon;
                System.out.println("Total Harga yang harus Anda Bayar adalah : " + tambahanPotongan2 + " Dengan Diskon yang Anda dapatkan : " + diskon);
            }

        } else if (jumlahBuku > 3 && !jenisBuku.equalsIgnoreCase("kamus") && !jenisBuku.equals("novel")) {
            diskon = hargaNormal * 0.05; 
            potongan3 = hargaNormal - diskon;

            System.out.println("Total Harga yang harus Anda Bayar adalah : " + potongan3 + " Dengan Diskon yang Anda dapatkan : " + diskon);
        } else {
             System.out.println("Total Harga yang harus Anda Bayar adalah : " + hargaNormal + " Dengan Diskon yang Anda dapatkan : " + diskon);
        }

    }
}
