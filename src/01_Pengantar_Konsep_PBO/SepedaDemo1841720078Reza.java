package sepedademo;

/**
 *
 * @author Reza Rinaldi
 */
public class SepedaDemo1841720078Reza 
{
    public static void main(String[] args) 
    {
        // Buat dua buah objek sepeda
        Sepeda1841720078Reza spd1 = new Sepeda1841720078Reza();
        Sepeda1841720078Reza spd2 = new Sepeda1841720078Reza();
        SepedaGunung1841720078Reza spd3 = new SepedaGunung1841720078Reza();
        
        // Panggil method didalam objek sepeda
        spd1.setMerekReza("Polygone");
        spd1.tambahKecepatanReza(10);
        spd1.gantiGearReza(2);
        spd1.warnaSepeda("Merah");
        spd1.cetakStatusReza();
        
        System.out.println();
        
        spd2.setMerekReza("Wiim Cycle");
        spd2.tambahKecepatanReza(10);
        spd2.gantiGearReza(2);
        spd2.tambahKecepatanReza(10);
        spd2.gantiGearReza(3);
        spd2.warnaSepeda("Biru");
        spd2.cetakStatusReza();
        
        System.out.println();
        
        spd3.setMerekReza("Klinee");
        spd3.tambahKecepatanReza(5);
        spd3.gantiGearReza(7);
        spd3.setTipeSuspensiReza("Gas suspension");
        spd3.warnaSepeda("Kuning");
        spd3.cetakStatusReza();
    }
}
