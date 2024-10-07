/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0074;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Display {

    public static void display() {
        System.out.println("=======Calculator program=======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
        System.out.println("Your choice:");

    }
            

    public int[][] input() throws Exception {

        int row;
        int col;

        System.out.print("Enter Row Matrix: ");
        row = Validation.getIntValid(Const.INT);
        System.out.print("Enter Column Matrix: ");
        col = Validation.getIntValid(Const.INT);
        
        int[][] matrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter Matrix" + "[" + i + "]" + "[" + j + "]" + ":");
                matrix[i][j] = Validation.getMatrixValid(Const.INT);
            }

        }

        return matrix;

    }
}
}
