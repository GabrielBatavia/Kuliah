import java.util.Scanner;
/**
 * PemilihanPercobaan213
 */
public class PemilihanPercobaan213 {

    public static void main(String[] args) {
        
        Scanner input13 = new Scanner (System.in);

        System.out.println("Nilai uas   : ");
        float uas = input13.nextFloat();
        System.out.println("Nilai uts   :");
        float uts = input13.nextFloat();
        System.out.println("Nilai kuis  : ");
        float kuis = input13.nextFloat();
        System.out.println("Nilai tugas : ");
        float tugas = input13.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir + " + total + " Sehingga " + message);

                
        if (total >= 0 || total <= 100) {
            if (total >= 80 &&  total <= 100) {
                System.out.println("Nilai A, Nilai Setara 4, Sangat Baik!");
            } else if (total >= 73 && total <= 80) {
                System.out.println("Nilai B+, Nilai Setara 3.5, Lebih dari Baik!");
            } else if (total >= 65 && total <= 73) {
                System.out.println("Nilai B, Nilai Setara 3, Baik!");
            } else if (total >= 60 && total <= 65) {
                System.out.println("Nilai C+, Nilai Setara 2.5, Lebih dari Cukup!");
            } else if (total >= 50 && total <= 60) {
                System.out.println("Nilai C, Nilai Setara 2, Cukup!");
            } else if (total >= 39 && total <= 50) {
                System.out.println("Nilai D, Nilai Setara 1, Kurang!");
            } else {
                System.out.println("Nilai E, Nilai Setara 0, Gagal!");
            }
        }

    }
}