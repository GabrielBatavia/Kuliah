import java.util.Scanner;
/**
 * DoWhileCuti
 */
public class DoWhileCuti13 {

    public static void main(String[] args) {
        
    Scanner sc13 = new Scanner(System.in);

    int jatahCuti, jumlahHari;
    String konfirmasi;

    System.out.print("Jatah cuti : ");
    jatahCuti = sc13.nextInt();

    do {
        System.out.print("Apakah Anda ingin mengambil cuti (y/t)? ");
        konfirmasi = sc13.next();

        if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.print("Jumlah hari : ");
            jumlahHari = sc13.nextInt();

            if (jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("Sisa jatah cuti: " + jatahCuti);
            } else {
                System.out.println("Sisa jatah cuti Anda tidak mencukupi");
            }
        } else if (konfirmasi.equalsIgnoreCase("t")) {
            break; 
        }

    } while (jatahCuti > 0);
    
    }
}