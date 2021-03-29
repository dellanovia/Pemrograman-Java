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
public class MatematikaCanggih extends Matematika{
   // Method Operasi Integer menggunakan 2 Parameter
    void modulus(int a, int b){
        hitung = a%b;
        System.out.println("Hasil Modulus: " + getHitung());
    }
    
    //Method Operasi Integer menggunakan 3 Parameter
    void modulus(int a, int b, int c){
        hitung = a%b%c;
        System.out.println("Hasil Modulus: " + getHitung());
    }
    
     //Method Operasi Double menggunakan 2 Parameter
    void modulus(double a, double b){
        hitung1 = a%b;
        System.out.println("Hasil Modulus: " + getHitung1());
    }
    
    //Method Operasi Double menggunakan 3 Parameter
    void modulus(double a, double b, double c){
        hitung1 = a%b%c;
        System.out.println("Hasil Modulus: " + getHitung1());
    }
}