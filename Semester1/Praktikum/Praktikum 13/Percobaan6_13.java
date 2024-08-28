import java.util.Scanner;
/**
 * Percobaan6_13
 */
public class Percobaan6_13 {

    public static void main(String[] args) {
        
        Scanner sc13 = new Scanner(System.in);

        int p,l,t,L,vol,kel;

        System.out.print("Masukkan panjang : ");
        p = sc13.nextInt();
        System.out.print("Masukkan lebar : ");
        l = sc13.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = sc13.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah " + vol);

        kel = keliling(t, p, l);
        System.out.println("Keliling balok adalah " + kel);


    }

    static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }

    static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }

    static int keliling (int t, int p, int l) {
        int keliling = (p*4)+(l*4)+(t*4);
        return keliling;
    }


}