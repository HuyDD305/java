/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00562;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author MSI
 */
public class SalaryHistory {
    private Worker worker;
    private LocalDate date;
    private String status;
    private static final DateTimeFormatter  dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public SalaryHistory() {
        
    }
    
    public SalaryHistory(Worker worker, LocalDate date, String status) {
        this.worker = worker;
        this.date = date;
        this.status = status;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public String getDate() {
        return this.date.format(dateFormat);
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    
}
