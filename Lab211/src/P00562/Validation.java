/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00562;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validation {

    public static int inputIntValid(String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.matches(regex)) {
                    return Integer.parseInt(input);
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid input, must be a numebr please try again: ");
            }
        }

    }
    
    public static String inputStringValid(String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.matches(regex)) {
                    return input;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid Name input, please try again: ");
            }
        }

    }
    
    public static String inputDateValid(String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                if (input.matches(regex)) {
                    return input;
                }
            } catch (NumberFormatException e) {
                System.out.print("Invalid Date input, please try again: ");
            }
        }

    }
}
