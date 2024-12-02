import java.util.Scanner;
public class hitungTotalHarga09 {
    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
    
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        
        if (kodePromo.equalsIgnoreCase("DISKON50")) {
            hargaTotal *= 0.5; 
        } else if (kodePromo.equalsIgnoreCase("DISKON30")) {
            hargaTotal *= 0.7;
        } else if (!kodePromo.equals("NONE")) {
            System.out.println("Kode promo " + kodePromo + " tidak valid.");
        }
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah jenis menu yang ingin anda pesan: ");
        int jumlahJenisMenu = sc.nextInt();

        for (int i = 0; i < jumlahJenisMenu; i++) {
            System.out.println("Masukkan nomor menu untuk pesanan ke-" + (i + 1) + ": ");
            int pilihanMenu = sc.nextInt();
            System.out.println("Masukkan jumlah item untuk pesanan ke-" + (i + 1) + ": ");
            int banyakItem = sc.nextInt();
            sc.nextLine();
            System.out.println("Masukkan kode promo (jika tidak ada, masukkan NONE): ");
            String kodePromo = sc.nextLine();

        int totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, kodePromo);

        System.out.println("Total harga untuk pesanan anda: Rp" + totalHarga);
        }
    }
}
