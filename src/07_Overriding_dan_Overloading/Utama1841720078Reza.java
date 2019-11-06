package jobsheet07reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Utama1841720078Reza 
{
    public static void main(String[] args) 
    {
        System.out.println("Program Testing Class Manager & Staff");
        System.out.println();
        Manager1841720078Reza man[] = new Manager1841720078Reza[2];
        Staff1841720078Reza staff1[] = new Staff1841720078Reza[2];
        Staff1841720078Reza staff2[] = new Staff1841720078Reza[3];
        
        //pembuatan manager
        
        System.out.println("----------------------");
        man[0] = new Manager1841720078Reza();
        man[0].setNamaReza("Tedjo");
        man[0].setNipReza("101");
        man[0].setGolonganReza("1");
        man[0].setTunjanganReza(5000000);
        man[0].setBagianReza("Administrasi");
        
        man[1] = new Manager1841720078Reza();
        man[1].setNamaReza("Atika");
        man[1].setNipReza("102");
        man[1].setGolonganReza("1");
        man[1].setTunjanganReza(2500000);
        man[1].setBagianReza("Pemasaran");
        
        //pembuatan staff
        
        staff1[0] = new Staff1841720078Reza();
        staff1[0].setNamaReza("Usman");
        staff1[0].setNipReza("0003");
        staff1[0].setGolonganReza("2");
        staff1[0].setLemburReza(10);
        staff1[0].setGajiLemburReza(10000);
        
        staff1[1] = new Staff1841720078Reza();
        staff1[1].setNamaReza("Anugrah");
        staff1[1].setNipReza("0005");
        staff1[1].setGolonganReza("2");
        staff1[1].setLemburReza(10);
        staff1[1].setGajiLemburReza(55000);
        man[0].setStaffReza(staff1);
        
        staff2[0] = new Staff1841720078Reza();
        staff2[0].setNamaReza("Hendra");
        staff2[0].setNipReza("0004");
        staff2[0].setGolonganReza("3");
        staff2[0].setLemburReza(15);
        staff2[0].setGajiLemburReza(5500);
        
        staff2[1] = new Staff1841720078Reza();
        staff2[1].setNamaReza("Arie");
        staff2[1].setNipReza("0006");
        staff2[1].setGolonganReza("4");
        staff2[1].setLemburReza(5);
        staff2[1].setGajiLemburReza(100000);
        
        staff2[2] = new Staff1841720078Reza();
        staff2[2].setNamaReza("Mentari");
        staff2[2].setNipReza("0007");
        staff2[2].setGolonganReza("3");
        staff2[2].setLemburReza(6);
        staff2[2].setGajiLemburReza(20000);
        man[1].setStaffReza(staff2);
        
        //cetak informasi dari manager + staffnya
        man[0].lihatInfoReza();
        man[1].lihatInfoReza();
    }
}
