/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00471;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Task {
    private int id;
    private TaskType taskType;
    private String requirementName;
    private Date date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String expert;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    private static int nextID = 1;

    public Task(TaskType taskType, String requirementName, Date date, double planFrom, double planTo, String assignee, String expert) {
        setId();
        this.taskType = taskType;
        this.requirementName = requirementName;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.expert = expert;
    }

    public int getId() {
        return id;
    }

    public String getTaskType() {
        return taskType.getName();
    }

    public String getRequirementName() {
        return requirementName;
    }

    public String getDate() {
        return dateFormat.format(date);
    }

    public double getPlanFrom() {
        return planFrom;
    }

    public double getPlanTo() {
        return planTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getReviewer() {
        return expert;
    }

    public void setId() {
        this.id = nextID;
        nextID++;
    }
    
    

    @Override
    public String toString() {
        return id + " - " + taskType.getName() + " - " + requirementName + " - " + getDate() + " - " + planFrom + " to " + planTo + " - " + assignee + " - " + expert;
    }
}
