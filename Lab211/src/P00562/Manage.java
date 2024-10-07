/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00562;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Manage {

    private List<Worker> list;
    private List<SalaryHistory> salaryHistory;
    
    public Manage() {
        this.list = new ArrayList<>();
        this.salaryHistory = new ArrayList<>();
    }
    
    public void addWorker(String id, String name, int age, int salary, String workLocation) throws Exception {
        if (isDuplicated(id) || id == null) {
            throw new Exception("Code(id) cannot be null or duplicated with existed Code in DB");
        }
        
        Worker worker = new Worker(id, name, age, salary, workLocation);
        list.add(worker);
        
    }
    
    public void adjustedSalary(String code, int money, boolean status) throws Exception {
        Worker worker = findWorkerById(code);
        
        if (list.isEmpty()) {
            throw new Exception("The list is Null, nothing need to be added");
        }
        
        if (worker == null) {
            throw new Exception("Can't find worker by id");
        }
        LocalDate date = LocalDate.now();
        SalaryHistory workerChanged;
        
        if (status == true) {
            worker.setSalary(worker.getSalary() + money);
            workerChanged= new SalaryHistory(worker, date, "UP");
            salaryHistory.add(workerChanged);
        } else {
            worker.setSalary(worker.getSalary() - money);
            workerChanged= new SalaryHistory(worker, date, "DOWN");
            salaryHistory.add(workerChanged);
        }
        
        
    }
    public int gettingIntID(SalaryHistory worker) {
        return Integer.parseInt(worker.getWorker().getId().substring(1));
    }

    
    
    public List<SalaryHistory> getAllList() {
        for (int i = 0; i < this.salaryHistory.size() - 1; i++) {
            for (int j = 0; j < this.salaryHistory.size() - 1; j++) {
                if (gettingIntID(this.salaryHistory.get(j)) > gettingIntID(this.salaryHistory.get(j + 1))) { 
                    SalaryHistory temp = this.salaryHistory.get(j);
                    this.salaryHistory.set(j, this.salaryHistory.get(j + 1));
                    this.salaryHistory.set(j + 1, temp);
                }
            }
            
        }
        return this.salaryHistory;
    }
    
    public boolean isDuplicated(String id) {
        if (list.isEmpty()) {
            return false;
        }
        
        for (Worker worker : this.list) {
            if (worker.getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

    public Worker findWorkerById(String id) {
        for (Worker worker : this.list) {
            if (worker.getId().equals(id)) {
                return worker;
            }
        }
        return null;
    }



}
