package tugas;

/**
 *
 * @author Reza Rinaldi
 */
public class MainProgram1841720078Reza 
{
    public static void main(String[] args)
    {
        //objek
        KitabHaditsArbain1841720078Reza kha1 = new KitabHaditsArbain1841720078Reza();
        KitabHaditsArbain1841720078Reza kha2 = new KitabHaditsArbain1841720078Reza();
        KitabTerjemahHaditsArbain1841720078Reza kha3 = new KitabTerjemahHaditsArbain1841720078Reza();
        
        //panggil method didalam objek KitabHaditsArbain
        kha1.judulKitabReza("Syarah Arba'in An-Nawawi Memuat 42 Hadits"
                + " Tentang Fondasi Ajaran Islam dan Faidah-Faidahnya");
        kha1.namaPenulisReza("Al-Ustadz Yazid bin Abdul Qadir Jawas");
        kha1.namaPenerbitReza("Pustaka Imam Asy-Syafi'i");
        kha1.jumlahHalamanDitambahPembukaReza(836);
        kha1.cetakStatusReza();
        
        System.out.println();
        
        kha2.judulKitabReza("Hadits Arbain Abu Unaisah 40 Hadits Pilihan"
                + " Tentang Prinsip dan Manhaj Dalam Beragama");
        kha2.namaPenulisReza("Al-Ustadz Abdul Hakim bin Amir Abdat");
        kha2.namaPenerbitReza("Pustaka Imam Asy-Syafi'i");
        kha2.jumlahHalamanDitambahPembukaReza(128);
        kha2.cetakStatusReza();
        
        System.out.println();
        
        //panggil method didalam objek KitabHaditsArbain & KitabTerjemahHaditsArbain
        kha3.judulKitabReza("Arbain 40 Hadits Tentang Tarbiyah dan Manhaj");
        kha3.namaPenulisReza("Asy-Syaikh Abdul Aziz bin Muhammad Sadhan");
        kha3.namaPenerbitReza("Pustaka Syabab");
        kha3.namaPenerjemahReza("Nor Kandir");
        kha3.jumlahHalamanDitambahPembukaReza(43);
        kha3.cetakStatusReza();
    }
}
