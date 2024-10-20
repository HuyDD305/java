/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P0074;

/**
 *
 * @author MSI
 */
public class Matrix {

    private int row;
    private int col;
    private int[][] array;

    public Matrix(int Row, int Col, int[][] array) {
        this.row = Row;
        this.col = Col;
        this.array = array;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int Row) {
        this.row = Row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int Col) {
        this.col = Col;
    }

    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] array) {
        this.array = array;
    }
    
    public Matrix additionMatrix(Matrix other) throws Exception {
        int row = this.row;
        int col = this.col;
        
        int[][] arrayResult = new int[row][col];
        
        if (this.row != other.getRow() || this.col != other.getCol()) {
            throw new Exception("Dimension not valid for calculation");
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arrayResult[i][j] = this.array[i][j] + other.getArray()[i][j];
                }
            }
        }
        Matrix result = new Matrix(row, col, arrayResult);
        return result;
    }
    
    public Matrix subtractionMatrix(Matrix other) throws Exception {
        int row = this.row;
        int col = this.col;
        
        int[][] arrayResult = new int[row][col];
        
        if (this.row != other.getRow() || this.col != other.getCol()) {
            throw new Exception("Dimension not valid for calculation");
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    arrayResult[i][j] = this.array[i][j] - other.getArray()[i][j];
                }
            }
        }
        Matrix result = new Matrix(row, col, arrayResult);
        return result;
    }
    
    public Matrix multiplicationMatrix(Matrix other) throws Exception {
        int row = this.row;
        int col = other.getCol();
        
        int[][] arrayResult = new int[row][col];
        
        if (this.col != other.getRow()) {
            throw new Exception("Dimension not valid for calculation");
        } else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    for (int k = 0; k < row; k++) {
                        arrayResult[i][j] += this.array[i][k]
                    }
                }
            }
        }
        Matrix result = new Matrix(row, col, arrayResult);
        return result;
    }
}
