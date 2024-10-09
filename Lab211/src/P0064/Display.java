/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0064;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Display {

    public void gettingDisplay() {
        Scanner sc = new Scanner(System.in);
        System.out.println("====== Validate Program ======");
        do {
            String phone = Validation.inputPhoneNumValid(sc.nextLine());
            String email = Validation.inputEmailValid(sc.nextLine());
            String date = Validation.inputDateValid(sc.nextLine());
            if (date.equals(""))
        } while (true);
        
    }
}
