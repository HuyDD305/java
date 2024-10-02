/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00471;

import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Display {

    Manager manager;

    public Display() {
        manager = new Manager();
    }
    
    
    public void menuDisplay() {
        System.out.println("=========Task Program=========");
    }

    public void gettingAddInput() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Add Task----------");
        System.out.print("Requirement Name: ");
        String name = Validation.inputString(Regrex.NAME);

        System.out.print("TaskType: ");
        String taskType = Validation.inputTypeValid(Regrex.TYPE);

        System.out.print("Date: ");
        String date = Validation.inputDateValid(Regrex.DATE);

        System.out.print("From: ");
        String from = Validation.inputDoubleValid(Regrex.REGDOUBLE);

        System.out.print("To: ");
        String to = Validation.inputDoubleValid(Regrex.REGDOUBLE);

        System.out.print("Assignee: ");
        String assignee = Validation.inputString(Regrex.NAME);

        System.out.print("Reviewer: ");
        String reviewer = Validation.inputString(Regrex.NAME);

        int result = manager.addTask(name, taskType, date, from, to, assignee, reviewer);
        if (result > 1) {
            System.out.println("Added successfully");
        } else {
            System.out.println("Added unsuccessfully");
        }

    }
}
