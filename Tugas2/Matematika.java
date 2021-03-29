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
public class Matematika{
    int hitung;
    double hitung1;
    
    // Method Operasi Integer menggunakan 2 Parameter
    void pertambahan(int a, int b){
        hitung = a+b;
        System.out.println("Hasil Penjumlahan = " + getHitung());
    }
    
    void pengurangan(int a, int b){
        hitung = a-b;
        System.out.println("Hasil Pengurangan = " + getHitung());
    }
    
    void perkalian(int a, int b){
        hitung = a*b;
        System.out.println("Hasil Perkalian = " + getHitung());
    }
    
    void pembagian(int a, int b){
        hitung = a/b;
        System.out.println("Hasil Pembagian = " + getHitung());
    }
    
    // Method Operasi Integer menggunakan 3 Parameter
    void pertambahan(int a, int b, int c){
        hitung = a+b+c;
        System.out.println("Hasil Penjumlahan = " + getHitung());
    }
    
    void pengurangan(int a, int b, int c){
        hitung = a-b-c;
        System.out.println("Hasil Pengurangan = " + getHitung());
    }
    
    void perkalian(int a, int b, int c){
        hitung = a*b*c;
        System.out.println("Hasil Perkalian = " + getHitung());
    }
    
    void pembagian(int a, int b, int c){
        hitung = a/b/c;
        System.out.println("Hasil Pembagian = " + getHitung());
    }
    
    int getHitung(){
        return hitung;
    }
    
    //Method Operasi Double menggunakan 2 Parameter
    void pertambahan(double a, double b){
        hitung1 = a+b;
        System.out.println("Hasil Penjumlahan = " + getHitung1());
    }
    
    void pengurangan(double a, double b){
        hitung1 = a-b;
        System.out.println("Hasil Pengurangan = " + getHitung1());
    }
    
      void perkalian(double a, double b){
        hitung1 = a*b;
        System.out.println("Hasil Perkalian = " + getHitung1());
    }
      
       void pembagian(double a, double b){
        hitung1 = a/b;
        System.out.println("Hasil Pembagian = " + getHitung1());
    }
    
    // Method Operasi Double menggunakan 3 Parameter
    void pertambahan(double a, double b, double c){
        hitung1 = a+b+c;
        System.out.println("Hasil Penjumlahan = " + getHitung1());
    }
    
     void pengurangan(double a, double b, double c){
        hitung1 = a-b-c;
        System.out.println("Hasil Pengurangan = " + getHitung1());
    }
     
    void perkalian(double a, double b, double c){
        hitung1 = a*b*c;
        System.out.println("Hasil Perkalian = " + getHitung1());
    }
    
    void pembagian(double a, double b, double c){
        hitung1 = a/b/c;
        System.out.println("Hasil Pembagian = " + getHitung1());
    }
    
    double getHitung1(){
        return hitung1;
    }
}