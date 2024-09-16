/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0006;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int input = sc.nextInt();
        
        System.out.println("Enter search value");
        int target = sc.nextInt();
        
        BinarySearch testing = new BinarySearch(input, target);
        testing.display();
        
    }
    
}
