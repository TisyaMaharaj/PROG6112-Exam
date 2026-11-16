/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

/**
 *
 * @author mahar
 */
public class ProductSales implements IProductSales {

    // Store the sales limit
    private final int SALES_LIMIT = 500;

    // Store product sales for two years
    private final int[][] productSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    // Return the product sales array
    @Override
    public int[][] GetProductSales() {
        return productSales;
    }

    // Calculate total sales
    @Override
    public int GetTotalSales() {

        int total = 0;

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {

                total += productSales[i][j];
            }
        }

        return total;
    }

    // Count sales above the sales limit
    @Override
    public int GetSalesOverLimit() {

        int count = 0;

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {

                if (productSales[i][j] > SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    // Count sales below the sales limit
    @Override
    public int GetSalesUnderLimit() {

        int count = 0;

        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {

                if (productSales[i][j] < SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    // Return the number of years processed
    @Override
    public int GetProductsProcessed() {
        return productSales.length;
    }

    // Calculate average sales
    @Override
    public double GetAverageSales() {

        int total = GetTotalSales();
        int count = 0;

        for (int i = 0; i < productSales.length; i++) {
            count += productSales[i].length;
        }

        return (double) total / count;
    }
}
