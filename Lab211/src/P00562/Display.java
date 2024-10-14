/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00562;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author MSI
 */
public class Display {

    Manage manage;

    public Display() {
        manage = new Manage();
    }

    public void meduDisplay() {
        System.out.println("========Worker Management========");
        System.out.println("1. Add Worker");
        System.out.println("2. Up Salary");
        System.out.println("3. Down Salary");
        System.out.println("4. Display Information Salary");
        System.out.println("5. Exit");

    }

    public void gettingWorkerInfo() throws Exception {
        System.out.println("---------Add Worker---------");
        System.out.print("Enter Code: ");
        String code = Validation.inputStringValid(Const.ID);

        System.out.print("Enter Name: ");
        String name = Validation.inputStringValid(Const.STRING);

        System.out.print("Enter Age: ");
        int age = Validation.inputAgeValid(Const.INT);

        System.out.print("Enter Salary: ");
        int salary = Validation.inputMoneyValid(Const.INT);

        System.out.print("Enter work location: ");
        String location = Validation.inputStringValid(Const.STRING);

        manage.addWorker(code, name, age, salary, location);
    }

    public void gettingAdjustedInput(boolean status) throws Exception {
        System.out.println("------- Up/Down Salary -------");
        System.out.print("Enter Code: ");
        String code = Validation.inputStringValid(Const.ID);

        System.out.print("Enter Salary: ");
        int salary = Validation.inputMoneyValid(Const.INT);

        manage.adjustedSalary(code, salary, status);

    }

    public void displayOutput() {

        try {
            if (manage.getAllList().isEmpty()) {
                throw new Exception();
            } else {
                System.out.println("--------------------Display Information Salary--------------------");
                System.out.printf("%-7s %-10s %-10s %-10s %-10s %-10s%n", "Code", "Name", "Age", "Salary", "Status", "Date");
                
                for (SalaryHistory worker : manage.getAllList()) {
                    
                    System.out.printf("%-7s %-10s %-10s %-10s %-10s %-10s%n", worker.getWorker().getId(), worker.getWorker().getName(), worker.getWorker().getAge(), worker.getMoney(), worker.getStatus(), worker.getDate());
                }
            }
        } catch (Exception e) {
            System.out.println("The list is empty, nothing to show");
        }

    }
    
    public void displayOutputToFile(String filename) throws Exception  {
        try (PrintWriter writer = new PrintWriter(filename)) {
            if (manage.getAllList().isEmpty()) {
                throw new Exception("The list is empty, nothing to write");
            } else {
                writer.println("--------------------Display Information Salary--------------------");
                writer.printf("%-7s %-10s %-10s %-10s %-10s %-10s%n", "Code", "Name", "Age", "Salary", "Status", "Date");
                for (SalaryHistory worker : manage.getAllList()) {
                    
                    writer.printf("%-7s %-10s %-10s %-10s %-10s %-10s%n", worker.getWorker().getId(), worker.getWorker().getName(), worker.getWorker().getAge(), worker.getMoney(), worker.getStatus(), worker.getDate());
                }
            }
            
        } catch(IOException e) {
            System.out.println("Error writing to file: " + e.getMessage()); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
