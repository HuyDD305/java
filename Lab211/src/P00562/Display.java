/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00562;

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
                    
                    System.out.printf("%-7s %-10s %-10s %-10s %-10s %-10s%n", worker.getWorker().getId(), worker.getWorker().getName(), worker.getWorker().getAge(), worker.getWorker().getSalary(), worker.getStatus(), worker.getDate());
                }
            }
        } catch (Exception e) {
            System.out.println("The list is empty, nothing to show");
        }

    }

}
