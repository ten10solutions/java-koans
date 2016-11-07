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
    double questionFiveBlank;
    int questionSixBlank;
    int questionSevenBlank;
    String questionEightBlank;


    /*****************************************************************
     *1. A number can be simple
     *****************************************************************/
    public int simpleNumbers(){
        assert(
                questionOneBlank + 3 == 4
        );
        return questionOneBlank;
    }

    /*****************************************************************
     *2. A number can float
     *****************************************************************/
    public double numbersCanFloat(){
        assert(
               questionTwoBlank + 5 == 7.5
        );
            return questionTwoBlank;
    }

    /*****************************************************************
     *3. A number can be operated on
     *****************************************************************/
    public int numberOperators(){
        assert(
                (1+2)+(3+4)-(5+1) == questionThreeBlank
        );
        return questionThreeBlank;
    }

    /*****************************************************************
     *4. Not all operations have their usual mathematical symbols
     *****************************************************************/
    public int differentNumberOperators(){
        assert(
                (Math.pow(2,2))*(3*4)/(12/2) == questionFourBlank
        );
        return questionFourBlank;
    }

    /*****************************************************************
     *5. Remember Primary school when you didn't know about fractions?
     *****************************************************************/
    public double fractions(){
        assert(
                (5/ questionFiveBlank) == 2
        );
        return questionFiveBlank;
    }

    /*****************************************************************
     *6. We can get the remainder as well
     *****************************************************************/
    public int remainders(){
        assert(
                (7%3) == questionSixBlank
        );
        return questionSixBlank;
    }

    /*****************************************************************
     *7. We can't put a number in a string but we can make a number a string
     *****************************************************************/
    public String numberToString(){
        String imAString = "The number of floors in the building is ";
        imAString += Integer.toString(questionSevenBlank);
        return imAString;

    }

    /*****************************************************************
     *8. We can get the number from a string as well
     *****************************************************************/
    public String stringToNumber(){
        int iAmANumber = 2;
        assert(
                Integer.parseInt(questionEightBlank) * iAmANumber == 8
        );
        return questionEightBlank;
    }
}
