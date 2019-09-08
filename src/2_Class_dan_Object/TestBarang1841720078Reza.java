package barang;

/**
 *
 * @author Reza Rinaldi
 */
public class TestBarang1841720078Reza
{
    public static void main(String[] args)
    {
        Barang1841720078Reza brg1 = new Barang1841720078Reza();
        
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarangReza();
        
        //menampilkan dan mengisi argumen untuk menambahkan stok barang
        System.out.println("Stok Baru adalah : " + brg1.tambahStokReza(20));
    }
}