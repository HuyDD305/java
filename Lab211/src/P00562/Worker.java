/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00562;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author MSI
 */
public class Worker {
    
    private String name;
    private String id;
    private int age;
    private double salary;
    private String workLocation;
    private boolean salaryAdjusted;
    LocalDateTime addedDate;
    
    
    public Worker() {
        
    }
    
    public Worker(String name, String id, int age, double salary, String workLocation) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        this.salaryAdjusted = false;
        
    }
    

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        this.salaryAdjusted = true;
        this.addedDate = LocalDateTime.now();
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    public boolean isSalaryAdjusted() {
        return salaryAdjusted;
    }
    
    public String getAddedDateFormatted() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return addedDate.format(formatter); // Format the date and time
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", id=" + id + ", age=" + age + ", salary=" + salary + ", workLocation=" + workLocation + ", salaryAdjusted=" + salaryAdjusted + ", addedDate=" + addedDate + '}';
    }
    
    
    
    
    
    
    
    
    
}
