import java.util.Scanner;
/**
 * Pemilihan2Percobaan2_13
 */
public class Pemilihan2Percobaan2_13 {

    public static void main(String[] args) {
        
    Scanner sc13 = new Scanner(System.in);

    float sudut1, sudut2, sudut3, totalSudut;
    
    System.out.print("Masukkan besaran sudut pertama : ");
    sudut1 = sc13.nextFloat();
    
    System.out.print("Masukkan besaran sudut kedua : ");
    sudut2 = sc13.nextFloat();

    System.out.print("Masukkan besaran sudut Ketiga : ");
    sudut3 = sc13.nextFloat();

    totalSudut = sudut1 + sudut2 + sudut3;

    if (totalSudut == 180) {
        if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
            System.out.println("Segitiga Siku-Siku");
        } else {
            System.out.println("Bukan Segitiga Siku-Siku");
        }
    } else {
        System.out.println("Bukan segitiga");
    }


    }
}