//Della Novia Ramadhan
//11200930000018
//Friday, March 19th 2021

package Bank;

public class Bank {
    int saldo;
    public Bank(int Saldo){
        this.saldo = Saldo;
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo saat ini : " + this.saldo);
    }
    void simpanUang(int jumlah){
        System.out.println("Simpan uang : " + jumlah);
        saldo = this.saldo + jumlah;
        System.out.println("Saldo saat ini :" + saldo);
    }
    void ambilUang(int jumlah){
        System.out.println("Ambil uang : " + jumlah);
        saldo = this.saldo - jumlah;
        System.out.println("Saldo saat ini : " + saldo);
    }
    int getSaldo(){
        return saldo;
    }
}