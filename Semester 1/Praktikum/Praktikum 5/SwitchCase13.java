import java.util.Scanner;
/**
 * SwitchCase13
 */
public class SwitchCase13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan angka: ");
        angka = sc.nextInt();

        switch (angka) {
            case 1:
                System.out.println("Hari senin");
                break;
            case 2:
                System.out.println("Hari Selasa");
                break;
            case 3:
                System.out.println("Hari Rabu");
                break;
            case 4:
                System.out.println("Hari kamis");
                break;
            case 5:
                System.out.println("Hari Jumat");
                break;
            case 6:
                System.out.println("Hari Sabtu");
                break;
            case 7:
                System.out.println("Hari Minggu");
                break;

            default:
                System.out.println("Maaf, angka yang Anda masukkan salah");
                break;
        }

    }
}