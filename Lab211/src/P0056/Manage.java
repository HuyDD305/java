/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0056;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Manage {

    private List<Worker> list;
    Scanner sc = new Scanner(System.in);

    public Manage() {
        this.list = new ArrayList<>();
    }

    public Worker gettingInput() {
        System.out.println("-".repeat(8) + " Add Worker " + "-".repeat(8));
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();
        
        System.out.print("Enter Code: ");
        int id = sc.nextInt();
        
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter Salary: ");
        int salary = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Enter work Location: ");
        String location = sc.nextLine();
        Worker newWorker = new Worker(name, id, age, salary, location);
        return newWorker;

    }
    
    public void salarayChange() {
        System.out.println("-".repeat(8) + " Up/Down Salary " + "-".repeat(8));
        System.out.println("Enter code: ");
        int id = sc.nextInt();
        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();
    }

    public boolean addWorker(Worker worker) throws Exception {

        if (worker == null) {
            throw new Exception("Worker cannot be null");
        }
        int index = this.list.indexOf(worker);

        if (index < 0) {
            if (this.list.add(worker)) {
                System.out.println("Worker successfully added");
            }
            return true;
        } else {
            return false;
        }
    }
    
    public boolean changeSalary (boolean increase, String code, double amount) {
        System.out.println();
        if (increase) {
            
        }
    }

    public void display() {
        String display = """
                         ======== Worker Management ========
                            1. Add Worker
                            2. Up Salary
                            3. Down salary
                            4. Display Information salary
                            5. Exit""";
        System.out.println(display);
    }

}
