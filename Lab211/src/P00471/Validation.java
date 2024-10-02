/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00471;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Validation {

    public static String inputIntValid(String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (input.matches(regex)) {
                    return input;
                }

            } catch (Exception e) {
                System.out.println("Invalid int input");
            }
        }

    }
    
    public static String inputDoubleValid(String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (input.matches(regex)) {
                    return input;
                }

            } catch (Exception e) {
                System.out.println("Invalid double input");
            }
        }

    }
    
    public static String inputString(String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (input.matches(regex)) {
                    return input;
                }

            } catch (Exception e) {
                System.out.println("Invalid string input");
            }
        }

    }
    
    public static String inputDateValid(String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (input.matches(regex)) {
                    return input;
                }

            } catch (Exception e) {
                System.out.println("Invalid Date input");
            }
        }

    }
    
    public static String inputTypeValid(String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (input.matches(regex)) {
                    return input;
                }

            } catch (Exception e) {
                System.out.println("Must be between 1 - 4");
            }
        }

    }
    
    
}
