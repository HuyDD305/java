/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReadingFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author MSI
 */
public class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("files/testing.txt")) {
            char[] block = new char[1000];
            int data;
            while ((data = reader.read(block)) != -1) {
                String content = new String(block, 0 , data);
                System.out.printf("---> [%d chars] %s%n", data, content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("files/testing.txt"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println("--------------------------------");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("files/testing.txt"))) {
            bufferedReader.lines().forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
