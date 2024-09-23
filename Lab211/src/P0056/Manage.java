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

    public Worker gettingInput() {//lay input tra lai thg worker
        System.out.println("-".repeat(8) + " Add Worker " + "-".repeat(8));
        System.out.print("Enter Name: ");
        String name = sc.nextLine().trim();

        System.out.print("Enter Code: ");
        String id = sc.nextLine().trim();

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

    public SalaryStatus salarayChange() {//lay input tra lai thang Salary
        SalaryStatus newWorker;
        System.out.println("-".repeat(8) + " Up/Down Salary " + "-".repeat(8));
        System.out.println("Enter code: ");
        String id = sc.nextLine();
        System.out.println("Enter Salary: ");
        double salary = sc.nextDouble();
        for (int i = 0; i < this.list.size(); i++) {
            int low = 0;
            int high = this.list.size() - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (this.list.get(mid).getId().equals(id)) {
                    newWorker = new SalaryStatus(this.list.get(mid));
                    newWorker.setMoney(salary);
                    return newWorker;
                } else if (this.list.get(mid).getId().compareTo(id) > 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
                    
            } 

        }
        return null;
    }

    public boolean addWorker(Worker worker) throws Exception {//cong thg worker

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

    public boolean changeSalary(SalaryStatus status, String code, double amount) {//thay doi tien
        if (status.isStatus()) {
            amount = amount + status.getMoney();
            return true;
        } else {
            amount = amount - status.getMoney();
            return false;
        }
    }
    
    public void getInformationSalary() {
        System.out.println("-".repeat(20) + "Display Information Salray" + "-".repeat(20));
        System.out.println("Code" + "-".repeat(3) + "Name" + "-".repeat(9) + "Age" + "-".repeat(12) + "Salary" + "-".repeat(10));
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
