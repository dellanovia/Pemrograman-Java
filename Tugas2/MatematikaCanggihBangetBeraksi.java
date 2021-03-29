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
public class MatematikaCanggihBangetBeraksi{
    public static void main(String[] args) {
        Matematika getHitung = new Matematika();
        MatematikaCanggih getHitung1 = new MatematikaCanggih();
        MatematikaCanggihBanget getHitung2 = new MatematikaCanggihBanget();
        
        getHitung.pertambahan(30, 25);
        getHitung.perkalian(15, 4);
        getHitung1.modulus(19, 2);
        getHitung2.pertambahanTiga(16, 18, 20);
    }
}