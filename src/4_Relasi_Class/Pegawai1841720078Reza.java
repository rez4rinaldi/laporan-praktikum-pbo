package jti.polinema.relasiclass.percobaan3_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Pegawai1841720078Reza
{
    private String mNip;
    private String mNama;

    public Pegawai1841720078Reza(String mNip, String mNama)
    {
        this.mNip = mNip;
        this.mNama = mNama;
    }
    
    public void setNipReza(String mNip)
    {
        this.mNip = mNip;
    }
    
    public String getNipReza()
    {
        return mNip;
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
        info += "Nip: " + this.mNip + "\n";
        info += "Nama: " + this.mNama + "\n";
        return info;
    }
}
