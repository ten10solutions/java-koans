package test;

/**
 * Created by C0952235 on 30/09/2016.
 */

import com.sun.istack.internal.NotNull;
import main.MyUnit;
import org.junit.Ignore;
import org.junit.Test;
import org.omg.CORBA.OBJ_ADAPTER;
import org.omg.CORBA.Object;
import main.Equalities;
import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.*;
public class equalities {



    Boolean BLANK;
    int BLANKint;

//  1. We shall contemplate truth by testing reality, via equality
    @Test
    public void testingEquality(){
        Equalities eq = new Equalities();
        try {
            assertTrue(eq.testingEquality());
            System.out.print("Yep, Well done true does equal true");
        } catch (NullPointerException e){
            System.out.print("Nope, try removing changing the BLANK for the boolean that will balance the equation");
            fail();
        }
    }

//  2. We can determine difference as well as equality
    @Test
    public void testingReality(){
        assert(

                BLANK != true
        );
    }
//  3. We can test the equality of nothing
    @Test
    public void equalityOfNothing(){
        assert(
                BLANK == null
        );

    }
//  4. To understand reality, we must compare our expectations against reality
    @Test
    public void exectationsVsReality(){
        assert(
               BLANKint  == (1 + 2)
        );

    }

//  5. You can test equality of many things
    @Test
    public void equalityOfManyThings(){
        assert(
                (3 + 4) ==  BLANKint  && BLANKint == (5 + 2)
        );

    }

// 6. The question you ask determines the outcome
    @Test
    public void differentButSimilar(){
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        assert (
                a == b
                );
    }

}
