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
public class Payment {
    int saldo;
    
    public Payment(int saldo){
        this.saldo=saldo;
    }
    
    public void isiSaldo(int value){
        
        this.saldo += value;
        
    }
    
    public void ambilSaldo(int value){
        this.saldo -= value;
    }
    
    public int getSaldo(){
        return saldo;
    }
}
