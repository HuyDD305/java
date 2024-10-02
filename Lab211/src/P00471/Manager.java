/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00471;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Manager {

    private List<Task> taskList;
    private List<TaskType> typeList;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

    public Manager() {
        taskList = new ArrayList<>();
        typeList = new ArrayList<>();
        typeList.add(new TaskType(1, "Code"));
        typeList.add(new TaskType(2, "Test"));
        typeList.add(new TaskType(3, "Design"));
        typeList.add(new TaskType(4, "Review"));
    }

    public int addTask(String requirementName, String TaskTypeID, String date, String planForm, String planTo, String assignee, String reviewer) throws Exception {
        int id = taskList.size() + 1;
        int typeID = Integer.parseInt(TaskTypeID);
        TaskType type = findTypeById(typeID);

        double from = Double.parseDouble(planForm);
        double to = Double.parseDouble(planTo);

        if (type == null) {
            throw new Exception("Type is Null");
        }

        Date dateTesting = dateFormat.parse(date);

        if (planForm >= planTo || planForm < 8 || planForm > 17.5 || planTo > 17.5 || planTo < 8) {
            throw new Exception("Invalid input for planTo and planForm");
        }
        Task task = new Task(id, type, requirementName, dateTesting, planForm, planTo, assignee, reviewer);
        if (this.taskList.add(task)) {
            return 1;
        } else {
            return -1;
        }

    }

    public void deleteTask(int id) throws Exception {
        Task task = findTaskById(id);
        if (task == null) {
            throw new Exception("Can't find task");
        } else {
            taskList.remove(task);

        }
    }

    public List<Task> printAll() {
        return this.taskList;
    }

    public TaskType findTypeById(int id) {
        for (TaskType type : typeList) {
            if (type.getId() == id) {
                return type;
            }

        }
        return null;
    }

    public Task findTaskById(int id) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

}
