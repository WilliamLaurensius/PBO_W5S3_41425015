package Method_Overloading;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */

import java.util.*;

public class Mantra {
    public void ucapkan(String namaMantra){
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }
    
    public void ucapkan (String namaMantra, int kekuatan){
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        if(kekuatan > 10){
            System.out.println("Efek : Lawan terlempar!");
        }else{
            System.out.println("Efek : Senjata terlepas");
        }
    }
    
   // method baru ucapkan() yang menerima parameter string namaMantra dan string target tanpa parameter kekuatan
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        System.out.println("Efek: " + target + " terkena sihir langsung!");
    }
    
    
    public void ucapkan(String namaMantra, int kekuatan, String target){
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10){
            System.out.println("Efek: " + target + " terlempar ");
        } else {
            System.out.println("Efek : Senjata " + target + " terlepas.");
        }
    }
    
    public static void main (String[] args){
        Mantra mantra = new Mantra();
        mantra.ucapkan("Expelliarmus");
        mantra.ucapkan("Expelliarmus", 5);
        mantra.ucapkan("Expelliarmus", 15, "Voldemort");
    }
}


/* 
1. Apa yang terjadi jika kita menghapus salah satu method overloading? Misalnya, method 
dengan dua parameter.
Jawab : Jika kita menghapus salah satu method overloading (misalnya ucapkan(String namaMantra, int kekuatan)), lalu di dalam main kita tetap memanggil mantra.ucapkan("Expelliarmus", 5);, 
maka program akan mengalami error saat dikompilasi. Java akan mengingatkan kalau  method dengan kombinasi parameter tersebut tidak ditemukan karena definisinya sudah dihapus.

2. Bisakah kita membuat method overloading dengan urutan parameter yang berbeda? Coba buat method ucapkan(int kekuatan, String namaMantra).
Jawab : Bisa. Java mendukung overloading berdasarkan perbedaan tipe data atau urutan susunan parameternya. \
Method ucapkan(String namaMantra, int kekuatan) dan ucapkan(int kekuatan, String namaMantra) dianggap sebagai dua method yang berbeda oleh Java karena susunan tipe datanya unik (String, int vs int, String), sehingga tidak akan mengalami error.
*/
