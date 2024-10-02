/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00471;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
    
    
    
}
