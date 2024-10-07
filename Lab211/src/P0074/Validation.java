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
public class Validation {
    public static int getMatrixValid(String regex) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            try {
                String input = sc.nextLine();
                if (!input.matches(regex)) {
                    throw new Exception();
                } else {
                    return Integer.parseInt(input);
                }
            } catch(Exception e) {
                System.out.print("Values of matrix must be the number");
            }
            
            
        }
        
    }
    
    public static int getIntValid(String regex) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            try {
                String input = sc.nextLine();
                if (!input.matches(regex)) {
                    throw new Exception();
                } else {
                    return Integer.parseInt(input);
                }
            } catch(Exception e) {
                System.out.print("Invalid input for row and column");
            }
            
            
        }
        
    }
    
    public static int checkLimit(int min, int max, String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                if (!input.matches(regex)) {
                    System.out.print("Invalid format, please try again: ");
                    continue;
                }
                int num = Integer.parseInt(input);
                
                if (num < min || num > max) {
                    throw new NumberFormatException();
                }
                
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number from 1 to 4");
            }
        }
    }
    
    
}
