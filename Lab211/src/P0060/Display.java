/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0060;

/**
 *
 * @author MSI
 */
public class Display {
    
    Manage manager;
    
    public Display() {
        this.manager = new Manage();
    }
    
    public void billAmountInput() throws Exception {
        System.out.print("Input number of bill: ");
        int bill = Validation.billInputValid(Const.BILL);
        manager.setSize(bill);
    }
    
    public void moneyAmountInput() throws Exception {
        for (int i = 0; i < manager.getTheWallet().length; i++) {
            System.out.print("input value of bill " + (i + 1) + ": ");
            manager.getTheWallet()[i] = Validation.moneyInputValid(Const.MONEY);
            
        }
    }
    
    public void walletAmountInput() throws Exception {
        System.out.print("input value of wallet: ");
        int amount = Validation.moneyInputValid(Const.MONEY);
        manager.setTheWallet(amount);
    }
    
    public void Display() throws Exception {
        System.out.println("======= Shopping program =======");
        billAmountInput();
        moneyAmountInput();
        walletAmountInput();
        System.out.println("This is total of bill: " + manager.getTotal());
        if (manager.payMoney()) {
            System.out.println("You can buy it");
        } else {
            System.out.println("You can not buy it");
        }
    }
}
