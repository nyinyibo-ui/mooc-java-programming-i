/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexe
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CaclulatorTest {
    @Test
    public void calculatorInitialValueZero(){
        Calculator calculator=new Calculator();
        assertEquals(0,calculator.getValue());
    }
    
    @Test
    public void valueWhenFiveAdded(){
        Calculator calculator=new Calculator();
        calculator.add(5);
        assertEquals(5,calculator.getValue());
    }
    @Test
    public void valueWhenFiveSubtracted(){
        Calculator calculator=new Calculator();
        calculator.substract(5);
        assertEquals(-5,calculator.getValue());
    }
    
}
