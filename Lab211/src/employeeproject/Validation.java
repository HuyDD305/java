/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeproject;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validation {
    private static final Scanner sc = new Scanner(System.in);

    public static String inputPhoneNumValid(String regex) throws Exception {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (!input.matches(regex)) {
                    System.out.print("Invalid phone number format. Please enter a 10-digit number: ");
                    continue;
                }
                if (input.length() != 10) {
                    throw new Exception();
                } else {
                    return input;
                }
            } catch (Exception e) {
                System.out.print("Invalid phone number, must be 10 digits: ");
            }
        }
    }



    public static String inputEmailValid(String regex) throws Exception {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (!input.matches(regex)) {
                    System.out.print("Wrong email format. Please enter a valid email: ");
                    continue;
                }
                return input;
            } catch (Exception e) {
                System.out.print("Invalid email, please try again: ");
            }
        }
    }

    public static String inputDateValid(String regex) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        while (true) {

            String input = sc.nextLine().trim();
            if (!input.matches(regex)) {
                System.out.println("Invalid format. Please enter in DD-MM-YYYY format.");
            }
            try {
                LocalDate date = LocalDate.parse(input, dateFormat);
                return input;

            } catch (DateTimeParseException e) {
                System.out.print("Invalid Date input, please try again: ");
            }
        }

    }

    public static int inputIntValid(String regex) {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (!input.matches(regex)) {
                    System.out.print("Invalid input, must be a number. Please try again: ");
                    continue;
                }
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Invalid input, must be a number. Please try again: ");
            }
        }
    }


    public static String inputStringValid(String regex) {
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (input.isEmpty()) {
                    throw new Exception("Input cannot be empty.");
                }
                if (!input.matches(regex)) {
                    System.out.print("Invalid input format. Please try again: ");
                    continue;
                }
                return input;
            } catch (Exception e) {
                System.out.print("Invalid input. " + e.getMessage() + " Please try again: ");
            }
        }
    }

    public static int inputRangeValid(int min, int max, String regex) {
        System.out.print("Please provide your input: ");
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (!input.matches(regex)) {
                    System.out.print("Invalid format, please try again: ");
                    continue;
                }
                int num = Integer.parseInt(input);
                if (num < min || num > max) {
                    System.out.print("Input out of range (" + min + "-" + max + "). Try again: ");
                    continue;
                }
                return num;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input, try again: ");
            }
        }
    }
}
