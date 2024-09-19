/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0006;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class BinarySearch {
    private int target;
    private int length;
    private int[] array;
    private int[] secondArray;

    public BinarySearch(int length, int target) {
        this.length = length;
        this.array = randomNumber(length);
        this.target = target;
        this.secondArray = bubbleSort(this.array);

    }

    public int binarySearch(int target) {
        int low = 0;
        
        int high = secondArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (secondArray[mid] == target) {
                return mid;
            } else if (secondArray[mid] < target) {
                low = mid + 1;
            } else {
                high = high - 1;
            }
        }
        return -1;
    }

    public int[] randomNumber(int len) {
        Random random = new Random();
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = random.nextInt(10);
        }
       

        return newArray;
    }

    public void display() {
        System.out.println("Unsorted array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(secondArray));
        int result = binarySearch(target);
        if (result != -1) {
            System.out.println("Found " + this.target + " at index: " + result);
        } else {
            System.out.println("Number: " + this.target + " not found");
        }
        
    }
    
    
    public int[] bubbleSort(int[] array) {
        int[] newArray = Arrays.copyOf(array, array.length);
        int temp = 0;
        for (int i = 0; i < newArray.length - 1; i++) {
            for (int j = 0; j < newArray.length - 1; j++) {
                if (newArray[j] < newArray[j + 1]) {
                    temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                }
            }
        }
        return newArray;
        
        
        
    }
}
