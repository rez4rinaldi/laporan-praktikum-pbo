package jti.polinema.polimorfisme.tugas._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class WalkingZombie1841720078Reza extends Zombie1841720078Reza
{
    public WalkingZombie1841720078Reza(int mHealth, int mLevel)
    {
        this.mHealth = mHealth;
        this.mLevel = mLevel;
    }

    @Override
    public void healReza() 
    {
        if (this.mLevel == 1) 
        {
            mHealth += mHealth * 0.2;
        } 
        
        else if (this.mLevel == 2) 
        {
            mHealth += mHealth * 0.3;
        } 
        
        else if(this.mLevel == 3)
        {
            mHealth += mHealth * 0.4;
        } 
    }

    @Override
    public void destroyedReza() 
    {
        this.mHealth -= this.mHealth * 20 / 100;
    }
    
    @Override
    public String getZombieInfoReza()
    {
        String info = "Walking Zombie Data =\n";
        info += "Health = " + mHealth + "\n";
        info += "Level = " + mLevel + "\n";
        return info;
    }
}
