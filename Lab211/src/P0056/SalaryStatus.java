/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0056;

/**
 *
 * @author MSI
 */
public class SalaryStatus extends Worker{
    private String status;

    public SalaryStatus(String status, String name, int id, int age, double salary, String workLocation) {
        super(name, id, age, salary, workLocation);
        this.status = status;
    }
    
    
    
}
