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
 * @author ADMIN
 */
public class Manage {
    private List<Worker> list;
    private ArrayList<Worker> salaryHistory;

    public List<Worker> getList() {
        return list;
    }
    
    Scanner sc = new Scanner(System.in);

    public Manage() {
        this.list = new ArrayList<>();
        this.salaryHistory = new ArrayList<>();
    }
    
    public Worker gettingInput() {//lay input tra lai thg worker
        System.out.println("-".repeat(8) + " Add Worker " + "-".repeat(8));
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter Code: ");
        String id = sc.nextLine().trim();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        sc.nextLine();
        System.out.print("Enter work Location: ");
        String location = sc.nextLine();
        Worker newWorker = new Worker(name, id, age, salary, location);
        return newWorker;

    }
    
    
    public boolean addWorker(Worker worker) throws Exception {//cong thg worker

        if (worker == null) {
            throw new Exception("Worker cannot be null");
        }
        int index = this.list.indexOf(worker);

        if (index < 0) {
            if(this.list.add(worker)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
        
    }
    
    public void changeSalary(boolean isIncrease) {
        Worker testWorker;
        System.out.print("Enter Code:");
        String id = sc.nextLine().trim();
        
        System.out.print("Enter Salary:");
        double salary = sc.nextDouble();
        
        if (findWorkerById(id) == null) {
            System.out.println("Worker not found bleh");
            
        } else {
            testWorker = findWorkerById(id);
        }
        
        if (isIncrease) {
            testWorker.setSalary(testWorker.getSalary() + salary);
            System.out.println("Salary increased by: " + salary);
            this.salaryHistory.add(testWorker);
        } else {
            testWorker.setSalary(testWorker.getSalary() - salary);
            System.out.println("Salary decreased by: " + salary);
            this.salaryHistory.add(testWorker);
        }
        
        
    }
    
    public boolean isDuplicated(String id) {
        for (Worker worker : this.list) {
            if (worker.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
    
    public Worker findWorkerById(String id) {
        for (Worker worker : this.list) {
            if (worker.getId().equals(id)) {
                return worker;
            }
        }
        return null;
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
