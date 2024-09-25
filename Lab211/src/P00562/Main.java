/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00562;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Manage manager = new Manage();
        Scanner sc = new Scanner(System.in);
        int input;
        boolean check = true;

        do {
            manager.display();
            try {
                System.out.print("Please provide your input: ");
                input = Integer.parseInt(sc.nextLine());
                switch (input) {
                    case 1 -> {
                        Worker newWorker = manager.gettingInput();
                        if (manager.addWorker(newWorker)) {
                            System.out.println("Worker added successfully.");
                        } else {
                            System.out.println("Worker already exists");
                        }
                    }
                    case 2 -> {
                        if (manager.changeSalary(true)) {
                            System.out.println("Successful increased");
                        } else {
                            System.out.println("Fail to update salary");
                        }
                    }
                    case 3 -> {

                        if (manager.changeSalary(false)) {
                            System.out.println("Successful increased");
                        } else {
                            System.out.println("Fail to update salary");
                        }

                    }
                    case 4 -> {
                        manager.printAll();
                    }
                    case 5 -> {
                        check = false;
                    }
                    default ->
                        System.out.println("Invalid option. Please choose a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number");
            }
        } while (check);
    }

}
