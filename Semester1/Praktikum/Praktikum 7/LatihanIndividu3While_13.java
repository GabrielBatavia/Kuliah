import java.util.Scanner;

public class LatihanIndividu3While_13 {

    public static void main(String[] args) {

        Scanner sc13 = new Scanner(System.in);

        int i = 1;

        while (i <= 50) {
            if (i % 3 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++; 
        }
    }
}
