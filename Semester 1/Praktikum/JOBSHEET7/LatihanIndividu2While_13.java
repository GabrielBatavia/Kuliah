import java.util.Scanner;
/**
 * LatihanIndividu2While_13
 */
public class LatihanIndividu2While_13 {

    public static void main(String[] args) {
        
    Scanner sc13 = new Scanner(System.in);

    int i = 25;
    int sum = 0;

    while (i >= 1) {
        sum += i;
        i--;
    }
    System.out.println("Sum of numbers from 25 to 1 is: " + sum);
    }
}