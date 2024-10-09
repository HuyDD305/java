/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0064;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author MSI
 */
public class Validation {

    public static String inputPhoneNumValid(String phone) {
        String regex = Const.PHONE;

        while (true) {

            System.out.print("Phone number: ");
            if (!phone.matches(regex)) {
                return "Phone number must be number";
            }
            int num = Integer.parseInt(phone);
            if (num < 10) {
                return "Phone number must be 10 digits";
            } else {
                return "";
            }
        }

    }



public static String inputEmailValid(String mail) {
        String regex = Const.EMAIL;

        while (true) {

            System.out.print("Email: ");
            if (mail.matches(regex)) {

                return "";
            } else {
                return "Email must is correct format";
            }
        }
    }

    public static String inputDateValid(String date) {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

        formatDate.setLenient(false);
        while (true) {
            try {

                formatDate.parse(date);
            } catch (Exception e) {
                return "Date to correct format(dd/MM/yyyy)";
            }
        }
    }
}
