package mahasiswa;

/**
 *
 * @author Reza Rinaldi
 */
public class TestMahasiswa1841720078Reza 
{
    public static void main(String[] args) 
    {
        Mahasiswa1841720078Reza mhs1 = new Mahasiswa1841720078Reza();
        Mahasiswa1841720078Reza mhs2 = new Mahasiswa1841720078Reza();
        Mahasiswa1841720078Reza mhs3 = new Mahasiswa1841720078Reza();
        
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodataReza();
        
        System.out.println();
        
        mhs2.nim = 102;
        mhs2.nama = "Fulan";
        mhs2.alamat = "Jl. Vinolia No 2A";
        mhs2.kelas = "1B";
        mhs2.tampilBiodataReza();
        
        System.out.println();
        
        mhs3.nim = 103;
        mhs3.nama = "Fulanah";
        mhs3.alamat = "Jl. Vinolia No 3A";
        mhs3.kelas = "1C";
        mhs3.tampilBiodataReza();
    }
}