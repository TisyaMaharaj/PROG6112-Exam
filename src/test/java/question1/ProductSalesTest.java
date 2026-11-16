/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductSalesTest {

    int[][] productSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    ProductSales sales = new ProductSales();

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        assertEquals(2200, sales.TotalSales(productSales));
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        assertEquals(366.6667,
                sales.AverageSales(productSales), 0.001);
    }
}