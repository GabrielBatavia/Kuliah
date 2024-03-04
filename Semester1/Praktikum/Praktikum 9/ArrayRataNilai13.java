import java.util.Scanner;

public class ArrayRataNilai13 {

    public static void main(String[] args) {
        
        Scanner sc13 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc13.nextInt();

        int[] nilaiMhs = new int[jumlahMahasiswa];
        double totalLulus = 0; 
        double rataLulus;
        double totalTidakLulus = 0; 
        double rataTidakLulus;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc13.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
            } else {
                totalTidakLulus += nilaiMhs[i];
            }
        }

        rataLulus = totalLulus / jumlahMahasiswa; 
        rataTidakLulus = totalTidakLulus / jumlahMahasiswa; 
        System.out.println("Rata-rata nilai lulus = " + rataLulus);
        System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
    }
}
