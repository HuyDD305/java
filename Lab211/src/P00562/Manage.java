/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00562;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
    private static final String WORKERS_FILE = "workers.txt";
    private static final String SALARY_HISTORY_FILE = "salary_history.txt";
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public Manage() {
        this.list = new ArrayList<>();
        this.salaryHistory = new ArrayList<>();
        loadWorkersFromFile();
        loadSalaryHistoryFromFile();
    }

    public void addWorker(String id, String name, int age, int salary, String workLocation) throws Exception {
        if (isDuplicated(id) || id == null) {
            throw new Exception("Code(id) cannot be null or duplicated with existed Code in DB");
        }

        Worker worker = new Worker(id, name, age, salary, workLocation);
        list.add(worker);
        saveWorkersToFile();

    }
    
    private void loadWorkersFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(WORKERS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length == 5) {
                    String id = parts[0];
                    String name = parts[1];
                    int age = Integer.parseInt(parts[2]);
                    int salary = Integer.parseInt(parts[3]);
                    String workLocation = parts[4];
                    Worker worker = new Worker(id, name, age, salary, workLocation);
                    list.add(worker);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading workers file: " + e.getMessage());
        }
    }
    
    private void loadSalaryHistoryFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(SALARY_HISTORY_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length == 4) {
                    String workerId = parts[0];
                    LocalDate date = LocalDate.parse(parts[1], DATE_FORMAT);
                    String status = parts[2];
                    int money = Integer.parseInt(parts[3]);
                    Worker worker = findWorkerById(workerId);
                    if (worker != null) {
                        SalaryHistory history = new SalaryHistory(worker, date, status, money);
                        salaryHistory.add(history);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading salary history file: " + e.getMessage());
        }
    }

    public void adjustedSalary(String code, int money, boolean status) throws Exception {
        Worker worker = findWorkerById(code);
        SalaryHistory history = findSalaryHistory(code);

        if (list.isEmpty()) {
            throw new Exception("The list is Null, nothing need to be added");
        }

        if (worker == null) {
            throw new Exception("Can't find worker by id");
        }
        LocalDate date = LocalDate.now();
        SalaryHistory workerChanged;

        if (status == true) {
            int change;

            if (history != null) {
                change = history.getMoney() + money;
            } else {
                change = worker.getSalary() + money;
            }
            workerChanged = new SalaryHistory(worker, date, "UP", change);
            salaryHistory.add(workerChanged);
        } else {
            int change;
            if (history != null) {
                if (history.getMoney() - money < 0) {
                    throw new Exception("Money can't be higer than current money");
                } else {
                    change = history.getMoney() - money;
                }
                
            } else {
                if (worker.getSalary() - money < 0) {
                    throw new Exception("Money can't be higer than current money");
                } else {
                    change = worker.getSalary() - money;
                }
            }
            workerChanged = new SalaryHistory(worker, date, "DOWN", change);
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

    public SalaryHistory findSalaryHistory(String id) {
        for (SalaryHistory worker : salaryHistory) {
            if (worker.getWorker().getId().equals(id)) {
                return worker;
            }
        }
        return null;
    }
    
    private void saveWorkersToFile() {
        try (PrintWriter writer = new PrintWriter(WORKERS_FILE)) {
            for (Worker worker : list) {
                writer.printf("%s,%s,%d,%d,%s%n",
                        worker.getId(),
                        worker.getName(),
                        worker.getAge(),
                        worker.getSalary(),
                        worker.getWorkLocation());
            }
        } catch (IOException e) {
            System.out.println("Error writing to workers file: " + e.getMessage());
        }
    }
    
    
    }



