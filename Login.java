/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingkungapss;

import user.Users;

/**
 *
 * @author ASUS
 */

public class Login {

    /**
     * @param args the command line arguments
     */
    String input_username;
    String input_password;
    public static void main(String[] args) {
        
        
        Login login= new Login();
      login.validation();
        
    }
    
    public void validation(){
        
        System.out.println("Masukan user password untuk login");
        
        
        input_username="ingkungndeso";
        input_password="123";
        System.out.print("username: "+input_username+" "+"password: "+input_password+ "\n");
        Users user=new Users("ingkungndeso","1234578"); 
        //user.setUsername("ingkungndeso");
        //user.setPassword("12345678");
        if((input_username==user.getUsername())&&(input_password==user.getPassword())){
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login Gagal");
        }
    }
    
}
