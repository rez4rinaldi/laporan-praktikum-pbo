package jti.polinema.polimorfisme._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Tester1_1841720078Reza 
{
    public static void main(String[] args) 
    {
        PermanentEmployee1841720078Reza pEmp = new PermanentEmployee1841720078Reza("Dedik", 500);
        InternshipEmployee1841720078Reza iEmp = new InternshipEmployee1841720078Reza("Sunarto", 5);
        ElectricityBill1841720078Reza eBill = new ElectricityBill1841720078Reza(5, "R-1");
        
        Employee1841720078Reza e;
        IPayable1841720078Reza p;
        
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}