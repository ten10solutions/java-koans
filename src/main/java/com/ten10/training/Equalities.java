package com.ten10.training;

/**
 * Created by C0952235 on 30/09/2016.
 */


public class Equalities {



    Boolean BLANK;
    int BLANKint;

    /*****************************************************************
     *1. We shall contemplate truth by testing reality, via equality
     *****************************************************************/
    public Boolean testingEquality(){

        assert(


                BLANK == true

        );
        return true;
    }

    /*****************************************************************
     *2. We can determine difference as well as equality
     *****************************************************************/
    public Boolean testingReality(){
        assert(

                BLANK != true

        );
        return true;
    }

    /*****************************************************************
     *3. We can test the equality of nothing
     *****************************************************************/
    public Boolean equalityOfNothing(){
        assert(
                BLANK != null
        );
        return true;

    }

    /*****************************************************************
     *4. To understand reality, we must compare our expectations against reality
     *****************************************************************/
    public Boolean exectationsVsReality(){
        assert(
                BLANKint  == (1 + 2)
        );
        return true;
    }

    /*****************************************************************
     *5. You can test equality of many things
     *****************************************************************/
    public Boolean equalityOfManyThings(){
        assert(
                (3 + 4) ==  BLANKint  && BLANKint == (5 + 2)
        );
        return true;
    }

    /*****************************************************************
     *6. The question you ask determines the outcome
     *****************************************************************/
    public Boolean differentButSimilar(){
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        assert(
                a==b

        );
        return true;
    }

}
