/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00562;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Display display = new Display();
        boolean check = true;
        
        do {
            display.meduDisplay();
            try {
                int num = Validation.inputRangeValid(1, 5, Const.TYPE);
                switch (num) {
                    case 1:
                        display.gettingWorkerInfo();
                        break;
                    case 2:
                        display.gettingAdjustedInput(true);
                        break;
                    case 3:
                        display.gettingAdjustedInput(false);
                        break;
                    case 4:
                        display.displayOutput();
                        break;
                    case 5:
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
