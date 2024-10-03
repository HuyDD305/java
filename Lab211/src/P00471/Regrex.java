/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P00471;

/**
 *
 * @author MSI
 */
public class Regrex {
    public final static String ID ="^\\d+$";
    public final static String NAME ="^[a-zA-Z\\s]+$";
    public final static String REGDOUBLE ="^(0|[1-9]\\d*)(\\.\\d+)?$";
//    public final static String DATE = "^(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
//    public final static String DATE = "^(0[1-9]|[12]\\d|3[01])-(0[1-9]|1[0-2])-\\d{4}$";
    public final static String DATE = "^(0?[1-9]|[12][0-9]|3[01])-(0?[1-9]|1[0-2])-(202[3-9]|20[3-9][0-9])$";

    public final static String TYPE ="^[1-4]$";
    

}
