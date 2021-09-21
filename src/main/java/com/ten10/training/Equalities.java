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
    public Boolean testingEquality() {
        return BLANK == true;
    }

    /*****************************************************************
     *2. We can determine difference as well as equality
     *****************************************************************/
    public Boolean testingReality() {
        return BLANK != true;
    }

    /*****************************************************************
     *3. We can test the equality of nothing
     *****************************************************************/
    public Boolean equalityOfNothing() {
        return BLANK != null;
    }

    /*****************************************************************
     *4. To understand reality, we must compare our expectations against reality
     *****************************************************************/
    public Boolean exectationsVsReality() {
        return BLANKint == (1 + 2);
    }

    /*****************************************************************
     *5. You can test equality of many things
     *****************************************************************/
    public Boolean equalityOfManyThings() {
        return (3 + 4) == BLANKint && BLANKint == (5 + 2);
    }

    /*****************************************************************
     *6. The question you ask determines the outcome
     *****************************************************************/
    public Boolean differentButSimilar() {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        return a == b;
    }

}
