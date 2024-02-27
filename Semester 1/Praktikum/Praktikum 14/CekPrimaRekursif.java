import java.util.Scanner;

public class CekPrimaRekursif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan suatu bilangan n: ");
        int n = input.nextInt();

        if (cekPrima(n, 2)) {
            System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }

    public static boolean cekPrima(int n, int divisor) {
        if (n <= 2) {
            return (n == 2);
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return cekPrima(n, divisor + 1);
    }
}