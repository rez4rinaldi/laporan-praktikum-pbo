package jti.polinema.polimorfisme._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Tester2_1841720078Reza 
{
    public static void main(String[] args) 
    {
        PermanentEmployee1841720078Reza pEmp = new PermanentEmployee1841720078Reza("Dedik", 500);
        
        Employee1841720078Reza e;
        
        e = pEmp;
        
        System.out.println("" + e.getEmployeeInfoReza());
        System.out.println("------------------------------------------------");
        System.out.println("" + pEmp.getEmployeeInfoReza());
    }
}
