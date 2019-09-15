package tugasjobsheet3;
import java.util.Scanner;
/**
 *
 * @author Reza Rinaldi
 */
public class TestKoperasi1841720078Reza
{
    public static void main(String[] args) 
    {   
        Scanner sc = new Scanner(System.in);
        
        Anggota_Tugas1841720078Reza donny = new Anggota_Tugas1841720078Reza("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNamaReza());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjamanReza());
        
        //Tugas no. 4
//        System.out.println("\nMeminjam uang 10.000.000...");
//        donny.pinjamReza(10000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanReza());
//        
//        System.out.println("\nMeminjam uang 4.000.000...");
//        donny.pinjamReza(4000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanReza());
//        
//        System.out.println("\nMembayar angsuran 1.000.000");
//        donny.angsurReza(1000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanReza());
//        
//        System.out.println("\nMembayar angsuran 3.000.000");
//        donny.angsurReza(3000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanReza());
        
        //Tugas no. 5
//        System.out.println("\nMeminjam uang 10.000.000...");
//        donny.pinjamReza(10000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanReza());
//
//        System.out.println("\nMeminjam uang 4.000.000...");
//        donny.pinjamReza(4000000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanReza());
//
//        System.out.println("\nMembayar angsuran 1.500.000");
//        donny.angsurReza(1500000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanReza());
//
//        System.out.println("\nMembayar angsuran 500.000");
//        donny.angsurReza(500000);
//        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjamanReza());
        
        // Tugas no. 6
        System.out.println();
        System.out.print("Masukkan jumlah pinjaman : ");
        int pinjam = sc.nextInt();
        donny.pinjamReza(pinjam);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjamanReza());
        System.out.println();

        System.out.print("Masukkan jumlah pinjaman : ");
        int pinjem = sc.nextInt();
        donny.pinjamReza(pinjem);
        System.out.println("Jumlah pinjaman saat ini : " + donny.getJumlahPinjamanReza());
        System.out.println();
        
        System.out.print("Masukkan jumlah angsuran : ");
        int angsur = sc.nextInt();
        donny.angsurReza(angsur);
        System.out.println("Jumlah pinjaman saat ini " + donny.getJumlahPinjamanReza());
        System.out.println();
        
        System.out.print("Masukkan angsuran : ");
        int angsurn = sc.nextInt();
        donny.angsurReza(angsurn);
        System.out.println("Jumlah pinjaman saat ini " + donny.getJumlahPinjamanReza());
    }
}