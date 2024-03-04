import java.util.Scanner;
/**
 * IfKondisi13
 */
public class IfKondisi13 {

    public static void main(String[] args) {
        
        Scanner sc13 = new Scanner(System.in);

        System.out.print("Masukkan Suhu : ");
        int suhu = sc13.nextInt();

        if (suhu < 16) {
            System.out.println("Silahkan menggunakan jaket");
        }
        if (suhu < 20) {
            System.out.println("Silahkan pakai baju tebal");
        }
        else {
            System.out.println("Silahkan pakai topi");
        }

    }
}