import java.util.Scanner;
public class Kubus09 {

    public static int hitungVolume(int sisi) {
        int vol = sisi * sisi * sisi;
        return vol;
    }

    public static int hitungLuasPermukaan(int sisi) {
        int lP = 6 * (sisi * sisi); 
        return lP;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = sc.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        // Menampilkan hasil
        System.out.println("Volume kubus: " + volume);
        System.out.println("Luas permukaan kubus: " + luasPermukaan);
    }
}
