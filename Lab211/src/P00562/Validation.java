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
                } else {
                    throw new NumberFormatException();
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
                String input = sc.nextLine().trim();
                if (input.matches(regex)) {
                    return input;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
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
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.print("Invalid Date input, please try again: ");
            }
        }

    }
    
    public static int inputAgeValid(String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                if (!input.matches(regex)) {
                    System.out.print("Invalid Age format, please try again: ");
                    continue;
                }
                
                int age = Integer.parseInt(input);
                if (age >= 18 && age <= 50) {
                    return age;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.print("Age must be between 18 and 50, please try again: ");
            }
        }
    }
    
    public static int inputMoneyValid(String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine();
                if (!input.matches(regex)) {
                    System.out.print("Invalid format, please try again: ");
                    continue;
                }
                int money = Integer.parseInt(input);
                if (money < 0) {
                    throw new Exception();
                }
                return money;
            } catch (Exception e) {
                System.out.print("Invalid input for money, must be more than 0 please try again: ");
            }
        }
    }
    
    public static int inputRangeValid(int min, int max, String regex) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provide your input: ");
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
                return num;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input, try again:");
            }
            
            
        }
    }
    
    
}
