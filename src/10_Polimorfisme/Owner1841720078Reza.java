package jti.polinema.polimorfisme._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Owner1841720078Reza 
{
    public void payReza(IPayable1841720078Reza p)
    {
        System.out.println("Total payment = " + p.getPaymentAmountReza());
        if (p instanceof ElectricityBill1841720078Reza) 
        {
            ElectricityBill1841720078Reza eb = (ElectricityBill1841720078Reza) p;
            System.out.println("" + eb.getBillInfoReza());
        }
        
        else if (p instanceof PermanentEmployee1841720078Reza) 
        {
            PermanentEmployee1841720078Reza pe = (PermanentEmployee1841720078Reza) p;
            System.out.println("" + pe.getEmployeeInfoReza());
        }
    }
    
    public void showEmployeeReza(Employee1841720078Reza e)
    {
        System.out.println("" + e.getEmployeeInfoReza());
        if (e instanceof PermanentEmployee1841720078Reza)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }
}
