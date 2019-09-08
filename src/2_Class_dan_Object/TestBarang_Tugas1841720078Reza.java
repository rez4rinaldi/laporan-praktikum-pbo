package tugasjobhseet2;
import java.util.Scanner;
/**
 *
 * @author Reza Rinaldi
 */
public class TestBarang_Tugas1841720078Reza 
{
    public static void main(String[] args) 
    {
        Barang_Tugas1841720078Reza brg = new Barang_Tugas1841720078Reza();
        Scanner sc = new Scanner(System.in);
        Scanner ac = new Scanner(System.in);
        
        System.out.print("Kode : ");
        brg.kode = sc.nextLine();
        System.out.print("Nama Barang : ");
        brg.namaBrg = sc.nextLine();
        System.out.print("Harga Dasar : ");
        brg.hargaDsr = ac.nextInt();
        System.out.print("Diskon : ");
        brg.diskon = ac.nextFloat();
        System.out.print("Harga Jual : " + brg.hitungHargaJualReza());
        
        System.out.println();
        System.out.println();
        
        brg.tampilDataReza();
    }
}
