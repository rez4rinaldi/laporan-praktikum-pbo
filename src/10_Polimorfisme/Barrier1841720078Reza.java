package jti.polinema.polimorfisme.tugas._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Barrier1841720078Reza implements IDestroyable1841720078Reza
{
    private int mStrength;

    public Barrier1841720078Reza(int mStrength) 
    {
        this.mStrength = mStrength;
    }
    
    public void setStrengthReza(int mStrength) 
    {
        this.mStrength = mStrength;
    }

    public int getStrengthReza() 
    {
        return mStrength;
    }
    
    public void destroyReza(){
        destroyedReza();
    }

    @Override
    public void destroyedReza() {
         mStrength -= 9;
    }
    
    public String getBarrierInfoReza()
    {
        return "Barrier Strength = " + mStrength;
    }
}
