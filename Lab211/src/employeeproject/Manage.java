/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Manage {

    private List<Employee> list;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public Manage() {
        this.list = new ArrayList<>();
    }

    public void addEmployee(String id, String FirstName, String LastName, String phone, String email, String location, String date, String sex, int salary, String agency) throws Exception {
        if (isDuplicated(id) || id == null) {
            throw new Exception("Code(id) cannot be null or duplicated with existed Code in DB");
        }
  

        Employee employee = new Employee(id, FirstName, LastName, phone, email, location, date, sex, salary, agency);
        list.add(employee);

    }

    public void deleteEmployee(String id) throws Exception {
        Employee employee = findEmployeeById(id);
        if (employee == null) {
            throw new Exception("Can't find employee with ID: " + id);
        } else {
            list.remove(employee);

        }
    }

    public boolean isDuplicated(String id) {
        if (list.isEmpty()) {
            return false;
        }

        for (Employee employee : this.list) {
            if (employee.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public Employee findEmployeeById(String id) {
        for (Employee employee : list) {
            if (employee.getId().equals(id)) {
                return employee;
            }

        }
        return null;
    }

    public List<Employee> sortBySalary() {
        
        for (int i = 0; i < this.list.size() - 1; i++) {
            for (int j = 0; j < this.list.size() - 1; j++) {
                if (this.list.get(j).getSalary() > this.list.get(j + 1).getSalary()) {
                    Employee temp = this.list.get(j);
                    this.list.set(j, this.list.get(j + 1));
                    this.list.set(j + 1, temp);
                }
            }
        }
        return this.list;

    }
    
    public List<Employee> getList() {
        
        return this.list;

    }

    public void updateEmployee(String id, String firstName, String lastName, String phone, String email, String address, String dob, String sex, int salary, String agency) throws Exception {
        Employee employee = findEmployeeById(id);
        if (employee == null) {
            throw new Exception("Can't find employee with ID: " + id);
        }
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setPhone(phone);
        employee.setEmail(email);
        employee.setAddress(address);
        employee.setDob(dob);
        employee.setSex(sex);
        employee.setSalary(salary);
        employee.setAgency(agency);
    }

}
