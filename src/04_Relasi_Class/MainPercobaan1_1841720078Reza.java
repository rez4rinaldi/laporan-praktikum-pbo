package jti.polinema.relasiclass.percobaan1_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class MainPercobaan1_1841720078Reza
{
    public static void main(String[] args)
    {
        Processor1841720078Reza p = new Processor1841720078Reza("Intel i5", 3);
//        Laptop1841720078Reza L = new Laptop1841720078Reza("Thinkpad", p);
        
        p.infoReza();
        
        Processor1841720078Reza p1 = new Processor1841720078Reza();
        p1.setMerkReza("Intel i5");
        p1.setCacheReza(4);
        
        Laptop1841720078Reza L1 = new Laptop1841720078Reza();
        L1.setMerkReza("Thinkpad");
        L1.setProcReza(p1);
        L1.infoReza();
    }
}
