package jti.polinema.relasiclass.percobaan2_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Mobil1841720078Reza 
{
    private String mMerk;
    private int mBiaya;

    public Mobil1841720078Reza() {
    }
    
    public void setNamaReza(String mMerk)
    {
        this.mMerk = mMerk;
    }
    
    public String getNamaReza()
    {
        return mMerk;
    }
    
    public void setBiayaReza(int mBiaya)
    {
        this.mBiaya = mBiaya;
    }
    
    public int getBiayaReza()
    {
        return mBiaya;
    }
    
    public int hitungBiayaMobilReza(int hari)
    {
        return mBiaya * hari;
    }
}
