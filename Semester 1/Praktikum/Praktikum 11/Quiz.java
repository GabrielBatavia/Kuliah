import java.util.Scanner;
import java.util.Random;

public class Quiz {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10) + 1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10):");
                int answer = scanner.nextInt();
                scanner.nextLine();
                if (answer == number) {
                    System.out.println("Selamat! Anda menebak dengan benar.");
                    success = true;
                } else if (answer < number) {
                    System.out.println("Tebakan Anda terlalu kecil. Coba lagi.");
                } else {
                    System.out.println("Tebakan Anda terlalu besar. Coba lagi.");
                }
            } while (!success);

            System.out.println("Apakah Anda ingin mengulang permainan (Y/y)?");
            menu = scanner.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');

        if (menu != 'Y' && menu != 'y') {
            System.out.println("Terima kasih telah bermain. Permainan berakhir.");
        }
    }
}
