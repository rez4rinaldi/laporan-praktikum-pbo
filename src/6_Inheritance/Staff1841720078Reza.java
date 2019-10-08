package jti.polinema.inheritance._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Staff1841720078Reza extends Karyawan1841720078Reza
{
    public int lembur, potongan;
    
    public Staff1841720078Reza() {
    }

    public Staff1841720078Reza(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) 
    {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    
    public void tampilDataStaffReza()
    {
        super.tampilDataKaryawanReza();
        System.out.println("Lembur           = " + lembur);
        System.out.println("Potongan         = " + potongan);
        System.out.println("Total Gaji       = " + (gaji + lembur - potongan));
    }
}
