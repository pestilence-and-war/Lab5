/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Master
 */
public class ArrayFunctionsTest {
    
    public ArrayFunctionsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        double[] arrIn = {1,2,3,4,5,6};
        double expResult = 21.0;
        double result = ArrayFunctions.getTotal(arrIn);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testGetAverage() {
        System.out.println("getAverage");
        double[] arrIn = {1,2,3,4,5,6};
        double expResult = 3.5;
        double result = ArrayFunctions.getAverage(arrIn);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testGetHighest() {
        System.out.println("getHighest");
        double[] arrIn = {1,2,3,4,5,6};
        double expResult = 6;
        double result = ArrayFunctions.getHighest(arrIn);
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testGetLowest() {
        System.out.println("getLowest");
        double[] arrIn = {1,2,3,4,5,0};
        double expResult = 0;
        double result = ArrayFunctions.getLowest(arrIn);
        assertEquals(expResult, result, 0.0);
        
    }

    
    
}
