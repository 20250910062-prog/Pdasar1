import java.util.Scanner;

public class latihan_01{
    public static void main (String []args) {
    Scanner input = new Scanner (System.in);
    String Nama Pembeli,Kode Barang,Nama Barang;
    int Jumlah=0, Harga Satuan=0, JBayar;
    
    System.out.print("Masukan Nama :");
    Nama = input.nextLine();
    System.out.print("Pilih jurusan Bandung / Jakarta):");
    Jurusan = input.nextLine();
    System.out.print("Kelas Bisnis / Ekonomi) : ");
    Kelas = input.nextLine();
    System.out.print("Jumlah Tiket : ");
    JTiket = input.nextInt();

    System.out.print("\n\n\n");
    System.out.print( "Nama Pembeli :"+ Nama);
    System.out.print("Jurusan :" + Jurusan);
    System.out.print("Kelas :" + Kelas);
    System.out.print("Jumlah Tiket :" + JTiket);
if (Jurusan.equals("Bandung") && Kelas.equals("Bisnis")){Harga= 40000;}
else if (Jurusan.equals("Bandung") && Kelas.equals ("Ekonomi")){Harga=20000;}
else if (Jurusan.equals("Jakarta") && Kelas.equals ("Ekonomi")){Harga=40000;}

System.out.print("Harga :" + String.valueOf(Harga));
System.out.print("Jumlah Bayar :"  + String.valueOf(JTiket+Harga));   
}
}