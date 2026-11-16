/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package question2;

/**
 *
 * @author mahar
 */
public interface IProductSales {

    // Returns the product sales data
    int[][] GetProductSales();

    // Returns the total sales
    int GetTotalSales();

    // Returns the number of sales over the limit
    int GetSalesOverLimit();

    // Returns the number of sales under the limit
    int GetSalesUnderLimit();

    // Returns the number of years processed
    int GetProductsProcessed();

    // Returns the average sales
    double GetAverageSales();
}
