package com.ten10.training;

/**
 * Created by Jack Forman on 02/10/2016.
 */
public class Integers {

    /************************************************************************************
     * Change the following values only, you will not need to edit any of the code itself
     ************************************************************************************/

    int questionOneBlank;
    double questionTwoBlank;
    int questionThreeBlank;
    int questionFourBlank;
    int questionFiveBlank;
    int questionSixBlank;
    int questionSevenBlank;
    String questionEightBlank;


    /*****************************************************************
     *1. A number can be simple
     *****************************************************************/
    public void simpleNumbers() {
        assert (
                questionOneBlank + 3 == 4
        );
    }

    /*****************************************************************
     *2. A number can float
     *****************************************************************/
    public void numbersCanFloat() {
        assert (
                questionTwoBlank + 5 == 7.5
        );
    }

    /*****************************************************************
     *3. A number can be operated on
     *****************************************************************/
    public void numberOperators() {
        assert (
                (1 + 2) + (3 + 4) - (5 + 1) == questionThreeBlank
        );
    }

    /*****************************************************************
     *4. Not all operations have their usual mathematical symbols
     *****************************************************************/
    public void differentNumberOperators() {
        assert (
                (Math.pow(2, 2)) * (3 * 4) / (12 / 2) == questionFourBlank
        );
    }

    /*****************************************************************
     *5. Remember Primary school when you didn't know about fractions?
     *****************************************************************/
    public void fractions() {
        assert (
                (5 / questionFiveBlank) == 2
        );
    }

    /*****************************************************************
     *6. We can get the remainder as well
     *****************************************************************/
    public void remainders() {
        assert (
                (7 % 3) == questionSixBlank
        );
    }

    /*****************************************************************
     *7. We can convert an integer to a string
     *****************************************************************/
    public String numberToString() {
        String imAString = "The name name of the company is Ten";
        imAString += Integer.toString(questionSevenBlank);
        return imAString;
    }

    /*****************************************************************
     *8. We can read a number out of a String well
     *****************************************************************/
    public void stringToNumber() {
        int iAmANumber = 2;
        assert (
                Integer.parseInt(questionEightBlank) * iAmANumber == 8
        );
    }
}
