package jti.polinema.koperasigettersetter1841720078reza;

/**
 *
 * @author Reza Rinaldi
 */
public class KoperasiDemo1841720078Reza
{
    public static void main(String[] args) 
    {
        Anggota1841720078Reza anggota1 = new Anggota1841720078Reza("Iwan", "Jalan Mawar");
        System.out.println("Simpanan " + anggota1.getNamaReza() + " : Rp " + anggota1.getSimpananReza());  

        anggota1.setNamaReza("Iwan");
        anggota1.setAlamatReza("Jalan Sukarno Hatta no 10");
        anggota1.setorReza(100000);
        System.out.println("Simpanan " + anggota1.getNamaReza() + " : Rp " + anggota1.getSimpananReza());

        anggota1.pinjamReza(5000);
        System.out.println("Simpanan " + anggota1.getNamaReza() + " : Rp " + anggota1.getSimpananReza());   
    }
}