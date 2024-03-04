import java.util.Scanner;

public class nestedLoop_2341720184 {

    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));

            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Masukkan suhu untuk Kota ke-" + (i + 1) + " di Hari ke-" + (j + 1) + ": ");
                temps[i][j] = sc13.nextDouble();
            }
            System.out.println();
        }

        // Mencetak array dan nilai rata-rata masing-masing kota
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            double totalSuhu = 0;

            for (double suhu : temps[i]) {
                System.out.print(suhu + " ");
                totalSuhu += suhu;
            }

            double rataRata = totalSuhu / temps[i].length;
            System.out.println("Rata-rata: " + rataRata);
        }
    }
}
