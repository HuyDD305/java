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

    public BinarySearch(int length, int target) {
        this.length = length;
        this.array = randomNumber(length);
        this.target = target;

    }

    public int binarySearch(int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
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
        Arrays.sort(newArray);

        return newArray;
    }

    public void display() {
        System.out.println("Sorted array: " + Arrays.toString(array));
        int result = binarySearch(target);
        if (result != -1) {
            System.out.println("Found " + this.target + " at index: " + result);
        } else {
            System.out.println("Number: " + this.target + " not found");
        }
        
    }

}
