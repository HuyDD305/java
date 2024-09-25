///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package P0056;
//
//import java.util.ArrayList;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
///**
// *
// * @author MSI
// */
//public class Manage {
//
//    private List<Worker> list;
//    
//    Scanner sc = new Scanner(System.in);
//
//    public Manage() {
//        this.list = new ArrayList<>();
//        
//        
//    }
//
//    public Worker gettingInput() {//lay input tra lai thg worker
//        System.out.println("-".repeat(8) + " Add Worker " + "-".repeat(8));
//        System.out.print("Enter Name: ");
//        String name = sc.nextLine().trim();
//
//        System.out.print("Enter Code: ");
//        String id = sc.nextLine().trim();
//
//        System.out.print("Enter Age: ");
//        int age = sc.nextInt();
//
//        System.out.print("Enter Salary: ");
//        double salary = sc.nextDouble();
//
//        sc.nextLine();
//        System.out.print("Enter work Location: ");
//        String location = sc.nextLine();
//        Worker newWorker = new Worker(name, id, age, salary, location);
//        return newWorker;
//
//    }
//
//    public SalaryStatus salarayChange(boolean isIncrease) {//lay input tra lai thang Salary
//        SalaryStatus newWorker;
//        System.out.println("-".repeat(8) + " Up/Down Salary " + "-".repeat(8));
//        System.out.println("Enter code: ");
//        String id = sc.nextLine();
//        System.out.println("Enter Salary: ");
//        double salary = sc.nextDouble();
//        sc.nextLine();
//        //tim
//        for (Worker worker : this.list) {
//            if(worker.getId().equals(id)) {
//                newWorker = new SalaryStatus(worker, isIncrease);
//                return newWorker;
//            }
//        }
//        return null;
//    }
//
//    public boolean addWorker(Worker worker) throws Exception {//cong thg worker
//
//        if (worker == null) {
//            throw new Exception("Worker cannot be null");
//        }
//        int index = this.list.indexOf(worker);
//
//        if (index < 0) {
//            this.list.add(worker);
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public boolean changeSalary(SalaryStatus status, String code, double amount) {//thay doi tien
//        Worker worker = status.getWorker();
//        
//        if (worker == null) {
//            System.out.println("Worker not found bleh");
//            return false;
//        }
//        
//        if (status.isStatus()) {
//            worker.setSalary(worker.getSalary() + amount);
//            System.out.println("Salary increased by: " + amount);
//        } else {
//            worker.setSalary(worker.getSalary() - amount);
//            System.out.println("Salary decreased by: " + amount);
//        }
//        
//        return true;
//    }
//    
//    public List<SalaryHistory> getInformationSalary() {
//        List<SalaryHistory> newList = new ArrayList<>();
//        for (Worker worker : this.list) {
//            if (worker.isSalaryAdjusted()) {
//                newList.add(new SalaryHistory(worker.getId(), worker.getName(), worker.getSalary()));
//            }
//        }
//        
//        return newList;
//        
//    }
//
//    public void display() {
//        String display = """
//                         ======== Worker Management ========
//                            1. Add Worker
//                            2. Up Salary
//                            3. Down salary
//                            4. Display Information salary
//                            5. Exit""";
//        System.out.println(display);
//    }
//
//}
