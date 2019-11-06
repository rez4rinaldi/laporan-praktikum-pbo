package tugasjobsheet3;

/**
 *
 * @author Reza Rinaldi
 */
public class EncapDemo1841720078Reza
{
    private String mName;
    private int mAge;

    public String getNameReza() 
    {
        return mName;
    }

    public void setNameReza(String newName) 
    {
        mName = newName;
    }

    public int getAgeReza() 
    {
        return mAge;
    }

    public void setAgeReza(int newAge) 
    {
        if (newAge >= 18 && newAge <= 30) 
        {
            mAge = newAge;
        } 
        else 
        {
            System.out.println("Nilai yang anda masukan salah!!");
        }
    }
}