package jti.polinema.relasiclass.percobaan4_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Penumpang1841720078Reza 
{
    private String mKtp;
    private String mNama;

    public Penumpang1841720078Reza(String mKtp, String mNama)
    {
        this.mKtp = mKtp;
        this.mNama = mNama;
    }
    
    public void setKtpReza(String mKtp)
    {
        this.mKtp = mKtp;
    }
    
    public String getKtpReza()
    {
        return mKtp;
    }
    
    public void setNamaReza(String mNama)
    {
        this.mNama = mNama;
    }
    
    public String getNamaReza()
    {
        return mNama;
    }
    
    public String infoReza()
    {
        String info = "";
        info += "Ktp: " + mKtp + "\n";
        info += "Nama: " + mNama + "\n";
        return info;
    }
}
