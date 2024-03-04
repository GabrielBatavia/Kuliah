import java.util.Scanner;
/**
 * suhu13
 */
public class suhu13 {

    public static void main(String[] args) {
        
    Scanner sc13 = new Scanner(System.in);

    int suhu;
    char hujan;

    System.out.print("Masukkan suhu : ");
    suhu = sc13.nextInt();

    System.out.print("Apakah hujan (y atau t) ? : ");
    hujan = sc13.next().charAt(0);

    if (suhu > 27) {
        System.out.println("Memakai dress");
        if (hujan == 'y') {
            System.out.println("Membawa payung");
        } else {
            System.out.println("Memakai sunscreen");
        }
    } else {
        System.out.println("Memakai celana panjang");
    }

    }
}