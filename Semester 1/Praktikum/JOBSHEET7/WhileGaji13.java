import java.util.Scanner;

public class WhileGaji13 {

    public static void main(String[] args) {

        Scanner scan13 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double totalGajiKaryawan = 0;
        String jabatan;

        System.out.print("Masukkan jumlah karyawan : ");
        jumlahKaryawan = scan13.nextInt();

        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i + 1) + ": ");
            jabatan = scan13.next();

            if (jabatan.equalsIgnoreCase("DIREKTUR") || jabatan.equalsIgnoreCase("MANAJER") || jabatan.equalsIgnoreCase("KARYAWAN")) {
                System.out.print("Masukkan jumlah jam lembur : ");
                jumlahJamLembur = scan13.nextInt();

                if (jabatan.equalsIgnoreCase("direktur")) {
                    
                } else if (jabatan.equalsIgnoreCase("manajer")) {
                    totalGajiKaryawan += jumlahJamLembur * 100000;
                } else if (jabatan.equalsIgnoreCase("karyawan")) {
                    totalGajiKaryawan += jumlahJamLembur * 75000;
                }

                i++;
            } else {
                System.out.println("Jabatan yang Anda masukkan tidak valid. Silakan masukkan jabatan yang valid.");
            }
        }

        System.out.println("Total gaji lembur " + totalGajiKaryawan);
    }
}
