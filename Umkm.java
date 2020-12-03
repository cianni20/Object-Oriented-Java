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
public class Umkm {

    /**
     * @param args the command line arguments
     */
    
   
    public static void main(String[] args) {
         
        Users umkm = new Users("ingkung","12345678");
        umkm.setIdToko("T12");
        umkm.setNamaToko("Ingkung sor sawo");
       umkm.setAlamatToko("Guwosari");
        
        System.out.println("Id Pelanggan: "+umkm.getIdToko());
        System.out.println("Jenis Member: "+umkm.getNamaToko());
        System.out.println("Nama pelanggan: "+umkm.getAlamatToko());
        
    }
    
}
