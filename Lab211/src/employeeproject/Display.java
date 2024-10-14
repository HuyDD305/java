/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeproject;

/**
 *
 * @author ADMIN
 */
public class Display {

    Manage manage;

    public Display() {
        manage = new Manage();
    }

    public void gettingEmployeeInfo() throws Exception {
        System.out.println("---------Add Worker---------");
        System.out.print("ID: ");
        String id = Validation.inputStringValid(Const.ID);
        System.out.print("FirstName: ");
        String FirstName = Validation.inputStringValid(Const.NAME);
        System.out.print("LastName: ");
        String LastName = Validation.inputStringValid(Const.NAME);
        System.out.print("Phone: ");
        String phone = Validation.inputPhoneNumValid(Const.PHONE);
        System.out.print("Email: ");
        String email = Validation.inputEmailValid(Const.EMAIL);
        System.out.print("Address");
        String location = Validation.inputStringValid(Const.STRING);
        System.out.print("DOB ");
        String date = Validation.inputDateValid(Const.DATE);
        System.out.print("SEX");
        String sex = Validation.inputStringValid(Const.STRING);
        System.out.print("Salary");
        int salary = Validation.inputIntValid(Const.INT);
        System.out.print("Agency");
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
            System.out.println();
        }
    }

    public void sortOutput() {

        try {
            if (manage.sortBySalary().isEmpty()) {
                throw new Exception();
            } else {
                System.out.println("--------------------Display Information Salary--------------------");
                System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s", "ID", "First Name", "Last Name", "Phone", "Email", "Date", "Sex", "Salary", "Agency");

                for (Employee employee : manage.sortBySalary()) {

                    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getPhone(), employee.getEmail(), employee.getAddress(), employee.getDob(), employee.getSex(), employee.getSalary(), employee.getAgency());
                }
            }
        } catch (Exception e) {
            System.out.println("The list is empty, nothing to show");
        }

    }
    
    public void displayOutput() {

        try {
            if (manage.getList().isEmpty()) {
                throw new Exception();
            } else {
                System.out.println("--------------------Display Information Salary--------------------");
                System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s", "ID", "First Name", "Last Name", "Phone", "Email", "Date", "Sex", "Salary", "Agency");

                for (Employee employee : manage.getList()) {

                    System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getPhone(), employee.getEmail(), employee.getAddress(), employee.getDob(), employee.getSex(), employee.getSalary(), employee.getAgency());
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
        System.out.print("New First Name: ");
        String firstName = Validation.inputStringValid(Const.NAME);
        System.out.print("New Last Name: ");
        String lastName = Validation.inputStringValid(Const.NAME);
        System.out.print("New Phone: ");
        String phone = Validation.inputPhoneNumValid(Const.PHONE);
        System.out.print("New Email: ");
        String email = Validation.inputEmailValid(Const.EMAIL);
        System.out.print("New Address: ");
        String address = Validation.inputStringValid(Const.STRING);
        System.out.print("New DOB: ");
        String dob = Validation.inputDateValid(Const.DATE);
        System.out.print("New Sex: ");
        String sex = Validation.inputStringValid(Const.STRING);
        System.out.print("New Salary: ");
        int salary = Validation.inputIntValid(Const.INT);
        System.out.print("New Agency: ");
        String agency = Validation.inputStringValid(Const.STRING);

        manage.updateEmployee(id, firstName, lastName, phone, email, address, dob, sex, salary, agency);
        System.out.println("Employee information updated successfully.");
    }

}
