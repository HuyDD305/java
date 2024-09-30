/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0074;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Display display = new Display();
        Calculator cal = new Calculator();

        Scanner sc = new Scanner(System.in);
        boolean check = true;
        
        do {
            display.display();
            int input = display.checkLimit(1, 4);
            
            switch (input) {
                case 1:
                    cal.add();
                    break;
                case 2:
                    cal.subtraction();
                    break;
                case 3:
                    cal.Multiplication();
                    break;
                case 4:
                    check = false;
                    
            }
            
        } while (check);
        
    }
}
