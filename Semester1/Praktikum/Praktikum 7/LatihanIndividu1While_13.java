import java.util.Scanner;
/**
 * LatihanIndividu1While_13
 */
public class LatihanIndividu1While_13 {

    public static void main(String[] args) {
        
    Scanner sc13 = new Scanner(System.in);

    String nama, jenisKelamin;
    
    int i = 1;

    while (i <= 30) {
        
        System.out.print("Masukkan nama mahasiswa : ");
        nama = sc13.nextLine();

        System.out.print("Masukkan jenis Kelamin : ");
        jenisKelamin = sc13.nextLine();

        if (jenisKelamin.equalsIgnoreCase("perempuan")) {
            System.out.println("Nama mahasiswa adalah : " + nama);
        } else {
            continue;
        }

        i++;
    }

    }
}