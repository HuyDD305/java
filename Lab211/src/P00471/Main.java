/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00471;

import P00471.Display;

/**
 *
 * @author ADMIN
 */
public class Main {

    public static void main(String[] args) throws Exception {
        boolean check = true;
        Display display = new Display();

        do {
            display.menuDisplay();
            try {
                int input = Validation.checkInputRange(0, 5);
                switch (input) {
                    case 1:
                        display.gettingAddInput();
                        break;
                    case 2: 
                        display.gettingDelInput();
                        break;
                    case 3:
                        display.printAll();
                        break;
                    case 4:
                        check = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }

        } while (check);
    }
}
