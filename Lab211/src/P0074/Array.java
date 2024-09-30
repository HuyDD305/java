/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0074;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Array {

    int[][] array;
    private static int count = 1;
    private int id;

    public int getID() {
        return this.id;
    }

    Scanner sc = new Scanner(System.in);

    public Array() {
        this.id = count;
        count++;
        this.array = input();

    }

    public int[][] input() {

        int row;
        int col;
        

        System.out.print("Enter Row Matrix" + getID() + ":");
        row = checkValidInput();
        System.out.print("Enter Column Matrix" + getID() + ":");
        col = checkValidInput();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matrix" + "[" + i + "]" + "[" + j + "]" + ":");
                matrix[i][j] = checkValidInput();
            }

        }

        return matrix;

    }

    public void printArray() {

        for (int i = 0; i < this.array.length; i++) {
            System.out.println(Arrays.toString(this.array[i]));

        }
    }

    private int checkValidInput() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine());
                return result;

            } catch (NumberFormatException e) {
                System.out.println("Values of matrix must be the number");
            }
        }
    }

}
