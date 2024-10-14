/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeproject;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Display {

    Manage manage;

    public Display() {
        manage = new Manage();
    }

    public void meduDisplay() {
        System.out.println("========Worker Management========");
        System.out.println("1. Add Employee");
        System.out.println("2. Update Employees");
        System.out.println("3. Remove Employees");
        System.out.println("4. Search Employees");
        System.out.println("5. Sort employees by salary");
        System.out.println("6. Exit");

    }

    public void gettingEmployeeInfo() throws Exception {
        System.out.println("---------Add Worker---------");
        System.out.print("ID: ");
        String id = Validation.inputStringValid(Const.ID);
        System.out.print("FirstName: ");
        String FirstName = Validation.inputStringValid(Const.STRING);
        System.out.print("LastName: ");
        String LastName = Validation.inputStringValid(Const.STRING);
        System.out.print("Phone: ");
        String phone = Validation.inputPhoneNumValid(Const.INT);
        System.out.print("Email: ");
        String email = Validation.inputEmailValid(Const.EMAIL);
        System.out.print("Address: ");
        String location = Validation.inputStringValid(Const.STRING);
        System.out.print("DOB: ");
        String date = Validation.inputDateValid(Const.DATE);
        System.out.print("SEX: ");
        String sex = Validation.inputStringValid(Const.STRING);
        System.out.print("Salary: ");
        int salary = Validation.inputIntValid(Const.INT);
        System.out.print("Agency: ");
        String agency = Validation.inputStringValid(Const.STRING);

        manage.addEmployee(id, FirstName, LastName, phone, email, location, date, sex, salary, agency);

    }

    public void gettingDelInput() throws Exception {
        System.out.println("----------Del Task----------");
        System.out.print("ID: ");
        String id = Validation.inputStringValid(Const.ID);
        manage.deleteEmployee(id);
    }

    public void searchEmployee() throws Exception {
        System.out.println("----------Search Employee----------");
        System.out.print("ID: ");
        String id = Validation.inputStringValid(Const.ID);
        Employee employee = manage.findEmployeeById(id);
        if (employee == null) {
            System.out.println("Can not find the employee by id: ");
        } else {
            System.out.println("--------------------Employee Details--------------------");
            System.out.printf("%-10s %-15s %-15s %-12s %-25s %-12s %-15s %-15s %-15s %-15s%n", "ID", "First Name", "Last Name", "Phone", "Email", "Address", "DOB", "Sex", "Salary", "Agency");
            System.out.printf("%-10s %-15s %-15s %-12s %-25s %-12s %-15s %-15s %-15s %-15s%n", employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getPhone(), employee.getEmail(),employee.getAddress(), employee.getDob(), employee.getSex(), employee.getSalary(), employee.getAgency());
        }
    }

    public void sortOutput() {

        try {
            if (manage.sortBySalary().isEmpty()) {
                throw new Exception();
            } else {
                System.out.println("--------------------Display Information Salary--------------------");
                System.out.printf("%-10s %-15s %-15s %-12s %-25s %-12s %-15s %-15s %-15s %-15s%n", "ID", "First Name", "Last Name", "Phone", "Email", "Address", "DOB", "Sex", "Salary", "Agency");

                for (Employee employee : manage.sortBySalary()) {

                    System.out.printf("%-10s %-15s %-15s %-12s %-25s %-12s %-15s %-15s %-15s %-15s%n", employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getPhone(), employee.getEmail(),employee.getAddress(), employee.getDob(), employee.getSex(), employee.getSalary(), employee.getAgency());
                }
            }
        } catch (Exception e) {
            System.out.println("The list is empty, nothing to show");
        }

    }

    public void updateEmployeeInfo() throws Exception {
        System.out.println("---------Update Employee Information---------");
        System.out.print("Enter the ID of the employee to update: ");
        String id = Validation.inputStringValid(Const.ID);
        Employee employee = manage.findEmployeeById(id);
        if (employee == null) {
            System.out.println("Cannot find employee with ID: " + id);
            return;
        }
        Scanner sc = new Scanner(System.in);

        System.out.print("New First Name [press Enter to skip]: ");
        String firstName = sc.nextLine().trim();
        if (firstName.isEmpty()) {
            firstName = employee.getFirstName();
        } else if (!firstName.matches(Const.STRING)) {
            System.out.println("Invalid First Name format. Keeping the existing value.");
            firstName = employee.getFirstName();
        }

        System.out.print("New Last Name [press Enter to skip]: ");
        String lastName = sc.nextLine().trim();
        if (lastName.isEmpty()) {
            lastName = employee.getLastName();
        } else if (!lastName.matches(Const.STRING)) {
            System.out.println("Invalid Last Name format. Keeping the existing value.");
            lastName = employee.getLastName();
        }

        System.out.print("New Phone [press Enter to skip]: ");
        String phone = sc.nextLine().trim();
        if (phone.isEmpty()) {
            phone = employee.getPhone();
        } else if (!phone.matches(Const.PHONE)) {
            System.out.println("Invalid Phone format. Keeping the existing value.");
            phone = employee.getPhone();
        }

        System.out.print("New Email [press Enter to skip]: ");
        String email = sc.nextLine().trim();
        if (email.isEmpty()) {
            email = employee.getEmail();
        } else if (!email.matches(Const.EMAIL)) {
            System.out.println("Invalid Email format. Keeping the existing value.");
            email = employee.getEmail();
        }

        System.out.print("New Address [press Enter to skip]: ");
        String address = sc.nextLine().trim();
        if (address.isEmpty()) {
            address = employee.getAddress();
        }

        System.out.print("New DOB [press Enter to skip]: ");
        String dob = sc.nextLine().trim();
        if (dob.isEmpty()) {
            dob = employee.getDob();
        } else if (!dob.matches(Const.DATE)) {
            System.out.println("Invalid DOB format. Keeping the existing value.");
            dob = employee.getDob();
        }

        System.out.print("New Sex [press Enter to skip]: ");
        String sex = sc.nextLine().trim();
        if (sex.isEmpty()) {
            sex = employee.getSex();
        } else if (!sex.matches(Const.STRING)) {
            System.out.println("Invalid Sex format. Keeping the existing value.");
            sex = employee.getSex();
        }

        System.out.print("New Salary [press Enter to skip]: ");
        String salaryInput = sc.nextLine().trim();
        int salary = employee.getSalary();
        if (!salaryInput.isEmpty()) {
            try {
                salary = Integer.parseInt(salaryInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid Salary input. Keeping the existing value.");
                salary = employee.getSalary();
            }
        }

        System.out.print("New Agency [press Enter to skip]: ");
        String agency = sc.nextLine().trim();
        if (agency.isEmpty()) {
            agency = employee.getAgency();
        } else if (!agency.matches(Const.STRING)) {
            System.out.println("Invalid Agency format. Keeping the existing value.");
            agency = employee.getAgency();
        }

        manage.updateEmployee(id, firstName, lastName, phone, email, address, dob, sex, salary, agency);
        System.out.println("Employee information updated successfully.");
    }

}
