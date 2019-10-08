package jti.polinema.inheritance._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Manager1841720078Reza extends Karyawan1841720078Reza
{
    public int tunjangan;
    
    public Manager1841720078Reza() {  
    }
    
    public void tampilDataManagerReza()
    {
        super.tampilDataKaryawanReza();
        System.out.println("Tunjangan        = " + tunjangan);
        System.out.println("Total Gaji       = " + (super.gaji + tunjangan));
    }
}
