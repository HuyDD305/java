/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0056;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Main {

    public static void main(String[] args) {
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
                        manager.addWorker(newWorker);
                    }
                    case 2 -> {
                        SalaryStatus status = manager.salarayChange();
                        manager.changeSalary(status, status.getId(), status.getSalary());
                        
                    }
                    case 3 -> {
                        SalaryStatus status = manager.salarayChange();
                        manager.changeSalary(status, status.getId(), status.getSalary());
                    }
                    case 4 -> manager.getInformationSalary();
                    case 5 -> {
                        check = false;
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        } while(check);
    }

}
