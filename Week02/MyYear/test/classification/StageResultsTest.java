/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classification;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cgblairrains
 */
public class StageResultsTest {
    private StageResults empty; // will have no credits and no marks
    private StageResults full; // will have 120 credits and marks
    private StageResults halfFull; // will have 60 credits and some marks
    
    public StageResultsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        // empty - object that starts with default values
        empty = new StageResults();

        // full - object with 120 credits-worth of marks but no
        // initial stage2Average
        full = new StageResults();
        full.addModuleMark(120, 50.0);

        // halfFull - object with 60 credits worth of marks and
        // no initial stage2Average
         halfFull = new StageResults();
         halfFull.addModuleMark(60, 50.0); 
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetStage2Average() {
    }

    @Test
    public void testGetTotalCredits() {
    }

    @Test
    public void testGetTotalMarks() {
    }

    @Test
    public void testSetStage2Average() {
    }

    @Test
    public void testResetValues() {
        System.out.println("Testing Reset Values");

        // Set the state of the 'full' object to zeroes
        full.resetValues();

        // Set expected results
        int expIntResult = 0;
        double expDoubleResult = 0.0;

        // Now check each attribute to test that the reset has worked
        assertEquals("credits", expIntResult, full.getTotalCredits());
        assertEquals("total", expDoubleResult, full.getTotalMarks(), 0.0);

        // Put the 'full' object back to its original state
        full.addModuleMark(120, 50.0); 
    }

    @Test
    public void testAddModuleMark() {
        
        empty.resetValues();
        
        System.out.println("Testing Add Module Mark");
        
        assertFalse("empty object", empty.isComplete()); 
        
        int expIntCredits = 10;
        double expDoubleMark = 6;
        
        empty.addModuleMark(expIntCredits, 6);
        
        assertEquals("credits", expIntCredits, empty.getTotalCredits());
        assertEquals("total", expDoubleMark, empty.getTotalMarks(), 0.0);
    }

    @Test
    public void testCalculateAverageSoFar() {
        fail("Test not yet implemented");
    }

    @Test
    public void testPredictClass() {
        fail("Test not yet implemented");
    }
    @Test
    public void testIsComplete() {
        System.out.println("Testing is Complete");

        // Check that the empty object is 'not complete'
        assertFalse("empty object", empty.isComplete()); 
        assertFalse("halfFull object", halfFull.isComplete()); 
        assertTrue("full object", full.isComplete()); 
    }
}
