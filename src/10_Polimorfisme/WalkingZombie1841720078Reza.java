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
        double bonus;
        switch (mLevel) 
        {
            case 1:
                bonus = mHealth * 0.2;
                mHealth += bonus;
                break;
            case 2:
                bonus = mHealth * 0.2;
                mHealth += bonus;
                break;
            case 3:
                bonus = mHealth * 0.2;
                mHealth += bonus;
                break;
            default:
                System.out.println("Level kelebihan!!");
                break;
        }
    }

    @Override
    public void destroyedReza() 
    {
        double kurang = 0.02 * mHealth;
        mHealth -= kurang;
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
