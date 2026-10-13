/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KombinasiPolimorphism;

/**
 *
 * @author ASUS
 */
import java.util.*;
import java.util.ArrayList;
import java.util.List;

abstract class Mantra {
    private String nama;

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Abstract method untuk efek mantra
    public abstract void efek();
}

class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

class Penyihir {
    private String nama;
    private List<Mantra> mantraList;

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>();
    }

    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {
            if (mantra.getNama().equals(namaMantra)) {
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();
                return;
            }
        }
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // Method baru untuk mengucapkan semua mantra yang sudah dipelajari
    public void ucapkanSemuaMantra() {
        System.out.println(nama + " mengucapkan semua mantra yang dikuasai:");
        for (Mantra mantra : mantraList) {
            System.out.println("- " + mantra.getNama() + " (Efek: ");
            mantra.efek();
            System.out.print(")");
        }
    }
}

public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();
        Mantra lumos = new Lumos();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);
        harry.belajarMantra(lumos);

        // Memanggil method baru untuk mengucapkan semua mantra
        harry.ucapkanSemuaMantra();
    }
}

/* 
1. Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?
Jawab: 
Kelas abstrak (Mantra) mendefinisikan kerangka umum dan tipe data dasar yang seragam untuk semua jenis mantra. 
Sementara itu, polimorfisme memungkinkan List<Mantra> di dalam kelas Penyihir untuk menampung berbagai macam objek anak yang berbeda-beda (Expelliarmus, ExpectoPatronum, Lumos) secara bersamaan di dalam satu wadah koleksi. Ketika method efek() dipanggil melalui perulangan, Java secara otomatis menjalankan fungsi override yang sesuai dengan jenis objek

2. Apa yang terjadi jika kita menambahkan mantra baru tanpa mengubah kelas Penyihir? Apakah mudah? Mengapa? 
Jawab: Mudah dan tidak ada kode di kelas Penyihir yang perlu diubah. Karena kelas Penyihir dirancang menggunakan tipe data abstrak induk (Mantra),cukup mengenali objek apa pun selama objek tersebut merupakan turunan dari kelas Mantra.

*/