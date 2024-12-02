import java.util.Scanner;

public class MarianaCafe09 {

    static int[][] penjualan = new int[5][7]; 
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    // a. Fungsi untuk meninputkan data penjualan
    public static void inputDataPenjualan() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    // b. Fungsi untuk menampilkan seluruh data penjualan dari hari pertama hingga hari terakhir
    public static void tampilkanDataPenjualan() {
        System.out.println("\nData Penjualan:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Penjualan " + menu[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.println("  Hari ke-" + (j + 1) + ": " + penjualan[i][j]);
            }
        }
    }

    // c. Fungsi untuk menampilkan Menu yang memiliki penjualan tertinggi
    public static void tampilkanMenuPenjualanTertinggi() {
        String menuTerlaris = menu[0]; // Asumsikan menu pertama adalah yang terlaris
        int totalPenjualanTerlaris = 0;

        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }

            if (totalPenjualan > totalPenjualanTerlaris) {
                totalPenjualanTerlaris = totalPenjualan;
                menuTerlaris = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris + " (Total: " + totalPenjualanTerlaris + ")");
    }

    // d. Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu
    public static void tampilkanRataRataPenjualan() {
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = (double) totalPenjualan / 7;
            System.out.println(menu[i] + ": " + rataRata);
        }
    }

    // Fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input data penjualan
        System.out.println("Masukkan data penjualan:");
        inputDataPenjualan();

        // Menampilkan seluruh data penjualan
        tampilkanDataPenjualan();

        // Menampilkan menu dengan penjualan tertinggi
        tampilkanMenuPenjualanTertinggi();

        // Menampilkan rata-rata penjualan untuk setiap menu
        tampilkanRataRataPenjualan();
    }
}
