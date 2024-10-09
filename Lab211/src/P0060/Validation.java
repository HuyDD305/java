/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0060;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Validation {
    
    public static int moneyInputValid(String regex) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            
            try {
                String money = sc.nextLine();
                if (!money.matches(regex)) {
                    throw new Exception();
                } else {
                    return Integer.parseInt(money);
                }
            } catch(Exception e) {
                System.out.print("Invalid input for money, please try again: ");
            }
        }
    }
    
    public static int billInputValid(String regex) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            
            try {
                String money = sc.nextLine();
                if (!money.matches(regex)) {
                    throw new Exception();
                } else {
                    return Integer.parseInt(money);
                }
            } catch(Exception e) {
                System.out.print("Invalid input for bill, please try again: ");
            }
        }
    }
}
