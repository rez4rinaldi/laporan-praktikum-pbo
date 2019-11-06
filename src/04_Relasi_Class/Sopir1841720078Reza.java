package jti.polinema.relasiclass.percobaan2_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Sopir1841720078Reza
{
    private String mNama;
    private int mBiaya;

    public Sopir1841720078Reza() {
    }
    
    public void setNamaReza(String mNama)
    {
        this.mNama = mNama;
    }
    
    public String getNamaReza()
    {
        return mNama;
    }
    
    public void setBiayaReza(int mBiaya)
    {
        this.mBiaya = mBiaya;
    }
    
    public int getBiayaReza()
    {
        return mBiaya;
    }
    
    public int hitungBiayaSopirReza(int hari)
    {
        return mBiaya * hari;
    }
}
