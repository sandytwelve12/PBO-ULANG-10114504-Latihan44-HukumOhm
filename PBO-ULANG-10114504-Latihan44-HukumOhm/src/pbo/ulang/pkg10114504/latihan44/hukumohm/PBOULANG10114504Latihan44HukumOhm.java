/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan44.hukumohm;

/**
 *
 * @author
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Menampilkan Program hasil Perhitungan tegangan alur listrik 
 * dengan menggunakan Hukum OHm
 */
public class PBOULANG10114504Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai Bt = new Baterai();
        System.out.println("");
        System.out.println("Kuat Arus : "+Bt.getKuatArus()+" ampere");
        System.out.println("Hambatan : "+Bt.getHambatan()+" ohm");
        System.out.println("Hasil Tegangan : "+Bt.hitungTegangan()+" volt");
        
    
    }
    
}
