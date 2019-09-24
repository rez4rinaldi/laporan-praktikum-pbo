package jti.polinema.relasiclass.tugas1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Pemesan1841720078Reza 
{
    private Kitab1841720078Reza mKitab;
    private Resi1841720078Reza mResi;
    private int mTotalKitab;
    private int mBayar;

    public Pemesan1841720078Reza() {
    }

    public Pemesan1841720078Reza(int mTotalKitab, int mBayar) 
    {
        this.mTotalKitab = mTotalKitab;
        this.mBayar = mBayar;
    }
    
    public void setKitabReza(Kitab1841720078Reza mKitab) 
    {
        this.mKitab = mKitab;
    }

    public Kitab1841720078Reza getKitabReza() 
    {
        return mKitab;
    }

    public void setResiReza(Resi1841720078Reza mResi)
    {
        this.mResi = mResi;
    }

    public Resi1841720078Reza getResiReza()
    {
        return mResi;
    }

    public void setTotalKitabReza(int mTotalKitab) 
    {
        this.mTotalKitab = mTotalKitab;
    }

    public int getTotalKitabReza() 
    {
        return mTotalKitab;
    }
    
    public void setBayarReza(int mBayar)
    {
        this.mBayar = mBayar;
    }

    public int getBayarReza() 
    {
        return mBayar;
    }
    
    public int hitungBiayaReza()
    {
        return mTotalKitab * mBayar;
    }
    
    public void infoReza()
    {
        System.out.println("Total Kitab : " + mTotalKitab);
    }
}
