///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package P0056;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///**
// *
// * @author MSI
// */
//public class Main {
//
//    public static void main(String[] args) throws Exception {
//        Manage manager = new Manage();
//        Scanner sc = new Scanner(System.in);
//        int input;
//        boolean check = true;
//
//        do {
//            manager.display();
//            try {
//                System.out.print("Please provide your input: ");
//                input = Integer.parseInt(sc.nextLine());
//                switch (input) {
//                    case 1 -> {
//                        Worker newWorker = manager.gettingInput();
//                        if (manager.addWorker(newWorker)) {
//                            System.out.println("Worker added successfully.");
//                        } else {
//                            System.out.println("Worker already exists");
//                        }
//                    }
//                    case 2 -> {
//                        SalaryStatus status = manager.salarayChange(true);
//                        if (status != null) {
//                            manager.changeSalary(status, status.getId(), status.getSalary());
//                        } else {
//                            System.out.println("Worker not found");
//                        }
//                        
//                        
//                    }
//                    case 3 -> {
//                        SalaryStatus status = manager.salarayChange(false);
//                        if (status != null) {
//                            manager.changeSalary(status, status.getId(), status.getSalary());
//                        } else {
//                            System.out.println("Worker not found");
//                        }
//                        
//                        
//                    }
//                    case 4 -> {
//                        List<SalaryHistory> newList = manager.getInformationSalary();
//                        System.out.println(newList);
//                    }
//                    case 5 -> {
//                        check = false;
//                    }
//                    default -> System.out.println("Invalid option. Please choose a valid option.");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input. Please enter a valid number");
//            }
//        } while(check);
//    }
//
//}
