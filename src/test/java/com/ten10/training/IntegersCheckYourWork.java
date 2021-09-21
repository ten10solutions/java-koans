package com.ten10.training;

import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by C0952235 on 02/10/2016.
 */
public class IntegersCheckYourWork {


    private final Integers numbers = new Integers();

    /*********************************************************************************************
     * DONT OPEN THIS FILE AS IT WILL BE LIKE OPENING ALL OF YOUR CHRISTMAS PRESENTS IN NOVEMBER
     *********************************************************************************************/


    @Test
    public void simpleNumbersTest() {
        try {
            numbers.simpleNumbers();
            assertEquals(1, numbers.questionOneBlank);
            System.out.print("Well Done!");
        } catch (AssertionError e) {
            System.out.print("Hmm, lets try that one again\n\n");
            fail();
        }
    }

    @Test
    public void numbersCanFloatTest() {
        try {
            numbers.numbersCanFloat();
            assertEquals(2.5, numbers.questionTwoBlank, 0.0001);
            System.out.print("Well Done!");
        } catch (AssertionError e) {
            System.out.print("Hmm, lets try that one again\n\n");
            fail();
        }
    }

    @Test
    public void numberOperatorsTest() {
        try {
            numbers.numberOperators();
            assertEquals(4, numbers.questionThreeBlank);
            System.out.print("Well Done!");
        } catch (AssertionError e) {
            System.out.print("Hmm, are you sure that's right?\n\n");
            fail();
        }
    }

    @Test
    public void differentNumberOperatorsTest() {
        try {
            numbers.differentNumberOperators();
            assertEquals(8, numbers.questionFourBlank);
            System.out.print("Well Done!");
        } catch (AssertionError e) {
            System.out.print("Hmm, are you sure that's right?\n\n");
            fail();
        }
    }

    @Test
    public void fractionsTest() {
        try {
            numbers.fractions();
            assertEquals(2, numbers.questionFourBlank);
            System.out.print("Well Done!");
        } catch (ArithmeticException | AssertionError e) {
            System.out.print("Hmm, are you sure that's right?\n\n");
            fail();
        }
    }

    @Test
    public void remaindersTest() {
        try {
            numbers.remainders();
            assertEquals(1, numbers.questionSixBlank);
            System.out.print("Well Done!");
        } catch (AssertionError e) {
            System.out.print("Hmm, are you sure that's right?\n\n");
            fail();
        }
    }

    @Test
    public void numberToStringTest() {
        Integers numbers = new Integers();
        try {
            assertEquals("The name name of the company is Ten10", numbers.numberToString());
            assertEquals(10, numbers.questionSevenBlank);
            System.out.print("Well Done!");
        } catch (AssertionError e) {
            System.out.print("Hmm, are you sure that's right?\n\n");
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void stringToNumberTest() {
        try {
            numbers.stringToNumber();
            assertEquals("4", numbers.questionEightBlank);
            System.out.print("Well Done!");
        } catch (NumberFormatException e) {
            System.out.print("Hmm, are you sure that's right?\n\n");
            fail();
        }
    }
}
