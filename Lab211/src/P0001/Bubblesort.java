/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0001;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class Bubblesort {

    private int length;
    private int[] array;

    public Bubblesort(int length) {
        this.length = length;
        this.array = randomNumber(length);
    }

    public int[] bubbleSort(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        int temp = 0;
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - 1; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
        
        
        
    }

    public int[] randomNumber(int len) {
        Random random = new Random();

        int[] testArray = new int[len];
        for (int i = 0; i < len; i++) {
            testArray[i] = random.nextInt(20) - 10;
        }
        return testArray;
    }

    public void display() {
        System.out.println("Unsorted array: " + Arrays.toString(this.array));
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(this.array)));
        

    }
}
