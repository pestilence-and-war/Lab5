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
public class HigherNumberTest {
    
    public HigherNumberTest() {
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
    public void testHigherNumbers() {
        System.out.println("higherNumbers");
        int inputNumber = 2;
        int[] numberList = {0,1,2,3,4,5,6,7,8,9};
        int expResult = 7;
        int result = HigherNumber.higherNumbers(inputNumber, numberList);
        assertEquals(expResult, result);
       
    }

     @Test
    public void testHigherNumbers2() {
        System.out.println("higherNumbers");
        int inputNumber = 500;
        int[] numberList = {1,2,3,566,334,232,700,65,22};
        int expResult = 2;
        int result = HigherNumber.higherNumbers(inputNumber, numberList);
        assertEquals(expResult, result);
       
    }
}
