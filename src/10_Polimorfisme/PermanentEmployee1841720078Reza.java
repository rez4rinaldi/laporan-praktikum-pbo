package jti.polinema.polimorfisme._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class PermanentEmployee1841720078Reza extends Employee1841720078Reza implements IPayable1841720078Reza
{
    private int mSalary;
    
    public PermanentEmployee1841720078Reza(String mName, int mSalary) 
    {
        this.mName = mName;
        this.mSalary = mSalary;
    }

    public int getSalaryReza() 
    {
        return mSalary;
    }

    public void setSalaryReza(int mSalary) 
    {
        this.mSalary = mSalary;
    }
    
    @Override
    public int getPaymentAmountReza()
    {
        return (int) (mSalary + 0.05 * mSalary);
    }
    
    @Override
    public String getEmployeeInfoReza()
    {
        String info = super.getEmployeeInfoReza()+"\n";
        info += "Registered as permanent employee with salary " + mSalary + "\n";
        return info;
    }
}
