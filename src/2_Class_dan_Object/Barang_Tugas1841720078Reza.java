package tugasjobhseet2;

/**
 *
 * @author Reza Rinaldi
 */
public class Barang_Tugas1841720078Reza 
{
    public String kode;
    public String namaBrg;
    public int hargaDsr;
    public float diskon;

    public float hitungHargaJualReza() 
    {
        return hargaDsr - (diskon * hargaDsr / 100);
    }

    public void tampilDataReza() 
    {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama Barang : " + namaBrg);
        System.out.println("Harga dasar : " + hargaDsr);
        System.out.println("Diskon      : " + diskon);
        System.out.println("Harga Jual  : " + hitungHargaJualReza());
    }
}