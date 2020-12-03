/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package user;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Pelanggan {

    /**
     * @param args the command line arguments
     */
  
    
    
    public static void main(String[] args) {
        
        Users pelanggan =new Users("ayudewi","12345"); 
       pelanggan.setIdPelanggan("P12");
        pelanggan.setJenisMember("Silver");
        pelanggan.name="ayu dewi";
        pelanggan.setNIK("1236784323");
        pelanggan.setEmail("ayu@gmail.com");
        pelanggan.setStatusUser(false);
        
        System.out.println("Id Pelanggan: "+pelanggan.getIdPelanggan());
        System.out.println("Jenis Member: "+pelanggan.getJenisMember());
        System.out.println("Nama pelanggan: "+pelanggan.name);
        System.out.println("NIK: "+pelanggan.getNIK());
        System.out.println("Email: "+pelanggan.getEmail());
        System.out.println("Status Pelanggan: "+pelanggan.getStatusUser()); 
        System.out.println("Status Pelanggan: "+pelanggan.alamat); 
        
        //pengunaan constructor payment
        
        Scanner scan = new Scanner(System.in);
        Payment pay= new Payment(1000000);  
        System.out.println("Saldo saat ini : Rp. "+pay.getSaldo());    //  Panggil method getSaldo
        System.out.print("Simpan uang    : Rp. ");  
        int simpan = scan.nextInt();
        pay.isiSaldo(simpan);    //  Panggil method simpanUang
         
        System.out.println("Saldo saat ini : Rp. "+pay.getSaldo());    //  Panggil method getSaldo
        System.out.print("Ambil uang     : Rp. ");  
        int bayar = scan.nextInt();
        pay.ambilSaldo(bayar);      //  Panggil method ambilUang
         
        System.out.println("Saldo saat ini : Rp. "+pay.getSaldo());
    
    }
    
}
