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
public class Display {
    
    Scanner sc = new Scanner(System.in);
    
    public static void display() {
        System.out.println("=======Calculator program=======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.println("Your choice:");
        
    }
    
    public int checkLimit(int min, int max) {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
                
            } catch (NumberFormatException e) {
                System.out.println("Not a valid input");
            }
        }
    }
}
