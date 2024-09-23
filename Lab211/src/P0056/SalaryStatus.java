/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0056;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class SalaryStatus extends Worker{
    private boolean status;
    private Worker worker;
    private double money;
    Scanner sc = new Scanner(System.in);
    
    public SalaryStatus(Worker worker) {
        System.out.println("What is the status of this worker? True or False?");
        this.status = sc.nextBoolean();
        this.worker = worker;
    }

    public boolean isStatus() {
        return status;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getMoney() {
        return money;
    }
    
    
    
    
    
    

    
    
    
    

    
    
    
    
    
}
