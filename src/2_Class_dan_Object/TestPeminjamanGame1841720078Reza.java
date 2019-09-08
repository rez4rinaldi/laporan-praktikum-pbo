package tugasjobhseet2;

/**
 *
 * @author Reza Rinaldi
 */
public class TestPeminjamanGame1841720078Reza
{
    public static void main(String[] args) 
    {
        PeminjamanGame1841720078Reza pg1 = new PeminjamanGame1841720078Reza();
        PeminjamanGame1841720078Reza pg2 = new PeminjamanGame1841720078Reza();
        PeminjamanGame1841720078Reza pg3 = new PeminjamanGame1841720078Reza();
        
        pg1.id = "ID554";
        pg1.namaMember = "Abu Abdurrahman";
        pg1.namaGame = "Balapan Kuda";
        pg1.harga = 5000;
        pg1.tampilDataPeminjamReza();
        
        //menampilkan dan mengisi argumen untuk menambahkan total harga yang harus dibayar
        System.out.println("Harga yang harus dibayar : " + pg1.totalHargaYangDibayar(3));
        
        System.out.println();
        
        pg2.id = "ID555";
        pg2.namaMember = "Ummu Salamah";
        pg2.namaGame = "Memanah";
        pg2.harga = 4000;
        pg2.tampilDataPeminjamReza();
        
        //menampilkan dan mengisi argumen untuk menambahkan total harga yang harus dibayar
        System.out.println("Harga yang harus dibayar : " + pg2.totalHargaYangDibayar(5));
        
        System.out.println();
        
        pg3.id = "ID556";
        pg3.namaMember = "Abu Abdillah";
        pg3.namaGame = "Balapan Renang";
        pg3.harga = 6000;
        pg3.tampilDataPeminjamReza();
        
        //menampilkan dan mengisi argumen untuk menambahkan total harga yang harus dibayar
        System.out.println("Harga yang harus dibayar : " + pg3.totalHargaYangDibayar(2));
    }
}
