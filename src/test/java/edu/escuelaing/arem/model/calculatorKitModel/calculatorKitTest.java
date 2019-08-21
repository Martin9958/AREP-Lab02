package edu.escuelaing.arem.model.calculatorKitModel;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test calculator kit class
 * @author Martin Cantor (andres.cantor-u@mail.escuelaing.edu.co)
 * @version 1.0
 */
public class calculatorKitTest{

    calculatorKit calculatorKitA;
    calculatorKit calculatorKitB;

    @Before
    public void init(){
        calculatorKitA = new calculatorKit("./src/test/resources/columna1.txt");
        calculatorKitB = new calculatorKit("./src/test/resources/columna2.txt");
    }

    /**
     * Test the {@linkplain calculatorKit} method to calculate the mean given a set of
     * n real numbers in a file
     */
    @Test
    public void testCalculateMean() {
        Assert.assertEquals(550.6,calculatorKitA.calculateMean(),2);
        Assert.assertEquals(60.32,calculatorKitB.calculateMean(),2);
    }

    /**
     * Test the {@linkplain calculatorKit} method to calculate the standard deviation  set of
     * n real numbers in a file
     */
    @Test
    public void testCalculateStdDesviation() {
        Assert.assertEquals(572.03,calculatorKitA.calculateStdDeviation(),2);
        Assert.assertEquals(60.26,calculatorKitB.calculateStdDeviation(),2);
    }

}