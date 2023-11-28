/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22166019.pbo.lat58;

/**
 * Nama: Rachma Fadilah Kunianto
 * NIM: 22166019
 * Kelas: SISTEM INFORMASI
 * Semester: Tiga
 * Mata Kuliah: PBO1
 */

class Bilangan {
    protected int x;
    protected int y;


    public Bilangan() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
}

class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        int jumlah = getX() + getY();
        System.out.println("Hasil penjumlahan: " + jumlah);
    }
}

class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        System.out.println("Hasil selisih: " + getX() + " - " + getY() + " = " + (getX() - getY()));
    }
}

public class Nilai_Bilangan {
    public static void main(String[] args) {
        JumlahBilangan jumlahBilangan = new JumlahBilangan();
        jumlahBilangan.x = 3;
        jumlahBilangan.y = 4;

        jumlahBilangan.tampilHasilJumlah();

        SelisihBilangan selisihBilangan = new SelisihBilangan();
        selisihBilangan.x = 3;
        selisihBilangan.y = 4;

        selisihBilangan.tampilSelisih();
    }
}