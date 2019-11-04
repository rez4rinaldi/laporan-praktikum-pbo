package jti.polinema.polimorfisme.tugas._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public abstract class Zombie1841720078Reza implements IDestroyable1841720078Reza
{
    protected int mHealth;
    protected int mLevel;
    
    public abstract void healReza(); 

    @Override
    public abstract void destroyedReza();
    
    public String getZombieInfoReza()
    {
        return "";
    }
}
