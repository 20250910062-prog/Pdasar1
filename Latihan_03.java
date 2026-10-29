import java.util.Scanner;

public class Latihan_03 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama, gol, status;
            int jumlahAnak = 0, gajiPokok = 0, pajak = 0, totalGaji = 0;

            System.out.print("Masukan Nama : ");
            nama = input.nextLine();

            System.out.print("Golongan (2A/2B/3A/3B) : ");
            gol = input.nextLine();

            System.out.print("Status : ");
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

            pajak = gajiPokok * 10 / 100;
            totalGaji = gajiPokok - pajak;

            System.out.println("\n\n\n");
            System.out.println("Nama        = " + nama);
            System.out.println("Gol         = " + gol);
            System.out.println("Gaji Pokok  = " + gajiPokok);
            System.out.println("Pajak 10%   = " + pajak);
            System.out.println("Total Gaji  = " + totalGaji);
        }
    }
}