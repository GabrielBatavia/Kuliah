import java.util.Scanner;

public class tugas3 {

    public static void main(String[] args) {
        Scanner sc13 = new Scanner(System.in);
        System.out.print("Masukkan Nilai N (nilai N minimal 3)= ");
        int N = sc13.nextInt();

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N);
                } else {
                    System.out.print(" ");
                }
                System.out.print(" "); 
            }

            System.out.println(); //sout kosong
        }
    }
}