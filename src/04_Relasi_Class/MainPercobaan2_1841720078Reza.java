package jti.polinema.relasiclass.percobaan2_1841720078Reza;

/**
 *
 * @author Reza Rinaldi
 */
public class MainPercobaan2_1841720078Reza
{
    public static void main(String[] args)
    {
        Mobil1841720078Reza m = new Mobil1841720078Reza();
        m.setNamaReza("Avanza");
        m.setBiayaReza(350000);
        Sopir1841720078Reza s = new Sopir1841720078Reza();
        s.setNamaReza("John Doe");
        s.setBiayaReza(200000);
        Pelanggan1841720078Reza p = new Pelanggan1841720078Reza();
        p.setNamaReza("Jane Doe");
        p.setMobilReza(m);
        p.setSopirReza(s);
        p.setHariReza(2);
        System.out.println("Biaya Total = " + 
                p.hitungBiayaTotalReza());
        System.out.println(p.getMobilReza().getNamaReza());
    }
}
