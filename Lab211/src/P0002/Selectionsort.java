/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0002;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class Selectionsort {
    private int length;
    private int[] array;
    
    public Selectionsort(int length) {
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
    
    public int[] selectionSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }
    
    public void display() {
        System.out.println("The unsorted array: " + Arrays.toString(this.array));
        System.out.println("The sorted array: " + Arrays.toString(selectionSort(this.array)));
    }
}
