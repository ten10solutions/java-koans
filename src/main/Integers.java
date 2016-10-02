package main;

/**
 * Created by Jack Forman on 02/10/2016.
 */
public class Integers {

    int QUESTION_ONE_BLANK;
    double QUESTION_TWO_BLANK;
    int QUESTION_THREE_BLANK;
    int QUESTION_FOUR_BLANK;
    double QUESTION_FIVE_BLANK;
    int QUESTION_SIX_BLANK;
    int QUESTION_SEVEN_BLANK;
    String QUESTION_EIGHT_BLANK;


//  1. A number can be simple
    public int simpleNumbers(){
        assert(
                QUESTION_ONE_BLANK + 3 == 4
        );
        return QUESTION_ONE_BLANK;
    }

//  2. A number can float
    public double numbersCanFloat(){
        assert(
               QUESTION_TWO_BLANK + 5 == 7.5
        );
            return QUESTION_TWO_BLANK;
    }

//  3. A number can be operated on
    public int numberOperators(){
        assert(
                (1+2)+(3+4)-(5+1) == QUESTION_THREE_BLANK
        );
        return QUESTION_THREE_BLANK;
    }

//  4. Not all operations have their usual mathematical symbols
    public int differentNumberOperators(){
        assert(
                (Math.pow(2,2))*(3*4)/(12/2) == QUESTION_FOUR_BLANK
        );
        return QUESTION_FOUR_BLANK;
    }

// 5. Remember Primary school when you didn't know about fractions?
    public double fractions(){
        assert(
                (5/QUESTION_FIVE_BLANK) == 2
        );
        return QUESTION_FIVE_BLANK;
    }

//  6. We can get the remainder as well
    public int remainders(){
        assert(
                (7%3) == QUESTION_SIX_BLANK
        );
        return QUESTION_SIX_BLANK;
    }

//  7. We can't put a number in a string but we can make a number a string
    public String numberToString(){
        String imAString = "The number of floors in the building is ";
        imAString += Integer.toString(QUESTION_SEVEN_BLANK);
        return imAString;

    }

//  8. We can get the number from a string as well
    public String stringToNumber(){
        int iAmANumber = 2;
        assert(
                Integer.parseInt(QUESTION_EIGHT_BLANK) * iAmANumber == 8
        );
        return QUESTION_EIGHT_BLANK;
    }
}
