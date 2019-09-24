package jti.polinema.relasiclass.tugas1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Pedagang1841720078Reza 
{
    private String mKtp;
    private String mNama;

    public Pedagang1841720078Reza() {
    }

    public Pedagang1841720078Reza(String mKtp, String mNama) 
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
        info += "Ktp           : " + mKtp + "\n";
        info += "Nama Pedagang : " + mNama + "\n";
        return info;
    }
}
