import java.util.Scanner;
/**
 * Pemilihan3Percobaan3_13
 */
public class Pemilihan3Percobaan3_13 {

    public static void main(String[] args) {
        
    Scanner sc13 = new Scanner(System.in);

    String kategori;
    int penghasilan, gajiBersih;
    double pajak = 0;

    System.out.print("Masukkan kategori : ");
    kategori = sc13.nextLine();
    System.out.print("Masukkan Besarnya Penghasilan : ");
    penghasilan = sc13.nextInt();

    if (kategori.equalsIgnoreCase("pekerja")) {
        if (penghasilan <= 2000000)
            pajak = 0.1;
        else if (penghasilan <= 3000000)
            pajak = 0.15;
        else
            pajak = 0.2;
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("Pengasilan Bersih : " + gajiBersih);
    } else if (kategori.equals("pebisnis")) {
        if (penghasilan <= 2500000)
            pajak = 0.15;
        else if (penghasilan <= 3500000)
            pajak = 0.2;
        else
            pajak = 0.25;
        gajiBersih = (int) (penghasilan - (pajak * penghasilan));
        System.out.print("Pengasilan Bersih : " + gajiBersih);
    } else {
        System.out.println("Kategori yang dimasukkan salah");
    }



    }
}