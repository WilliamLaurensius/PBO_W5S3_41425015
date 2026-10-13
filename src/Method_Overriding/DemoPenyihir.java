/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method_Overriding;

/**
 *
 * @author ASUS
 */

import java.util.*;

class Penyihir {
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

class HarryPotter extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// tambahkan kelas RonWeasley 
class RonWeasley extends Penyihir{
    @Override
    public void ucapkanMantra(){
        System.out.println("RonWeasley mengucapkan mantra menggunakan topi ajaib nya. Bimsalabim ");
    }
}

public class DemoPenyihir {
    public static void main(String[] args) {
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley();  // membuat objek baru 
         
        penyihir1.ucapkanMantra(); // Output: Harry Potter mengucapkan mantra dengan tongkatnya yang unik.
        penyihir2.ucapkanMantra(); // Output: Hermione mengucapkan mantra dengan tepat dan percaya diri.
        penyihir3.ucapkanMantra(); // output: RonWeasley mengucapkan mantra menggunakan topi ajaibnya. bimsalabim
    }
}

/* 
1. Apa yang terjadi jika kita tidak menggunakan annotation @Override? Apakah kode masih berjalan?
Jawab : Ya, kode akan tetap berjalan normal. Anotasi @Override sifatnya opsional bagi compiler Java. 
Namun, menggunakan @Override sangat disarankan karena berfungsi sebagai pengaman untuk mengecek apakah nama method dan parameternya benar-benar sama persis dengan kelas induk. 
Jika salah ketik nama method tanpa @Override, Java akan menganggapnya sebagai method baru, bukan menimpa method induk.

2. Apa keuntungan menggunakan polymorphism dalam contoh ini?
jawab:
fleksibel dan mudah dalam pengembangan kode (maintainability). 
Kita bisa membuat wadah bertipe kelas induk (Penyihir) untuk menampung berbagai macam objek kelas anak (HarryPotter, Hermione, RonWeasley). 
Jika nanti ada karakter baru yang ditambahkan, kita tidak perlu mengubah kode pemanggilan di method main secara keseluruhan 
*/