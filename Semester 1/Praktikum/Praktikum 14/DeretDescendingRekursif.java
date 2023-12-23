public class DeretDescedingRekrusif {
    public static void main(String[] args) {
        int n = 5; // Ganti dengan nilai n sesuai yang diinginkan
        System.out.println("Menggunakan Fungsi Rekursif:");
        cetakBilanganRekursif(n);
        System.out.println("\nMenggunakan Fungsi Iteratif:");
        cetakBilanganIteratif(n);
    }

    public static void cetakBilanganRekursif(int n) {
        if (n >= 0) {
            cetakBilanganRekursif(n - 1);
            System.out.println(n);
        }
    }

    public static void cetakBilanganIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
