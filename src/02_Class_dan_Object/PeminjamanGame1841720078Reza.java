package tugasjobhseet2;

/**
 *
 * @author Reza Rinaldi
 */
public class PeminjamanGame1841720078Reza 
{
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga;
    
    public void tampilDataPeminjamReza()
    {
        System.out.println("Id Member                : " + id);
        System.out.println("Nama Member              : " + namaMember);
        System.out.println("Nama Game                : " + namaGame);
        System.out.println("Harga                    : " + harga);
    }
    
    public int totalHargaYangDibayar(int lamaSewa)
    {
        int hargaYangDibayar = harga * lamaSewa;
        return hargaYangDibayar;
    }
}
