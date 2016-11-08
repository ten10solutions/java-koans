package com.ten10.tests; /**
 * Created by C0952235 on 30/09/2016.
 */

import com.ten10.training.Equalities;
import org.junit.Test;

import static org.junit.Assert.*;
public class EqualitiesCheckYourWork {









    /*********************************************************************************************
     * DONT OPEN THIS FILE AS IT WILL BE LIKE OPENING ALL OF YOUR CHRISTMAS PRESENTS IN NOVEMBER
     *********************************************************************************************/


























    Boolean BLANK;
    int BLANKint;

//  1. We shall contemplate truth by testing reality, via equality
    @Test
    public void testingEquality(){
        Equalities eq = new Equalities();
        try {
            assertTrue("message",eq.testingEquality());
            System.out.print("Yep, Well done true does equal true");
        } catch (NullPointerException e){
            System.out.print("Nope, try removing changing the BLANK for the boolean that will balance the equation\n\n");
            fail();
        }
    }

//  2. We can determine difference as well as equality
    @Test
    public void testingReality(){
        Equalities eq = new Equalities();
        try {
            assertTrue(eq.testingReality());
            System.out.print("Yep, Well done false is not equal to true");
        } catch (NullPointerException e){
            System.out.print("Hmm, try thinking of another Boolean which doesnt equal true\n\n");
            fail();
        }
    }
//  3. We can test the equality of nothing
    @Test
    public void equalityOfNothing(){
        Equalities eq = new Equalities();
        try {
            assertTrue(eq.equalityOfNothing());
            System.out.print("Yep, Well done BLANK IS equal to null\n\n");
        } catch (AssertionError e){
            System.out.print("Don't Panic!\nThis one takes a bit of thought\nAre you sure BLANK isn't equal to Null?\nDo you need to change the BLANK to make this pass or something else?\n");
            fail();
        }

    }
//  4. To understand reality, we must compare our expectations against reality
    @Test
    public void exectationsVsReality(){
        Equalities eq = new Equalities();
        try {
            assertTrue(eq.exectationsVsReality());
            System.out.print("Well Done!\n\n");
        } catch (AssertionError e){
            System.out.print("Equations must be equal on either side of the == symbol.\nSo what do you need to replace BLANKint with\n\n");
            fail();
        }

    }

//  5. You can test equality of many things
    @Test
    public void equalityOfManyThings(){
        Equalities eq = new Equalities();
        try {
            assertTrue(eq.equalityOfManyThings());
            System.out.print("Well Done!\n\n");
        } catch (AssertionError e){
            System.out.print("Equations must be equal on either side of the == symbol.\nSo what do you need to replace both BLANKints with\n\n");
            fail();
        }

    }

// 6. The question you ask determines the outcome
    @Test
    public void differentButSimilar() {
        Equalities eq = new Equalities();
        try {
            assertTrue(eq.differentButSimilar());
            System.out.print("Well Done!, That's a tricky one\n\n");
        } catch (AssertionError e) {
            System.out.print("Are you sure you can use == to compare arrays in JAVA?\nMaybe check Google agrees?\n");
            fail();
        }
    }

}
