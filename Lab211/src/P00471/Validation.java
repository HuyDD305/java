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
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.print("Invalid int input, please try again: ");
            }
        }

    }

    public static String inputDoubleValid(String regex) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                String input = sc.nextLine().trim();
                if (!input.matches(regex)) {
                    System.out.print("Invalid format, please try again: ");
                    continue;
                }
                double check = Double.parseDouble(input);
                if (check >= 8.0 && check <= 17.5) {
                    return input;
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.print("Invalid hour input, must be within range (8-17.5): ");
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
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.print("Invalid string input, please try again: ");
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
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.print("Invalid Date input, please try again: ");
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
                } else {
                    throw new Exception();
                }

            } catch (Exception e) {
                System.out.print("Must be a number, please try again: ");
            }
        }

    }

    public static int checkInputRange(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                if (input > min && input < max) {
                    return input;
                } else {
                    throw new NumberFormatException();
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter from 1 to 4");
            }
        }
    }

}
