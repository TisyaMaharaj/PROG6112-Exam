/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question1;

/**
 *
 * @author mahar
 */
public class Main {

    public static void main(String[] args) {

        // Single-dimensional array for the quarters
        String[] quarters = {
            "Quarter 1", "Quarter 2", "Quarter 3"
        };

        // Two-dimensional array for sales over two years
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Create an object of ProductSales
        ProductSales sales = new ProductSales();

        // Display the sales report
        System.out.println("PRODUCT SALES REPORT");
        System.out.println("---------------------");

        for (int i = 0; i < productSales.length; i++) {
            System.out.println("\nYear " + (i + 1));

            for (int j = 0; j < productSales[i].length; j++) {
                System.out.println(quarters[j] + ": R" + productSales[i][j]);
            }
        }

        // Display calculations
        System.out.println("\nTOTAL SALES: R" + sales.TotalSales(productSales));
        System.out.println("AVERAGE SALES: R" + sales.AverageSales(productSales));
        System.out.println("MAXIMUM SALE: R" + sales.MaxSale(productSales));
        System.out.println("MINIMUM SALE: R" + sales.MinSale(productSales));
    }
}
