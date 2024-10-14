/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeeproject;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Manage {

    private List<Employee> list;

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
        List<Employee> newList = new ArrayList(this.list);
        for (int i = 0; i < newList.size() - 1; i++) {
            for (int j = 0; j < newList.size() - 1; j++) {
                if (newList.get(j).getSalary() > newList.get(j + 1).getSalary()) {
                    Employee temp = newList.get(j);
                    newList.set(j, newList.get(j + 1));
                    newList.set(j + 1, temp);
                }
            }
        }
        return newList;

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
