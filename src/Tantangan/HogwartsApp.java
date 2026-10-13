/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tantangan;

/**
 *
 * @author ASUS
 */
import java.util.ArrayList;
import java.util.List;

// 1. Abstract class MantraPerlindungan
abstract class MantraPerlindungan {
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}

// 2. Kelas-kelas Konkret (Turunan)
class Protego extends MantraPerlindungan {
    @Override
    public void aktifkan() {
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Perisai Protego diturunkan.");
    }
}

class Fidelius extends MantraPerlindungan {
    private String secretKeeper;

    public Fidelius(String secretKeeper) {
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        System.out.println("Mantra Fidelius diaktifkan. Secret Keeper yang ditunjuk adalah: " + secretKeeper);
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Fidelius dinonaktifkan. Rahasia kembali terbuka.");
    }
}

class MantraAntiApparition extends MantraPerlindungan {
    @Override
    public void aktifkan() {
        System.out.println("Mantra Anti-Apparition aktif: Mencegah apparition di area Hogwarts!");
    }

    @Override
    public void nonaktifkan() {
        System.out.println("Mantra Anti-Apparition dinonaktifkan. Apparition kembali diizinkan.");
    }
}

// 3. Kelas SistemPertahanan untuk mengelola daftar mantra
class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra;

    public SistemPertahanan() {
        this.daftarMantra = new ArrayList<>();
    }

    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra perlindungan berhasil ditambahkan ke sistem.");
    }

    public void aktifkanSemuaMantra() {
        System.out.println("\n Mengaktifkan Seluruh Sistem Pertahanan Hogwarts");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    public void nonaktifkanSemuaMantra() {
        System.out.println("\n Menonaktifkan Seluruh Sistem Pertahanan Hogwarts ");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }
}

// 4. Kelas Demo / Utama untuk menjalankan program
public class HogwartsApp {
    public static void main(String[] args) {
        // Membuat objek sistem pertahanan
        SistemPertahanan hogwarts = new SistemPertahanan();

        // Membuat beberapa objek mantra perlindungan
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius("Harry Potter");
        MantraPerlindungan antiApparition = new MantraAntiApparition();

        // Menambahkan mantra ke sistem pertahanan Hogwarts
        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);

        // Menjalankan perintah sistem
        hogwarts.aktifkanSemuaMantra();
        
        System.out.println();
        
        hogwarts.nonaktifkanSemuaMantra();
    }
}
