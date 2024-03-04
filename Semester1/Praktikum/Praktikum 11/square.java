import java.util.Scanner;
/**
 * square
 */
public class square {

    public static void main(String[] args) {
        
    Scanner sc13 = new Scanner(System.in);

    System.out.print("Masukkan nilai N =");
    int N = sc13.nextInt();

    for (int i = 0; i <= N; i++) {
        System.out.print("*");
    }

    System.out.println();

     for (int iOuter = 1; iOuter <= N; iOuter++) {
            for (int i = 1; i<=N; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}