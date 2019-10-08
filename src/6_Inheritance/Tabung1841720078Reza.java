package jti.polinema.inheritance._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Tabung1841720078Reza extends Bangun1841720078Reza
{
    protected int mT;
    
    public void setSuperPhiReza(double mPhi)
    {
        super.mPhi = mPhi;
    }
    
    public void setSuperRReza(int mR)
    {
        super.mR = mR;
    }
    
    public void setTReza(int mT)
    {
        this.mT = mT;
    }
    
    public void volumeReza()
    {
        System.out.println("Volume Tabung adalah : " + (super.mPhi * super.mR * super.mR * this.mT));
    }
}
