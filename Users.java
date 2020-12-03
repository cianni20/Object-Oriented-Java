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
public class Users {
    private String username;
    private String password;
    public String name;
    private String nik;
    private String email;
    protected String alamat="Iroyudan Guwosari";
    protected boolean status_user;
    
     private String id_pelanggan;
    private String jenis_member;
    private String id_toko;
     private String alamat_toko;
     private String nama_toko;
     private String telp_toko;
     
     
    public Users(String username, String password){
         this.username=username;
        this.password=password;
     }
     
   
     
     public void setIdToko(String id_toko){
        this.id_toko=id_toko;
    }
    
    public String getIdToko(){
        return this.id_toko;
    }
    public void setAlamatToko(String alamat_toko){
        this.id_toko=id_toko;
    }
    
    public String getAlamatToko(){
        return this.id_toko;
    }
    public void setNamaToko(String nama_toko){
        this.nama_toko=nama_toko;
    }
    
    public String getNamaToko(){
        return this.id_toko;
    }
    
    
    
     public void setIdPelanggan(String id_pelanggan){
        this.id_pelanggan=id_pelanggan;
    }
    
    public String getIdPelanggan(){
        return this.id_pelanggan;
    }
    
    public void setJenisMember(String jenis_member){
        this.jenis_member=jenis_member;
    }
    
    public String getJenisMember(){
        return this.jenis_member;
    }
    
    
    
    protected void setStatusUser(boolean status_user){
        this.status_user = status_user;
    }
    protected boolean getStatusUser(){
        return status_user;
    }
    
    
    
    //public void setUsername(String username){
       // this.username=username;
   // }
    
    public String getUsername(){
        return this.username;
    }
   // public void setPassword(String password){
       // this.password=password;
  //  }
    
    public String getPassword(){
        return this.password;
    }
    
   
   
   public String getNIK() {
      return this.nik;
   }
   public void setNIK(String nik) {
      this.nik = nik;
   }
   
   
   
   public String getEmail() {
      return this.email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
    
}
