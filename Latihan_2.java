import java.util.Scanner;

public class Latihan_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaPembeli, kodeBarang, namaBarang;
        int jumlahBarang, harga = 0, totalBayar;

        System.out.print("Masukkan Nama Pembeli: ");
        namaPembeli = input.nextLine();

        System.out.print("Kode Barang (A01/B02/C02): ");
        kodeBarang = input.nextLine();

        System.out.print("Nama Barang (Hardisk/Monitor/Mouse): ");
        namaBarang = input.nextLine();

        System.out.print("Jumlah Barang: ");
        jumlahBarang = input.nextInt();

        System.out.println("\n=== DATA PEMBELIAN ===");
        System.out.println("Nama Pembeli : " + namaPembeli);
        System.out.println("Kode Barang  : " + kodeBarang);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Jumlah Barang: " + jumlahBarang);

        if (kodeBarang.equalsIgnoreCase("A01")
                && namaBarang.equalsIgnoreCase("Hardisk")) {
            harga = 70000;
        } else if (kodeBarang.equalsIgnoreCase("B02")
                && namaBarang.equalsIgnoreCase("Monitor")) {
            harga = 80000;
        } else if (kodeBarang.equalsIgnoreCase("C02")
                && namaBarang.equalsIgnoreCase("Mouse")) {
            harga = 50000;
        } else {
            System.out.println("Kode atau nama barang tidak valid!");
            input.close();
            return;
        }

        totalBayar = jumlahBarang * harga;

        System.out.println("Harga Satuan: Rp" + harga);
        System.out.println("Jumlah Bayar: Rp" + totalBayar);

        input.close();
    }
}