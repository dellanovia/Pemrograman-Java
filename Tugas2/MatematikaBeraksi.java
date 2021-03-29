/*
 * Nama : Della Novia Ramadhan
 * NIM : 11200930000018
 * Kelas : 2A Sistem Informasi
 */
package Tugas2;

/**
 *
 * Senin, 29 Maret 2021
 */
public class MatematikaBeraksi{
    public static void main(String[] args) {
     
     MatematikaCanggih doIt = new MatematikaCanggih();
     
        System.out.println("Method Class Matematika Penjumlahan");
        doIt.pertambahan(12.5, 28.7, 14.2);
        doIt.pertambahan(12, 28, 14);
        doIt.pertambahan(23, 24);
        doIt.pertambahan(3.4, 4.9);
        
        System.out.println("\nMethod Class Matematika Pengurangan");
        doIt.pengurangan(12.5, 28.7, 14.2);
        doIt.pengurangan(12, 28, 14);
        doIt.pengurangan(23, 24);
        doIt.pengurangan(3.4, 4.9);
        
        System.out.println("\nMethod Class Matematika Perkalian");
        doIt.perkalian(12.5, 28.7, 14.2);
        doIt.perkalian(12, 28, 14);
        doIt.perkalian(23, 24);
        doIt.perkalian(3.4, 4.9);
        
        System.out.println("\nMethod Class Matematika Pembagian");
        doIt.pembagian(12.5, 28.7, 14.2);
        doIt.pembagian(12, 28, 14);
        doIt.pembagian(23, 24);
        doIt.pembagian(3.4, 4.9);
        
        System.out.println("\nMethod Class Matematika Modulus");
        doIt.modulus(12.5, 28.7, 14.2);
        doIt.modulus(12, 28, 14);
        doIt.modulus(23, 24);
        doIt.modulus(3.4, 4.9);
    }
}