/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeeproject;

/**
 *
 * @author ADMIN
 */
public class EmployeeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Display display = new Display();
        boolean check = true;
        
        do {
            display.meduDisplay();
            try {
                int num = Validation.inputRangeValid(1, 6, Const.TYPE);
                switch (num) {
                    case 1:
                        display.gettingEmployeeInfo();
                        break;
                    case 2:
                        display.updateEmployeeInfo();
                        break;
                    case 3:
                        display.gettingDelInput();
                        break;
                    case 4:
                        display.searchEmployee();
                        break;
                    case 5:
                        display.sortOutput();
                        break;
                    case 6:
                        System.out.println("System existing...");
                        check = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } while (check);
    }
    
}
