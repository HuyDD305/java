/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0060;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */
public class Manage {
    private int[] bill;
    private int size;
    private Wallet wallet;
    
    
    public Manage() {
        this.wallet = new Wallet();
    }

    public void setSize(int size) {
        this.size = size;
        this.bill = new int[size];
    }
    
    public int[] getTheWallet() {
        return this.bill;
    }
    
    public void setTheWallet(int amount) {
        wallet.setAmount(amount);
    }
    
    public int calcTotal(int[] bills) {
        int sum = 0;
        for (int c : bills) {
            sum = sum + c;
        }
        return sum;
    }
    
    public boolean payMoney() {
        if (this.wallet.getAmount() >= calcTotal(bill)) {
            return true;
        } else {
            return false;
        }
    }
    
    public int getTotal() {
        int sum = 0;
        for (int c : this.bill) {
            sum = sum + c;
        }
        return sum;
    }
    
    
    
    
    
    
}
