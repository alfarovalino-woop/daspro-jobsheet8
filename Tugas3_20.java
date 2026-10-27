import java.util.Scanner;

public class Tugas3_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();
        
        int totalBarangSeluruhToko = 0;
        int maxBarangToko = -1;
        int tokoTerbanyak = 1;
        
        for (int i = 1; i <= jumlahToko; i++) {
            System.out.print("Masukkan jumlah pelanggan untuk Toko " + i + ": ");
            int jumlahPelanggan = sc.nextInt();
            
            int totalBarangPerToko = 0;
            
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Masukkan jumlah barang yang dibeli pelanggan ke-" + j + ": ");
                int barangPelanggan = sc.nextInt();
                totalBarangPerToko += barangPelanggan;
            }
            
            System.out.println("Toko " + i + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangPerToko);
            
            totalBarangSeluruhToko += totalBarangPerToko;
            
            if (totalBarangPerToko > maxBarangToko) {
                maxBarangToko = totalBarangPerToko;
                tokoTerbanyak = i;
            }
        }
        System.out.println("Total barang seluruh toko: " + totalBarangSeluruhToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        
        sc.close();
    }
}