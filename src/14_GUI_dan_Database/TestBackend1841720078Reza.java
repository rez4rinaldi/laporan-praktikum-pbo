package frontend;

import backend.*;

/**
 *
 * @author Reza R
 */
public class TestBackend1841720078Reza {

    public static void main(String[] args) {
        // Kategori
//        Kategori1841720078Reza kat1 = new Kategori1841720078Reza("Novel", "Koleksi buku novel");
//        Kategori1841720078Reza kat2 = new Kategori1841720078Reza("Referensi", "Buku referensi ilmiah");
//        Kategori1841720078Reza kat3 = new Kategori1841720078Reza("Komik", "Komik anak-anak");

        // Anggota
//        Anggota1841720078Reza agt1 = new Anggota1841720078Reza("Reza", "Kabupaten Malang", "0812345679");
//        Anggota1841720078Reza agt2 = new Anggota1841720078Reza("Fulan", "Banjarmasin", "0858345637");
//        Anggota1841720078Reza agt3 = new Anggota1841720078Reza("Fulanah", "Kota Bandung", "0896345678");

        // Buku
//        Kategori1841720078Reza novel = new Kategori1841720078Reza().getByIdReza(10);
//        Kategori1841720078Reza referensi = new Kategori1841720078Reza().getByIdReza(11);
//        
//        Buku1841720078Reza buku1 = new Buku1841720078Reza(novel, "Timun Mas", "Elex Media", "Bang Supit");
//        Buku1841720078Reza buku2 = new Buku1841720078Reza(referensi, "Metode Linier", "Springer", "Alex Baldwin");
//        Buku1841720078Reza buku3 = new Buku1841720078Reza(novel, "Bintang Terang", "Erlangga", "Mat Sewoot");
        
        // Peminjaman
//        Anggota1841720078Reza fulan = new Anggota1841720078Reza().getByIdReza(8);
        Anggota1841720078Reza fulanah = new Anggota1841720078Reza().getByIdReza(9);
//        Buku1841720078Reza syarhussunnah = new Buku1841720078Reza().getByIdReza(3);
        Buku1841720078Reza aljabar = new Buku1841720078Reza().getByIdReza(6);
//        Peminjaman1841720078Reza peminjaman1 = new Peminjaman1841720078Reza(fulan, syarhussunnah, "2020/09/21", "2020/10/01");
        Peminjaman1841720078Reza peminjaman2 = new Peminjaman1841720078Reza(fulanah, aljabar, "2020/01/21", "2020/02/01");
        
        // test insert [peminjaman]
//        peminjaman1.saveReza();
        peminjaman2.saveReza();
        
        // test select all [peminjaman]
        for (Peminjaman1841720078Reza p : new Peminjaman1841720078Reza().getAllReza()) {
            System.out.println("Nama Anggota : " + p.getAnggotaReza().getNamaReza()+ ", Judul Buku : " + p.getBukuReza().getJudulReza()+ ", " + "Tanggal Pinjam: " + p.getTanggalpinjamReza()+ ", Tanggal Kembali: " + p.getTanggalkembaliReza());
        }

        // test insert [kategori]
//        kat1.saveReza();
//        kat2.saveReza();
//        kat3.saveReza();
  
        // test insert [anggota]
//        agt1.saveReza();
//        agt2.saveReza();
//        agt3.saveReza();

        // test insert [buku]
//        buku1.saveReza();
//        buku2.saveReza();
        
        // test update [kategori]
//        kat2.setKeteranganReza("Koleksi buku referensi ilmiah");
//        kat2.saveReza();
        
        // test update [anggota]
//        agt2.setAlamatReza("Kota Banjarmasin");
//        agt2.saveReza();

        // test update [buku]
//        buku2.setJudulReza("Aljabar Linier");
//        buku2.saveReza();
        
        // test delete [kategori]
//        kat3.deleteReza();
        
        // test delete [anggota]
//        agt1.deleteReza();

        // test delete [buku]
//        buku3.deleteReza();
        
        // test select all [kategori]
//        for (Kategori1841720078Reza k : new Kategori1841720078Reza().getAllReza()) {
//            System.out.println("Nama: " + k.getNamaReza()+ ", Ket: " + k.getKeteranganReza());
//        }
        
        // test select all [anggota]
//        for (Anggota1841720078Reza a : new Anggota1841720078Reza().getAllReza()) {
//            System.out.println("Nama: " + a.getNamaReza()+ ", Alamat: " + a.getAlamatReza()+ ", Telepon: " + a.getTeleponReza());
//        }

        // test select all [buku]
//        for (Buku1841720078Reza b : new Buku1841720078Reza().getAllReza()) {
//            System.out.println("Kategori: " + b.getKategoriReza().getNamaReza() + ", Judul: " + b.getJudulReza());
//        }
        
        // test search [kategori]
//        for (Kategori1841720078Reza k : new Kategori1841720078Reza().searchReza("ilmiah")) {
//            System.out.println("Nama: " + k.getNamaReza()+ ", Ket: " + k.getKeteranganReza());
//        }
        
        // test search [anggota]
//        for (Anggota1841720078Reza a : new Anggota1841720078Reza().searchReza("Bandung")) {
//            System.out.println("Nama: " + a.getNamaReza()+ ", Alamat: " + a.getAlamatReza()+ ", Telepon: " + a.getTeleponReza());
//        }

        // test search [buku]
//        for (Buku1841720078Reza b : new Buku1841720078Reza().searchReza("timun")) {
//            System.out.println("Kategori: " + b.getKategoriReza().getNamaReza() + ", Judul: " + b.getJudulReza());
//        }
    }
}
