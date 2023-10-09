import java.util.Scanner;
/**
 * forVar3_13
 */
public class forVar3_13 {

    public static void main(String[] args) {
        
    Scanner sc13 = new Scanner(System.in);

    int bil, n;
    boolean berhenti = false;

    for (n = 0; !berhenti; n++) {
        System.out.println("Masukkan bilangan: ");
        bil = sc13.nextInt();
        System.out.println("Bilangan yang Anda masukkan: " + bil);
        if (bil < n) {
            berhenti = true;
        }
    }
    System.out.println("Program berakhir");
    }
}