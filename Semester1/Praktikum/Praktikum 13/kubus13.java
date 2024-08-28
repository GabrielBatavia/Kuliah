import java.util.Scanner;

public class kubus13 {
    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus : ");
        int sisi = sc13.nextInt();
        System.out.println("Volume : " + volume(sisi));
        System.out.println("Luas Permukaan : " + luasper(sisi));
    }

    public static int volume(int sisi) {
        int vol = sisi * sisi * sisi;
        return vol;
    }

    public static int luasper(int sisi) {
        int luas = 6 * sisi * sisi;
        return luas;
    }
}