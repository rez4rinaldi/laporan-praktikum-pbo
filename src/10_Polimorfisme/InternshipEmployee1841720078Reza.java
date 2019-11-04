package jti.polinema.polimorfisme._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class InternshipEmployee1841720078Reza extends Employee1841720078Reza
{
    private int mLength;

    public InternshipEmployee1841720078Reza(String mName, int mLength) 
    {
        this.mLength = mLength;
        this.mName = mName;
    }
    
    public int getLengthReza()
    {
        return mLength;
    }
    
    public void setLengthReza(int mLength)
    {
        this.mLength = mLength;
    }
    
    @Override
    public String getEmployeeInfoReza()
    {
        String info = super.getEmployeeInfoReza()+"\n";
        info += "Registered as internship employee for " + mLength + " month/s\n";
        return info;
    }
}
