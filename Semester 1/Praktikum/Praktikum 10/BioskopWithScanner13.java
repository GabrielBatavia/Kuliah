import java.util.Scanner;

/**
 * BioskopWithScanner13
 */
public class BioskopWithScanner13 {

    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int choice = sc13.nextInt();
            sc13.nextLine(); // Membersihkan newline setelah memasukkan pilihan menu

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = sc13.nextLine();
                    boolean kursiTerisi = true;

                    while (kursiTerisi) {
                        System.out.print("Masukkan baris: ");
                        baris = sc13.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc13.nextInt();
                        sc13.nextLine();

                        if (isValidSeat(baris, kolom, penonton)) {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil disimpan.");
                            kursiTerisi = false;
                        } else {
                            System.out.println("Kursi sudah terisi. Silakan pilih kursi lain.");
                        }
                    }
                    break;
                case 2:
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String penontonData = penonton[i][j];
                        if (penontonData == null) {
                            penontonData = "***";
                        }
                        System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penontonData);
                    }
                }
                break;
                case 3:
                    System.out.println("Terima kasih. Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Pilih menu 1, 2, atau 3.");
            }

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc13.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    // Fungsi untuk memeriksa ketersediaan kursi
    private static boolean isValidSeat(int baris, int kolom, String[][] penonton) {
        if (baris >= 1 && baris <= penonton.length && kolom >= 1 && kolom <= penonton[0].length) {
            return penonton[baris - 1][kolom - 1] == null;
        }
        return false;
    }
}
