import java.util.Scanner;
/**
 * HargaBayar13
 */
public class HargaBayar13 {

    public static void main(String[] args) {
        
    Scanner input =new Scanner(System.in);

    int harga, jumlah, jmlHal;
    double dis, total, bayar, jmlDis;
    String merk;

    System.out.println("Masukkan harga barang yang dibeli ");
    harga=input.nextInt();
    System.out.println("Masukkan Jumlah barang yang dibeli");
    jumlah=input.nextInt();
    System.out.println("Masukkan besaran Diskon");
    dis=input.nextDouble();
    System.out.println("Masukkan merk buku yang dibeli");
    merk=input.next();
    System.out.println("Masukkan jumlah halaman buku yang dibeli ");
    jmlHal=input.nextInt();


    total=harga*jumlah;
    jmlDis=total*dis;
    bayar=total-jmlDis;

    System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
    System.out.println("Jumlah yang harus dibayar adalah " +bayar);



    }
}
