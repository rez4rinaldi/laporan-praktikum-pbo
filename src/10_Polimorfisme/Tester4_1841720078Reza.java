package jti.polinema.polimorfisme._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Tester4_1841720078Reza
{
    public static void main(String[] args) 
    {
        Owner1841720078Reza ow = new Owner1841720078Reza();
        ElectricityBill1841720078Reza eBill = new ElectricityBill1841720078Reza(5, "R-1");
        
        ow.payReza(eBill); // pay for electricity bill
        System.out.println("----------------------------------");
        
        PermanentEmployee1841720078Reza pEmp = new PermanentEmployee1841720078Reza("Dedik", 500);
        ow.payReza(pEmp); // pay for permanent employee
        System.out.println("----------------------------------");
        
        InternshipEmployee1841720078Reza iEmp = new InternshipEmployee1841720078Reza("Sunarto", 5);
        ow.showEmployeeReza(pEmp); // show permanent employee info
        System.out.println("----------------------------------");
        ow.showEmployeeReza(iEmp); // show internship employee info
        
//        ow.payReza(iEmp);
    }
}
