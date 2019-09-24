package jti.polinema.relasiclass.percobaan1_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Processor1841720078Reza
{
    private String mMerk;
    private double mCache;

    public Processor1841720078Reza() {
    }

    public Processor1841720078Reza(String mMerk, double mCache)
    {
        this.mMerk = mMerk;
        this.mCache = mCache;
    }
    
    public void setMerkReza(String mMerk)
    {
        this.mMerk = mMerk;
    }
    
    public String getMerkReza()
    {
        return mMerk;
    }
    
    public void setCacheReza(double mCache)
    {
        this.mCache = mCache;
    }
    
    public double getCachekReza()
    {
        return mCache;
    }

    public void infoReza() 
    {
        System.out.printf("Merk Processor = %s\n", mMerk);
        System.out.printf("Cache Memory = %.2f\n", mCache);
    }
}