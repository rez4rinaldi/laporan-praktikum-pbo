package jti.polinema.inheritance._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class StaffTetap1841720078Reza extends Staff1841720078Reza 
{
    public String golongan;
    public int asuransi;

    public StaffTetap1841720078Reza() {
    }

    public StaffTetap1841720078Reza(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi) 
    {
        super(nama, alamat, jk, umur, gaji, lembur, potongan);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }
    
    public void tampilStaffTetapReza()
    {
        System.out.println("======================Data Staff Tetap======================");
        super.tampilDataStaffReza();
        System.out.println("Golongan         = " + golongan);
        System.out.println("Asuransi         = " + asuransi);
        System.out.println("Gaji Bersih      = " + (gaji + lembur - potongan - asuransi));
    }
}
