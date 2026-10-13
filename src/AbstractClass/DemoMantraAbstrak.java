/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractClass;

/**
 *
 * @author ASUS
 */

import java.util.*;

abstract class MantraAbstrak {
    private String nama;

    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method: harus diimplementasikan oleh subclass
    public abstract void efek();

    // Method konkret
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// Tambahan kelas Lumos sesuai instruksi
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memunculkan cahaya terang dari ujung tongkat.");
    }
}

public class DemoMantraAbstrak {
    public static void main(String[] args) {
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos(); // Objek baru untuk Lumos

        mantra1.ucapkan();
        mantra1.efek();

        mantra2.ucapkan();
        mantra2.efek();
        
        mantra3.ucapkan();
        mantra3.efek();
    }
}

/* 

1. Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung? 
Coba dan jelaskan errornya. 
Jawab: Jika kita mencoba menulis `MantraAbstrak m = new MantraAbstrak("Test");` di dalam method `main`, program akan mengalami error
Kelas abstrak (`abstract class`) dirancang khusus sebagai kerangka kerja (template induk) dan belum tentu memiliki implementasi yang utuh (karena ada method abstrak yang kosong). Oleh karena itu, Java melarang keras pembuatan objek langsung dari kelas abstrak. Objek hanya boleh dibuat melalui kelas turunannya (subclass) yang sudah mengimplementasikan method abstraknya.

2. Mengapa kita perlu membuat abstract class? Apa keuntungannya? 
Jawab:
-Menetapkan Aturan yang Tegas: Kelas abstrak memaksa setiap kelas anak yang mewarisinya untuk wajib mengimplementasikan method tertentu (seperti method efek()), sehingga tidak ada kelas anak yang terlewat atau lupa membuatnya.
-Menghindari Penulisan Kode Berulang: Kita bisa menuliskan method yang logikanya sama persis (seperti method ucapkan()) cukup satu kali saja di kelas induk, dan itu otomatis bisa dipakai oleh semua kelas anak tanpa harus mengetik ulang kodenya.
-Mendukung Struktur Polimorfisme yang Rapi: Memungkinkan kita mengelola dan mengelompokkan berbagai objek berbeda di bawah satu tipe data induk yang seragam, membuat kode program jauh lebih terstruktur, aman, dan mudah dikembangkan.

*/