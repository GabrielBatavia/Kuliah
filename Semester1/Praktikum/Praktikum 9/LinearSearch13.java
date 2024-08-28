import java.util.Scanner;

public class LinearSearch13 {

    public static void main(String[] args) {

        Scanner sc13 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int jumlahArray = sc13.nextInt();

        int[] arrayInt = new int[jumlahArray];
        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + (i) + " : ");
            arrayInt[i] = sc13.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari: ");
        int keydicari = sc13.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == keydicari) {
                hasil = i;
                break;
            }
        }

        if (hasil != -1) {
            System.out.println("Key ada di posisi indeks ke-" + hasil);
        } else {
            System.out.println("Key tidak ditemukan");
        }
    }
}
