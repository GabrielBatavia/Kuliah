import java.util.Scanner;
/**
 * forVar2
 */
public class forVar2_13 {

    public static void main(String[] args) {
        
    Scanner sc13 = new Scanner(System.in);

    int bil;
    boolean berhenti = false;

    for (; !berhenti;) {
        System.out.print("Masukkan bilangan: ");
        bil = sc13.nextInt();
        System.out.print("Bilangan yang Anda masukkan: " + bil);
        if (bil == 0) {
            berhenti = true;
        }
    }
        System.out.println("Program berakhir");
    }
}