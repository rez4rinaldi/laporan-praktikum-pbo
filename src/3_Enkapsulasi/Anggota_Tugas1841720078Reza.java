package tugasjobsheet3;

/**
 *
 * @author Reza Rinaldi
 */
public class Anggota_Tugas1841720078Reza 
{
    private int mJumlah;
    private int mLimit;
    private String mNomorKTP;
    private String mNama;

    Anggota_Tugas1841720078Reza(String nomorKtp, String nama, int limit)
    {
        this.mNomorKTP = nomorKtp;
        this.mNama = nama;
        this.mLimit = limit;
        this.mJumlah = 0;
    }
    
    public String getNomorKtpReza()
    {
        return mNomorKTP;
    }
    
    public String getNamaReza() 
    {
        return mNama;
    }

    public int getLimitPinjamanReza()
    {
        return mLimit;
    }

    public void pinjamReza(int pinjam)
    {
        if (pinjam < mLimit)
        {
            mJumlah = pinjam;
        } 
        else 
        {
            System.out.println("Maaf, Jumlah pinjaman melebihi limit.");
        }
    }

    public int getJumlahPinjamanReza() 
    {
        return mJumlah;
    }

    public void angsurReza(int uang)
    {
        if (uang >= (mJumlah * 0.1))
        {
            mJumlah -= uang;
        } 
        else 
        {
            System.out.println("Maaf, angsuran harus 10% dari jumlah uang pinjaman");
        }
    }
}