/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeproject;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validation {

    public static String inputPhoneNumValid(String regex) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                String input = sc.nextLine();
                if (!input.matches(regex)) {
                    System.out.print("Phone number must be number: ");
                    continue;
                }
                int num = Integer.parseInt(input);
                if (num < 10) {
                    throw new Exception();
                } else {
                    return input;
                }

            } catch (Exception e) {
                System.out.print("Invalid phone number, must be 9 digits");
            }

        }

    }

    public static String inputEmailValid(String regex) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                String input = sc.nextLine();
                if (!input.matches(regex)) {
                    throw new Exception();

                } else {
                    return input;
                }

            } catch (Exception e) {
                System.out.print("Wrong email format: ");
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
                System.out.print("Invalid input, please try again: ");
            }
        }

    }
}
