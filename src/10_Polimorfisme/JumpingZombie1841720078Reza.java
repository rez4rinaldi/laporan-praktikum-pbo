package jti.polinema.polimorfisme.tugas._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class JumpingZombie1841720078Reza extends Zombie1841720078Reza 
{
    public JumpingZombie1841720078Reza(int mHealth, int mLevel) 
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
                bonus = mHealth * 0.3;
                mHealth += bonus;
                break;
            case 2:
                bonus = mHealth * 0.4;
                mHealth += bonus;
                break;
            case 3:
                bonus = mHealth * 0.5;
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
        double kurang = 0.01 * mHealth;
        mHealth -= kurang;
    }
    
    @Override
    public String getZombieInfoReza() 
    {
        String info = "Jumping Zombie Data =\n";
        info += "Health = " + mHealth + "\n";
        info += "Level = " + mLevel + "\n";
        return info;
    }
}
