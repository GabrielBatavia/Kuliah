import java.util.Scanner;
/**
 * latihanIndividu1_13
 */
public class latihanIndividu1_13 {

    public static void main(String[] args) {
        
    Scanner sc13 = new Scanner (System.in);

    int bil1, bil2, bil3;

    System.out.print("Masukkan bilangan 1 : ");
    bil1 = sc13.nextInt();

    System.out.print("Masukkan bilangan 2 : ");
    bil2 = sc13.nextInt();

    System.out.print("Masukkan bilangan 3 : ");
    bil3 = sc13.nextInt();

    if (bil1 > bil2) {
        if (bil1 > bil3){
            System.out.print("Bilangan terbesar : " + bil1);
        } else {
            System.out.println("Bilangan terbesar : " + bil3);
        }
    } else if (bil2 > bil3) {
        System.out.print("Bilangan terbesar : " + bil2);
    } else {
        System.out.print("Bilangan terbesar : " + bil3);
    }
    

    }
}