package jti.polinema.inheritance._1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class Karyawan1841720078Reza 
{
    public String nama, alamat, jk;
    public int umur, gaji;
    
    public Karyawan1841720078Reza() {
    }

    public Karyawan1841720078Reza(String nama, String alamat, String jk, int umur, int gaji) 
    {
        this.nama = nama;
        this.alamat = alamat;
        this.jk = jk;
        this.umur = umur;
        this.gaji = gaji;
    }
    
    public void tampilDataKaryawanReza()
    {
        System.out.println("Nama             = " + nama);
        System.out.println("Alamat           = " + alamat);
        System.out.println("Jenis Kelamin    = " + jk);
        System.out.println("Umur             = " + umur);
        System.out.println("Gaji             = " + gaji);
    }
}
