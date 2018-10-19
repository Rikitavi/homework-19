package ru.mukhametzyanov;

import java.io.*;
import java.util.Scanner;

/**
 * В данном классе реализовано чтение данных из существующего файла text.txt
 * и вывод их в определенной форме.
 * @author  Ruslan Mukhametzyanov
 */
public class Task1 {
    private static String productName;
    private static String price;
    private static String quantity;
    private static String result;

    public static void main(String[] args) {
        try (FileReader fr = new FileReader("text.txt");
             Scanner scanner = new Scanner(fr)) {
            productName = "Product Name";
            price = "Price";
            result = "Sum";
            quantity = "Quantity";
            System.out.printf("%-10s %15s %15s %15s", productName, quantity, price, result);
            System.out.println();
            while (scanner.hasNext()) {
                int quantity = 0;
                double price = 0;
                double sum = 0;
                String productName = null;
                productName = scanner.next();
                quantity = scanner.nextInt();
                price = scanner.nextDouble();
                sum = quantity * price;
                System.out.printf("%-10s %17s %15s %15s\n", productName, quantity, price, sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
