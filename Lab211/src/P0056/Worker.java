/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0056;

/**
 *
 * @author MSI
 */
public class Worker {
    
    private String name;
    private int id;
    private int age;
    private double salary;
    private String workLocation;
    
    public Worker(String name, int id, int age, double salary, String workLocation) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        
    }
    

    public String getName() {
        return name;
    }

    public int getId() {
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
    
    
    
    
    
}
