import java.util.Scanner;

public class Latihan_5 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama, gol, status;
            int jumlahAnak = 0, gajiPokok = 0, tunjSuamiIstri = 0, tunjAnak = 0;
            int gajiKotor = 0, pajak = 0, gajiBersih = 0;

            System.out.print("Masukan Nama : ");
            nama = input.nextLine();

            System.out.print("Golongan (2A/2B/3A/3B) : ");
            gol = input.nextLine();

            System.out.print("Status (Menikah/Belum Menikah) : ");
            status = input.nextLine();

            System.out.print("Jumlah Anak : ");
            jumlahAnak = input.nextInt();

            if (gol.equals("2A")) {
                gajiPokok = 1000000;
            } else if (gol.equals("2B")) {
                gajiPokok = 1500000;
            } else if (gol.equals("3A")) {
                gajiPokok = 2000000;
            } else if (gol.equals("3B")) {
                gajiPokok = 2500000;
            }

            if (status.equalsIgnoreCase("Menikah")) {
                tunjSuamiIstri = gajiPokok * 10 / 100;

                int anakDihitung = jumlahAnak;
                if (anakDihitung > 2) {
                    anakDihitung = 2;
                }
                tunjAnak = gajiPokok * 5 / 100 * anakDihitung;
            }

            gajiKotor = gajiPokok + tunjSuamiIstri + tunjAnak;
            pajak = gajiKotor * 10 / 100;
            gajiBersih = gajiKotor - pajak;

            System.out.println("\n\n\n");
            System.out.println("Nama           = " + nama);
            System.out.println("Gol            = " + gol);
            System.out.println("Status         = " + status);
            System.out.println("Jumlah Anak    = " + jumlahAnak);
            System.out.println("Gaji Pokok     = " + gajiPokok);
            System.out.println("Tunj Suami/Istri = " + tunjSuamiIstri);
            System.out.println("Tunjangan Anak = " + tunjAnak);
            System.out.println("Gaji Kotor     = " + gajiKotor);
            System.out.println("Pajak 10%      = " + pajak);
            System.out.println("Gaji Bersih    = " + gajiBersih);
        }
    }
}