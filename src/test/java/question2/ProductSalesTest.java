/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mahar
 */
public class ProductSalesTest {

    // Test the number of sales over the limit
    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {

        ProductSales sales = new ProductSales();

        int result = sales.GetSalesOverLimit();

        assertEquals(2, result);
    }

    // Test the number of sales under the limit
    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {

        ProductSales sales = new ProductSales();

        int result = sales.GetSalesUnderLimit();

        assertEquals(4, result);
    }
}
