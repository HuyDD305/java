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
        int age = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        System.out.print("Enter work Location: ");
        String location = sc.nextLine();
        Worker newWorker = new Worker(name, id, age, salary, location);
        return newWorker;

    }

    public boolean addWorker(Worker worker) {//cong thg worker

        if (worker == null || isDuplicated(worker.getId())) {
            System.out.println("ID cannot be null or duplicated");
            return false;
        }

        if (worker.getAge() < 18 || worker.getAge() > 50) {
            System.out.println("Age must be in range 18 to 50");
            return false;
        }

        if (worker.getSalary() < 0) {
            System.out.println("Salary must be greater than 0");
            return false;
        }

        int index = this.list.indexOf(worker);

        if (index < 0) {
            if (this.list.add(worker)) {
                return true;
            } else {
                return false;
            }
        }
        return false;

    }

    public boolean changeSalary(boolean isIncrease) {
        Worker testWorker = null;
        System.out.print("Enter Code:");
        String id = sc.nextLine().trim();

        System.out.print("Enter Salary:");
        double salary = Double.parseDouble(sc.nextLine());

        if (findWorkerById(id) == null) {
            System.out.println("Code(id) must be existed in DB");
            return false;

        } else {
            testWorker = findWorkerById(id);
        }

        if (salary < 0) {
            System.out.println("Salary must be greater than 0");
            return false;
        }

        if (isIncrease) {
            testWorker.setSalary(testWorker.getSalary() + salary);
            System.out.println("Salary increased by: " + salary);
            testWorker.setStatus("UP");
            this.salaryHistory.add(testWorker);
            return testWorker.isSalaryAdjusted();
        } else {
            testWorker.setSalary(testWorker.getSalary() - salary);
            System.out.println("Salary decreased by: " + salary);
            testWorker.setStatus("DOWN");
            this.salaryHistory.add(testWorker);
            return testWorker.isSalaryAdjusted();
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

    public void printAll() {
        System.out.println("-".repeat(20) + "Display Information Salary" + "-".repeat(20));
        System.out.printf("%-5s %-10s %-5s %-7s %-7s %-10s%n", "Code", "Name", "Age", "Salary", "Status", "Date");
        for (Worker worker : this.salaryHistory) {
            System.out.printf("%-5s %-10s %-5s %-7s %-7s %-10s%n", worker.getId(), worker.getName().substring(0, 1).toUpperCase() + worker.getName().substring(1), worker.getAge(), worker.getSalary(), worker.getStatus(), worker.getAddedDateFormatted());
        }

    }
}
