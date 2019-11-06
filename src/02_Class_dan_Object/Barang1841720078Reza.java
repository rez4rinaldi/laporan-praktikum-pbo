package barang;

/**
 *
 * @author Reza Rinaldi
 */
public class Barang1841720078Reza
{
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarangReza()
    {
        System.out.println("Nama Barang      : " + namaBrg);
        System.out.println("Jenis Barang     : " + jenisBrg);
        System.out.println("Stok             : " + stok);
    }
    
    //method dengan argumen dan nilai balik (return)
    public int tambahStokReza(int brgMasuk)
    {
        int stokBaru = stok + brgMasuk;
        return stokBaru;
    }
}