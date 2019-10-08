package jti.polinema.inheritance._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class StaffHarian1841720078Reza extends Staff1841720078Reza
{
    public int jmlJamKerja;
    
    public StaffHarian1841720078Reza() {      
    }

    public StaffHarian1841720078Reza(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int jmlJamKerja) 
    {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffHarian()
    {
        System.out.println("======================Data Staff Harian======================");
        super.tampilDataStaffReza();
        System.out.println("Jumlah Jam Kerja = " + jmlJamKerja);
        System.out.println("Gaji Bersih      = " + (gaji * jmlJamKerja - lembur - potongan));
    }
}
