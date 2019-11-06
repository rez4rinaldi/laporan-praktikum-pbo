package tugas;

/**
 *
 * @author Reza Rinaldi
 */
public class KitabHaditsArbain1841720078Reza
{
    private String mKitab;
    private String mPenulis;
    private String mPenerbit;
    private int mHalaman;
    
    public void judulKitabReza(String newValue)
    {
        mKitab = newValue;
    }
    
    public void namaPenulisReza(String newValue)
    {
        mPenulis = newValue;
    }
    
    public void namaPenerbitReza(String newValue)
    {
        mPenerbit = newValue;
    }
    
    public void jumlahHalamanDitambahPembukaReza(int newValue)
    {
        mHalaman = newValue;
    }
    
    public void cetakStatusReza()
    {
        System.out.println("Judul Kitab: " + mKitab);
        System.out.println("Nama Penulis: " + mPenulis);
        System.out.println("Nama Penerbit: " + mPenerbit);
        System.out.println("Jumlah Halaman: " + mHalaman);
    }
}
