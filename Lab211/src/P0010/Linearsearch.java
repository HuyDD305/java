/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0010;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class Linearsearch {
    private int target;
    private int length;
    private int[] array;
    private int[] secondArray;
    
    public Linearsearch(int length, int target) {
        this.target = target;
        this.length = length;
        this.array = random();
    }
    
    public int[] random() {
        Random random = new Random();
        int[] newArray = new int[this.length];
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = random.nextInt(10);
        }
        return newArray;
    }
    
    public int LinearSearch(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == this.target) {
                return i;
            }
            
        }
        return -1;
    }
    
    public void display() {
        System.out.println("The array: " + Arrays.toString(this.array));
        int result = LinearSearch(this.array);
        if (result != -1) {
            System.out.println("Found " + this.target + " at " + result); 
        }
    }
    
}
